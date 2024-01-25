package com.example.storybookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Page12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page12);
    }

    public void goToPage13(View view){
        Intent i = new Intent(this, Page13.class);
        startActivity(i);
        finish();
    }

    public void goToPage11(View view){
        Intent i = new Intent(this, Page11.class);
        startActivity(i);
        finish();
    }

    int j = 1;
    public void onBackPressed() {
        super.onBackPressed();
        if (j == 1) {
            j++;
            Toast.makeText(this, "Press the back button again to exit.", Toast.LENGTH_SHORT).show();
        } else {
            finish();
        }
    }
}
