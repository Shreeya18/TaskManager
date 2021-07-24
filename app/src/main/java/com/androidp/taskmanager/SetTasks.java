package com.androidp.taskmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class SetTasks extends AppCompatActivity {

    private EditText add_task;
    private Button done_btn;
    ArrayList<String> arr;
    adapter adp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_tasks);

        add_task = findViewById(R.id.add_task);
        done_btn = findViewById(R.id.done_btn);

        arr = new ArrayList<>();
        adp = new adapter(arr);
        RecyclerView list = (RecyclerView) findViewById(R.id.list);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(adp);

        done_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = add_task.getText().toString();
                addText(txt);
            }
        });
    }

    private void addText(String txt) {
        arr.add(txt);
        adp.notifyDataSetChanged();


    }

}