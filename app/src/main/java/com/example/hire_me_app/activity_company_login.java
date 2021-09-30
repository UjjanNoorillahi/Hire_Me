package com.example.hire_me_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity_company_login extends AppCompatActivity {

    private EditText inputEmail, inputPassword;
    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_login);

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


    private void openActivity_login() {


       String email = inputEmail.getText().toString();
       String pass = inputPassword.getText().toString();


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


