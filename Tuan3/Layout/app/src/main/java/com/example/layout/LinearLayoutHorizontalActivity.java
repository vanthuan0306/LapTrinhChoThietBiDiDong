package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LinearLayoutHorizontalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_horizontal);
        getSupportActionBar().setTitle("Linear Layout Horizontal");
    }
}
