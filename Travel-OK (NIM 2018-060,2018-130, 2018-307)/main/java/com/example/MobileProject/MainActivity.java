package com.example.MobileProject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Register(View view) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }

    public void Masuk(View view) {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }

    public void Bantuan(View view) {
        Intent intent = new Intent(this, bantuan.class);
        startActivity(intent);
    }
}
