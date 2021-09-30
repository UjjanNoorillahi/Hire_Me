   package com.example.hire_me_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener;



   public class MainActivity extends AppCompatActivity {


       private ImageView attempt_test, learn, find_job, edit_profile;


//    private Button loginBtn;
//    private EditText inputEmail, inputPassword;
//
//       String email;
//       String pass;


       @Override
       public boolean onCreateOptionsMenu(Menu menu) {

           MenuInflater inflater = getMenuInflater();
           inflater.inflate(R.menu.logout_menu, menu);
           return true;

       }

       //Open Welcome Activity
       @Override
       protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_dashboard);

//        Intent intent = new Intent(this, activity_login_options.class);
//        startActivity(intent);


           BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
           bottomNavigationView.setSelectedItemId(R.id.menu_home);

           bottomNavigationView.setOnItemSelectedListener(new OnItemSelectedListener() {
               @Override
               public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                   switch (item.getItemId()) {

                       case R.id.menu_home:

                           return true;

                       case R.id.menu_task_done:
                           startActivity(new Intent(getApplicationContext()
                                   , Activity_task_done.class));
                           overridePendingTransition(0, 0);
                           return true;

                       case R.id.menu_call:
                           startActivity(new Intent(getApplicationContext()
                                   , activity_chat.class));
                           overridePendingTransition(0, 0);
                           return true;

                       case R.id.menu_comm:
                           startActivity(new Intent(getApplicationContext()
                                   , Activity_user_login.class));
                           overridePendingTransition(0, 0);
                           return true;
                   }
                   return false;
               }
           });

           attempt_test = (ImageView) findViewById(R.id.attemptTest);
           learn = (ImageView) findViewById(R.id.learn);
           find_job = (ImageView) findViewById(R.id.find_job);
           edit_profile = (ImageView) findViewById(R.id.edit_profile);


           attempt_test.setClickable(true);
           attempt_test.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent = new Intent(getApplicationContext(), activity_attempt_test.class);
                   startActivity(intent);
               }
           });

           learn.setClickable(true);
           learn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent = new Intent(getApplicationContext(), activity_learn.class);
                   startActivity(intent);
               }
           });

           find_job.setClickable(true);
           find_job.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent = new Intent(getApplicationContext(), activity_find_job.class);
                   startActivity(intent);
               }
           });

           edit_profile.setClickable(true);
           edit_profile.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Intent intent = new Intent(getApplicationContext(), activity_user_profile.class);
                   startActivity(intent);
               }
           });


       }
   }
