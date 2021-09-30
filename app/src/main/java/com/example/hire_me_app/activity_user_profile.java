package com.example.hire_me_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class activity_user_profile extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Button btnSubmit;
    private EditText txt_fullName, txt_mobile,  txt_address;



    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

//        getSupportActionBar().setTitle("Edit user profile");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

         spinner = findViewById(R.id.typeSpinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.education_spinner, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        //ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
          //      R.array.education_spinner, android.R.layout.simple_spinner_item);

//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter );
        spinner.setOnItemSelectedListener(this);




        //DATA INPUT
        btnSubmit = findViewById(R.id.btn_company_record_submit);

        txt_fullName = (EditText) findViewById(R.id.userName);
        txt_mobile = (EditText) findViewById(R.id.phoneNumber);
        spinner = (Spinner) findViewById(R.id.typeSpinner);
        txt_address = (EditText)findViewById(R.id.address);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                if((txt_fullName.getText().toString().isEmpty()) ||
//                        (txt_mobile.getText().toString().isEmpty()) ||
//                        (txt_address.getText().toString().isEmpty())){
//
//                    Toast.makeText(activity_user_profile.this,"Please fill all the fields" , Toast.LENGTH_SHORT).show();
//                }
//
//                else {

                    Intent intent = new Intent(activity_user_profile.this,MainActivity.class);
                    startActivity(intent);

                    Toast.makeText(getApplicationContext(), "Profile Updated Successfully", Toast.LENGTH_SHORT).show();
               // }
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
//        String text = parent.getItemAtPosition(i).toString();
//        Toast.makeText(parent.getContext(), text , Toast.LENGTH_SHORT).show();

        Spinner spinner = (Spinner) findViewById(R.id.typeSpinner);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
       //Toast.makeText(adapterView.getContext(), "Not Selected" , Toast.LENGTH_SHORT).show();
    }
}