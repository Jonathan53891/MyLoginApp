package com.itexps.app.myloginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        String username=getIntent().getStringExtra( "username");
        EditText txtName=(EditText) findViewById(R.id.edtUsername);
        txtName.setText(username);
    }
}
