package com.example.MobileProject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
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
