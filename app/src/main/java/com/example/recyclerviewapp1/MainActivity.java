package com.example.recyclerviewapp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rclv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //my code
        rclv=(RecyclerView)findViewById(R.id.recyclerView1);
        //set Layout for RecyclerView
        rclv.setLayoutManager(new LinearLayoutManager(this));
        //create data source array
        String arr[]={"C","C++","Java","Javascript","PHP","JQuery","JSON","AJAX","Nod.js","CSS",
                "C#","XML",".NET","Python","Matlab","Perl","Lisp","SQL","XHTML","Android","Flutter"};
        //pass the adapter class to recyclerView1
        //create MyAdapter class object
        rclv.setAdapter(new MyAdapter(arr));
    }
}