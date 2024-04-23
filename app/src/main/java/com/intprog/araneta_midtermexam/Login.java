package com.intprog.araneta_midtermexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class Login extends AppCompatActivity {

    public static final String userName = "bonk";
    public static final String userPass = "alvin123";

    EditText usertxt, passtxt;
    Button toDash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usertxt = findViewById(R.id.user);
        passtxt = findViewById(R.id.pass);
        toDash = findViewById(R.id.clickbtn);

        toDash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inUser = usertxt.getText().toString();
                String inPass = passtxt.getText().toString();

                if(inUser.equals(userName) && inPass.equals(userPass)) {
                    Intent toDash = new Intent(Login.this,Dashboard.class);
                    startActivity(toDash);
                }else {
                    if (!inUser.equals(userName)) {
                        Snackbar.make(view, "Invalid Credentials, please try again", Snackbar.LENGTH_LONG).show();
                    } else {
                        Snackbar.make(view, "Invalid Credentials, please try again", Snackbar.LENGTH_LONG).show();
                    }
                }
            }

        });

    }
}