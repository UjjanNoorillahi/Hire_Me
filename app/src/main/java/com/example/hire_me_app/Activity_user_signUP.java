package com.example.hire_me_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_user_signUP extends AppCompatActivity {

    private EditText txt_FirstName, txt_lastName, txt_email, txt_password, txt_confirm_password;
     Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnSignUp = findViewById(R.id.btnSignUp);

        txt_FirstName = findViewById(R.id.inputFirstName);
        txt_lastName = findViewById(R.id.companyEmail);
        txt_email = findViewById(R.id.companyWebsite);
        txt_password = findViewById(R.id.inputPassword);
        txt_confirm_password = findViewById(R.id.confirmPassword);






            btnSignUp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if((txt_FirstName.getText().toString().isEmpty()) ||
                            (txt_lastName.getText().toString().isEmpty()) ||
                            (txt_email.getText().toString().isEmpty()) ||
                            (txt_password.getText().toString().isEmpty()) ||
                            (txt_confirm_password.getText().toString().isEmpty())){


                        Toast.makeText(getApplicationContext(),"Please fill all the fields" , Toast.LENGTH_SHORT).show();
                    }

                    else {

                    Intent intent = new Intent(getApplicationContext(),activity_user_profile.class);
                    startActivity(intent);

                        Toast.makeText(getApplicationContext(), "SignUp Successfully", Toast.LENGTH_SHORT).show();

                        txt_FirstName.getText().clear();
                        txt_lastName.getText().clear();
                        txt_email.getText().clear();
                        txt_password.getText().clear();
                        txt_confirm_password.getText().clear();

                }





        }
            });


    }
}
