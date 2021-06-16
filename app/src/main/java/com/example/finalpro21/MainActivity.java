package com.example.finalpro21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.finalpro21.screensFragments.history;
import com.example.finalpro21.screensFragments.home;
import com.example.finalpro21.screensFragments.places;
import com.example.finalpro21.screensFragments.religiousStatus;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, new home()).commit();
        final BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNav);


        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.navHome:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, new home()).commit();

                    break;
                case R.id.navhistory:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, new history()).commit();
                    break;
                case R.id.navreligious:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, new religiousStatus()).commit();
                    break;
                case R.id.navPlaces:
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, new places()).commit();
                    break;

            }
            return true;
        });
    }
}