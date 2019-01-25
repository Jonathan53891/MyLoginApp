package com.itexps.app.myloginapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
   // private Button login;
    private EditText etName;
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick (View view){
        //login=(Button)findViewById(R.id.btnLogin);
        etName=(EditText)findViewById(R.id.txtUsername);
        //etName=(EditText )findViewById(R.id.txtUsername);
        username=etName.getText().toString();

        Intent intent= new Intent (  MainActivity.this,WelcomeActivity.class);
        intent.putExtra ( "username",username);
        startActivityForResult(intent, 44);
    }
}
