package com.alvinayp.emountain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void Info1(View view) {
        Intent info1 = new Intent(HomeActivity.this, Info1Activity.class);
        startActivity(info1);
    }

    public void Info2(View view) {
        Intent info2 = new Intent(HomeActivity.this, Info2Activity.class);
        startActivity(info2);
    }

    public void Info3(View view) {
        Intent info3 = new Intent(HomeActivity.this, Info3Activity.class);
        startActivity(info3);
    }

    public void Info4(View view) {
        Intent info4 = new Intent(HomeActivity.this, Info4Activity.class);
        startActivity(info4);
    }

    public void Info5(View view) {
        Intent info5 = new Intent(HomeActivity.this, Info5Activity.class);
        startActivity(info5);
    }
}
