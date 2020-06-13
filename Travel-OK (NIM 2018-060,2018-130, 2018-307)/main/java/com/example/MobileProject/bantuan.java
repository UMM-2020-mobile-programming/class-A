package com.example.MobileProject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bantuan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bantuan);
    }
    public void hpass(View view) {
        Intent intent = new Intent(this, helppass.class);
        startActivity(intent);
    }
    public void huser(View view) {
        Intent intent = new Intent(this, helpuser.class);
        startActivity(intent);
    }
}
