package com.ibo.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.Listitem;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Listitem> listitems;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.RecyclerviewID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//                     1
//        listitems=new ArrayList<>();
//        for(int x=1;x<12;x++){
//            Listitem listitem=new Listitem("Mhd"+(x+1),"Details","26");
//            listitems.add(listitem);
//        }
//                         2
        listitems=new ArrayList<>();
        Listitem item=new Listitem("ibo","wahbeh","11");
        Listitem item1=new Listitem("abo","latkani","22");
        Listitem item2=new Listitem("shadi","vahbe","33");
        Listitem item3=new Listitem("fadi","wahbeh","44");
        Listitem item4=new Listitem("yahia","dalal","55");
        Listitem item5=new Listitem("omer","yaci","66");
        Listitem item6=new Listitem("mhd","wahbeh","77");
        Listitem item7=new Listitem("mahmod","hazemhe","88");
        Listitem item8=new Listitem("lina","alhata","99");
        Listitem item9=new Listitem("dalin","vahbeh","100");
        Listitem item10=new Listitem("ali","ahemed","101");

        listitems.add(item);
        listitems.add(item1);
        listitems.add(item2);
        listitems.add(item3);
        listitems.add(item4);
        listitems.add(item5);
        listitems.add(item6);
        listitems.add(item7);
        listitems.add(item8);
        listitems.add(item9);
        listitems.add(item10);


        adapter=new MyAdapter(this,listitems);
        recyclerView.setAdapter(adapter);


    }
}