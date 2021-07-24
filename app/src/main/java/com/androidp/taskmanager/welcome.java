package com.androidp.taskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class welcome extends AppCompatActivity {
    private TextView name;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

             name = findViewById(R.id.name);

             name.setText("Hi, Bhavesh");



             btn = findViewById(R.id.settask);

             btn.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     Intent intent = new Intent(welcome.this,SetTasks.class);
                     startActivity(intent);
                 }
             });


    }


}