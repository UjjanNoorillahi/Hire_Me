package com.example.hire_me_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Activity_task_done extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_done);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.menu_task_done);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.menu_home:
                        startActivity(new Intent(getApplicationContext()
                                ,      MainActivity.class) );
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.menu_call:
                        startActivity(new Intent (getApplicationContext()
                                ,     activity_chat.class) );
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.menu_comm:
                        startActivity(new Intent (getApplicationContext()
                                ,    Activity_user_login.class) );
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.menu_task_done:

                        return true;
                }
                return false;
            }
        });
    }


}