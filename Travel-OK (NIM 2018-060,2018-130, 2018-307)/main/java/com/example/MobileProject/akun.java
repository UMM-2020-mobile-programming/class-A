package com.example.MobileProject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class akun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun);
    }
    public void Masuk(View view) {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
    public void Order(View view) {
        Intent intent = new Intent(this, order.class);
        startActivity(intent);
    }
    public void Akun(View view) {
        Intent intent = new Intent(this, akun.class);
        startActivity(intent);
    }
}