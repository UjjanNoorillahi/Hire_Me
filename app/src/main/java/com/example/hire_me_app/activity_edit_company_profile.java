package com.example.hire_me_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class activity_edit_company_profile extends AppCompatActivity {


    private Button btnSubmit;
    private EditText companyName, website,  phone , foundedYear;
    private Spinner companyType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_edit_company_profile);

        btnSubmit = findViewById(R.id.btn_company_record_submit);

        companyName = (EditText) findViewById(R.id.companyName);
        website = (EditText) findViewById(R.id.website);
        phone = (EditText) findViewById(R.id.phoneNumber);
        foundedYear = (EditText)findViewById(R.id.address);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(), "Profile Updated Successfully", Toast.LENGTH_SHORT).show();
                // }
            }
        });
    }
}