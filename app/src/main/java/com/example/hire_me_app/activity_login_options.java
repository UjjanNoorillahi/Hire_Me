package com.example.hire_me_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_login_options extends AppCompatActivity {


    Button userLogIn, companyLogIn;
    TextView userSignUp, companySignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_options);

        userLogIn = (Button) findViewById(R.id.btnUserLogin);
        companyLogIn = (Button) findViewById(R.id.btnCompanyLogin);


        userSignUp = (TextView) findViewById(R.id.user_signUp);
        companySignUp = (TextView) findViewById(R.id.company_signUp);


        // Open User Login Activity
        userLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Activity_user_login.class);
                startActivity(intent);
            }
        });

        //Open Company Login Activity
        companyLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), activity_company_login.class);
                startActivity(intent);
            }
        });



        //Sign Up User Account
        userSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Activity_user_signUP.class);
                startActivity(intent);
            }
        });

        //Sign Up Company Account
        companySignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), activity_compnay_sign_up.class);
                startActivity(intent);
            }
        });


    }
}