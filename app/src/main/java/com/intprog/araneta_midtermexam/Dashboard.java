package com.intprog.araneta_midtermexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {

    Button toContact, toArch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        toContact = findViewById(R.id.toContacts);
        toArch = findViewById(R.id.toArchive);


        toContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toContacts = new Intent(Dashboard.this, Contacts.class);
                startActivity(toContacts);
            }
        });

        toArch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toArchive = new Intent(Dashboard.this, Archive.class);
                startActivity(toArchive);
            }
        });
    }
}