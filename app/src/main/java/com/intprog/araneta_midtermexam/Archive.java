package com.intprog.araneta_midtermexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Archive extends AppCompatActivity {

    TextView arch_name, arch_phone, arch_name2, arch_phone2 ,arch_name3, arch_phone3, arch_name4, arch_phone4, arch_name5, arch_phone5;
    Button addToContactsButton, addToContactsButton2, addToContactsButton3, addToContactsButton4, addToContactsButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archive);

        arch_name = findViewById(R.id.first_archname);
        arch_phone = findViewById(R.id.first_archphone);
        addToContactsButton = findViewById(R.id.btn1);

        arch_name2 = findViewById(R.id.sec_archname);
        arch_phone2 = findViewById(R.id.sec_archphone);
        addToContactsButton2 = findViewById(R.id.btn2);

        arch_name3 = findViewById(R.id.th_archname);
        arch_phone3 = findViewById(R.id.th_archphone);
        addToContactsButton3 = findViewById(R.id.btn3);

        arch_name4 = findViewById(R.id.fo_archname);
        arch_phone4 = findViewById(R.id.fo_archphone);
        addToContactsButton4 = findViewById(R.id.btn4);

        arch_name5 = findViewById(R.id.fi_archname);
        arch_phone5 = findViewById(R.id.fi_archphone);
        addToContactsButton5 = findViewById(R.id.btn5);

        String name = getIntent().getStringExtra("Name");
        String phone = getIntent().getStringExtra("Number");

        String name2 = getIntent().getStringExtra("Name2");
        String phone2 = getIntent().getStringExtra("Number2");

        String name3 = getIntent().getStringExtra("Name3");
        String phone3 = getIntent().getStringExtra("Number3");

        String name4 = getIntent().getStringExtra("Name4");
        String phone4 = getIntent().getStringExtra("Number4");

        String name5 = getIntent().getStringExtra("Name5");
        String phone5 = getIntent().getStringExtra("Number5");

        arch_name.setText(name);
        arch_phone.setText(phone);

        arch_name2.setText(name2);
        arch_phone2.setText(phone2);

        arch_name3.setText(name3);
        arch_phone3.setText(phone3);

        arch_name4.setText(name4);
        arch_phone4.setText(phone4);

        arch_name5.setText(name5);
        arch_phone5.setText(phone5);

        if (name != null && !name.isEmpty() && phone != null && !phone.isEmpty()) {
            addToContactsButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = arch_name.getText().toString();
                    String phone = arch_phone.getText().toString();

                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("Name", name);
                    resultIntent.putExtra("Phone", phone);

                    setResult(RESULT_OK, resultIntent);
                    finish();
                }
            });
        } else {
            addToContactsButton.setEnabled(false);
        }
        if (name2 != null && !name2.isEmpty() && phone2 != null && !phone2.isEmpty()) {
            addToContactsButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = arch_name2.getText().toString();
                    String phone = arch_phone2.getText().toString();

                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("Name", name);
                    resultIntent.putExtra("Phone", phone);

                    setResult(RESULT_OK, resultIntent);
                    finish();
                }
            });
        } else {
            addToContactsButton2.setEnabled(false);
        }
        if (name3 != null && !name3.isEmpty() && phone3 != null && !phone3.isEmpty()) {
            addToContactsButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = arch_name3.getText().toString();
                    String phone = arch_phone3.getText().toString();

                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("Name", name);
                    resultIntent.putExtra("Phone", phone);

                    setResult(RESULT_OK, resultIntent);
                    finish();
                }
            });
        } else {
            addToContactsButton3.setEnabled(false);
        }
        if (name4 != null && !name4.isEmpty() && phone4 != null && !phone4.isEmpty()) {
            addToContactsButton4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = arch_name3.getText().toString();
                    String phone = arch_phone3.getText().toString();

                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("Name", name);
                    resultIntent.putExtra("Phone", phone);

                    setResult(RESULT_OK, resultIntent);
                    finish();
                }
            });
        } else {
            addToContactsButton4.setEnabled(false);
        }
        if (name5 != null && !name5.isEmpty() && phone5 != null && !phone5.isEmpty()) {
            addToContactsButton5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = arch_name5.getText().toString();
                    String phone = arch_phone5.getText().toString();

                    Intent resultIntent = new Intent();
                    resultIntent.putExtra("Name", name);
                    resultIntent.putExtra("Phone", phone);

                    setResult(RESULT_OK, resultIntent);
                    finish();
                }
            });
        } else {
            addToContactsButton5.setEnabled(false);
        }
    }
}

