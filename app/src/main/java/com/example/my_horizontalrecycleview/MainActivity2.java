package com.example.my_horizontalrecycleview;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model2> list2=new ArrayList<>();
    Adapter2 adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addData();
        setContentView(R.layout.activity_main2);
        recyclerView.findViewById(R.id.recycleView2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter2=new Adapter2(this,list2,list2.size());
        recyclerView.setAdapter(adapter2);

    }

    private void addData() {
        list2.add(new Model2(R.drawable.doc10,"doctor's name","doctor's speciliste,"));
        list2.add(new Model2(R.drawable.doc10,"doctor's name","doctor's speciliste,"));
        list2.add(new Model2(R.drawable.doc10,"doctor's name","doctor's speciliste,"));
        list2.add(new Model2(R.drawable.doc10,"doctor's name","doctor's speciliste,"));
        list2.add(new Model2(R.drawable.doc10,"doctor's name","doctor's speciliste,"));
        list2.add(new Model2(R.drawable.doc10,"doctor's name","doctor's speciliste,"));
        list2.add(new Model2(R.drawable.doc10,"doctor's name","doctor's speciliste,"));
        list2.add(new Model2(R.drawable.doc10,"doctor's name","doctor's speciliste,"));
        list2.add(new Model2(R.drawable.doc10,"doctor's name","doctor's speciliste,"));
        list2.add(new Model2(R.drawable.doc10,"doctor's name","doctor's speciliste,"));
        list2.add(new Model2(R.drawable.doc10,"doctor's name","doctor's speciliste,"));
    }
}