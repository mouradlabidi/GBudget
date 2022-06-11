package com.example.gbudget;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Home extends AppCompatActivity {
    BottomNavigationView bntv;
   HomeFragment homeFragment = new HomeFragment();
   CategoryFragment categoryFragment = new CategoryFragment();
   ReportFragment reportFragment = new ReportFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
       bntv=(BottomNavigationView) findViewById(R.id.bottomNavigationView);
       getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();
       bntv.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(MenuItem item) {
               switch (item.getItemId()){
                   case R.id.homep:
                       getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();
                       return true;
                   case R.id.report:
                       getSupportFragmentManager().beginTransaction().replace(R.id.container,reportFragment).commit();
                       return true;
                   case R.id.category:
                       getSupportFragmentManager().beginTransaction().replace(R.id.container,categoryFragment).commit();
                       return true;
               }

               return false;
           }
       });

}
}