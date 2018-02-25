package com.example.android.adhitya_1202150103_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText user;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = (EditText)findViewById(R.id.username);
        pass = (EditText)findViewById(R.id.password);

    }

    public void Login(View view) {
        String userL = user.getText().toString();
        String passL = pass.getText().toString();

        if(userL.equals("EAD") && passL.equals("MOBILE")){
            Toast.makeText(this,"Username & Password Benar \nLogin Sukses",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, listMinuman.class));
        }
        else {
            Toast.makeText(this, "Username atau Password Salah\nLogin Failed", Toast.LENGTH_SHORT).show();
        }

    }
}
