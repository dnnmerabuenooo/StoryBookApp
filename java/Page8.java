package com.example.storybookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Page8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page8);
    }

    public void goToPage9(View view){
        Intent i = new Intent(this, Page9.class);
        startActivity(i);
        finish();
    }

    public void goToPage7(View view){
        Intent i = new Intent(this, Page7.class);
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
