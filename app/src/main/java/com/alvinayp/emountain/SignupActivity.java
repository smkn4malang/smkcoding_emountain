package com.alvinayp.emountain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void Home1(View view) {
        Intent home1 = new Intent(SignupActivity.this, HomeActivity.class);
        startActivity(home1);
    }

    public void Login1(View view) {
        Intent login1 = new Intent(SignupActivity.this, LoginActivity.class);
        startActivity(login1);
    }
}
