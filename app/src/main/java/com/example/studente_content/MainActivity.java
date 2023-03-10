package com.example.studente_content;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnStd, btnAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStd = findViewById(R.id.std_ID);
        btnAdmin = findViewById(R.id.adminID);

        btnStd.setOnClickListener(view -> {
            startActivity(new Intent(this,StudentActivity.class));
        });
    }
}