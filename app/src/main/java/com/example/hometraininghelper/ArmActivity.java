package com.example.hometraininghelper;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class ArmActivity extends Activity implements NavigationView.OnNavigationItemSelectedListener{

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    Button btn_arm_easy_body;
    Button btn_arm_easy_home;
    Button btn_arm_nor_body;
    Button btn_arm_nor_home;
    Button btn_arm_hard_body;
    Button btn_arm_hard_home;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arm);

        drawerLayout=findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.design_navigation_view);
        toolbar=findViewById(R.id.toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.naviagtion_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

        btn_arm_easy_body = findViewById(R.id.btn_arm_easy_body); // 팔 초급 맨몸

        btn_arm_easy_body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ArmEasyActivity.class);
                startActivity(intent);
            }
        });

        btn_arm_easy_home = findViewById(R.id.btn_arm_easy_home); // 팔 초급 기구

        btn_arm_easy_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ArmEasyActivityHome.class);
                startActivity(intent);
            }
        });

        btn_arm_nor_body = findViewById(R.id.btn_arm_nor_body); // 팔 중급 맨몸

        btn_arm_nor_body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ArmNorActivity.class);
                startActivity(intent);
            }
        });

        btn_arm_nor_home = findViewById(R.id.btn_arm_nor_home); // 팔 중급 기구

        btn_arm_nor_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ArmNorActivityHome.class);
                startActivity(intent);
            }
        });

        btn_arm_hard_body = findViewById(R.id.btn_arm_hard_body); // 팔 고급 맨몸

        btn_arm_hard_body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ArmHardActivity.class);
                startActivity(intent);
            }
        });


        btn_arm_hard_home = findViewById(R.id.btn_arm_hard_home); // 복근 고급 기구

        btn_arm_hard_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ArmHardActivityHome.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_search:
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/c/LeapFitnessOfficial"));
                startActivity(intent);
                break;
            case R.id.nav_shoulder:
                Intent intent1 = new Intent(getApplicationContext(),ShoulderActivity.class);
                startActivity(intent1);
                break;
            case R.id.nav_arm:
                Intent intent2 = new Intent(getApplicationContext(),ArmActivity.class);
                startActivity(intent2);
                break;
            case R.id.nav_chest:
                Intent intent3 = new Intent(getApplicationContext(),ChestActivity.class);
                startActivity(intent3);
                break;
            case R.id.nav_abodminal_muscles:
                Intent intent4 = new Intent(getApplicationContext(),AbsActivity.class);
                startActivity(intent4);
                break;
            case R.id.nav_leg:
                Intent intent5 = new Intent(getApplicationContext(),LegActivity.class);
                startActivity(intent5);
                break;
            case R.id.nav_stretching:
                Intent intent6 = new Intent(getApplicationContext(),StretchActivity.class);
                startActivity(intent6);
                break;
            case R.id.nav_login:
                Intent intent7 = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent7);
                break;
            case R.id.nav_profile:
                Intent intent8 = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(intent8);
                break;
        }
        DrawerLayout drawerLayout
                = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }
}
