package com.intprog.araneta_midtermexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Contacts extends AppCompatActivity {

    Button archive1, archive2, archive3, archive4, archive5;
    private static final int[] REQUEST_ARCHIVES = {1, 2, 3, 4, 5};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        archive1 = findViewById(R.id.btn1);
        archive2 = findViewById(R.id.btn2);
        archive3 = findViewById(R.id.btn3);
        archive4 = findViewById(R.id.btn4);
        archive5 = findViewById(R.id.btn5);

        archive1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView nameTextView = findViewById(R.id.first_name);
                TextView phoneTextView = findViewById(R.id.first_phone);

                String name = nameTextView.getText().toString();
                String phone = phoneTextView.getText().toString();

                Intent toArchive = new Intent(Contacts.this, Archive.class);
                toArchive.putExtra("Name", name);
                toArchive.putExtra("Number", phone);

                startActivityForResult(toArchive, REQUEST_ARCHIVES [0]);
            }
        });

        archive2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView nameTextView = findViewById(R.id.sec_name);
                TextView phoneTextView = findViewById(R.id.sec_phone);

                String name = nameTextView.getText().toString();
                String phone = phoneTextView.getText().toString();

                Intent toArchive = new Intent(Contacts.this, Archive.class);
                toArchive.putExtra("Name2", name);
                toArchive.putExtra("Number2", phone);

                startActivityForResult(toArchive, REQUEST_ARCHIVES [1]);
            }
        });

        archive3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView nameTextView = findViewById(R.id.th_name);
                TextView phoneTextView = findViewById(R.id.th_phone);

                String name = nameTextView.getText().toString();
                String phone = phoneTextView.getText().toString();

                Intent toArchive = new Intent(Contacts.this, Archive.class);
                toArchive.putExtra("Name3", name);
                toArchive.putExtra("Number3", phone);

                startActivityForResult(toArchive, REQUEST_ARCHIVES [2]);
            }
        });

        archive4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView nameTextView = findViewById(R.id.fo_name);
                TextView phoneTextView = findViewById(R.id.fo_phone);

                String name = nameTextView.getText().toString();
                String phone = phoneTextView.getText().toString();

                Intent toArchive = new Intent(Contacts.this, Archive.class);
                toArchive.putExtra("Name4", name);
                toArchive.putExtra("Number4", phone);

                startActivityForResult(toArchive, REQUEST_ARCHIVES [3]);
            }
        });

        archive5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView nameTextView = findViewById(R.id.fi_name);
                TextView phoneTextView = findViewById(R.id.fi_phone);

                String name = nameTextView.getText().toString();
                String phone = phoneTextView.getText().toString();

                Intent toArchive = new Intent(Contacts.this, Archive.class);
                toArchive.putExtra("Name5", name);
                toArchive.putExtra("Number5", phone);

                startActivityForResult(toArchive, REQUEST_ARCHIVES [4]);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && data != null) {
            if (requestCode == REQUEST_ARCHIVES [0]) {

            } else if (requestCode == REQUEST_ARCHIVES [1]) {

            } else if (requestCode == REQUEST_ARCHIVES [2]) {

            } else if (requestCode == REQUEST_ARCHIVES [3]) {

            } else if (requestCode == REQUEST_ARCHIVES [4]) {

            }
        }
    }
}




