package com.alvinayp.emountain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Signup(View view) {
        Intent signup = new Intent(LoginActivity.this, SignupActivity.class);
        startActivity(signup);
    }

    public void Home(View view) {
        Intent home = new Intent(LoginActivity.this, HomeActivity.class);
        startActivity(home);
    }
}
