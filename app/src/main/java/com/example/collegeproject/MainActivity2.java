package com.example.collegeproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        int image = getIntent().getIntExtra("imagename",0);
        String name = getIntent().getStringExtra("header");
        String price = getIntent().getStringExtra("Price");
        String description = getIntent().getStringExtra("Description");


        ImageView AA_image = findViewById(R.id.imageView2);
        TextView  AA_name =findViewById(R.id.textView2);
        TextView AA_price = findViewById(R.id.price);
        TextView AA_description = findViewById(R.id.description);

        AA_image.setImageResource(image);
        AA_name.setText(name);
        AA_price.setText(price);
        AA_description.setText(description);
    }
}