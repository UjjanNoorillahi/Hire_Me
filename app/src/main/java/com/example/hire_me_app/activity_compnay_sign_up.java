package com.example.hire_me_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activity_compnay_sign_up extends AppCompatActivity {


    private EditText txt_FirstName, txt_email, txt_website, txt_password, txt_confirm_password;
    private TextView login;
    Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compnay_sign_up);

        txt_FirstName = findViewById(R.id.companyName);
        txt_email = findViewById(R.id.companyEmail);
        txt_website = findViewById(R.id.companyWebsite);
        txt_password = findViewById(R.id.inputPassword);
        txt_confirm_password = findViewById(R.id.confirmPassword);
        login =  findViewById(R.id.login);
        btnSignUp = findViewById(R.id.btnSignUp);


        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);

                    Toast.makeText(getApplicationContext(), "SignUp Successfully", Toast.LENGTH_SHORT).show();
//
//                    txt_FirstName.getText().clear();
//                    txt_email.getText().clear();
//                    txt_website.getText().clear();
//                    txt_password.getText().clear();
//                    txt_confirm_password.getText().clear();
                }
            //}
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), activity_company_login.class);
                startActivity(intent);
            }
        });

    }
}