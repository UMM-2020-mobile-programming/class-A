package com.example.MobileProject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class aktivasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktivasi);
    }
    public void Masuk(View view) {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
}
