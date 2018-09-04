 package com.example.zubairakrami.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

 public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private  RecyclerView.LayoutManager layoutManager;
    private List<String> list;
    private  RecylerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        list= Arrays.asList(getResources().getStringArray(R.array.android_version));
        adapter=new RecylerAdapter(list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);


    }
}
