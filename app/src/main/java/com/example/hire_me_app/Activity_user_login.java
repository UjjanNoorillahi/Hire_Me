package com.example.hire_me_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_user_login extends AppCompatActivity {

    // for close the app

    private  long pressBack;
    private Toast backToast;

    private Button loginBtn;
    private EditText inputEmail, inputPassword;

       String email;
       String pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


                inputEmail = findViewById(R.id.companyWebsite);
        inputPassword = findViewById(R.id.inputPassword);



        loginBtn = findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                openActivity_login();


            }
        });
    }



    @Override
    public void onBackPressed() {

        if(pressBack + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            finishAffinity();
            return;
        }else{
            backToast = Toast.makeText(this,"Press back again to exit" , Toast.LENGTH_SHORT);
            backToast.show();
        }
        pressBack = System.currentTimeMillis();



       // finish();

    }

    public void openActivity_login(){


         email = inputEmail.getText().toString();
         pass = inputPassword.getText().toString();


            if((email.equals("ujjannoorillahi@gmail.com"))&&(pass.equals("pass123"))) {

                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(this,"Login Successfully" , Toast.LENGTH_SHORT).show();

               inputEmail.getText().clear();
               inputPassword.getText().clear();
            }

            else if((email.isEmpty() && (pass.isEmpty()))) {

                Toast.makeText(this, "Please, enter Email and Password", Toast.LENGTH_SHORT).show();
            }

            else if(email.isEmpty()){

                Toast.makeText(this, "Please, enter email", Toast.LENGTH_SHORT).show();
            }

            else if(pass.isEmpty()){

                Toast.makeText(this, "Please, enter password", Toast.LENGTH_SHORT).show();
            }

                else {
                        Toast.makeText(this, "Wrong Credentials Try Again... ", Toast.LENGTH_SHORT).show();

                }
            }
}

