package com.monstertechno.loginsignupui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class recyclierview extends AppCompatActivity {
    RecyclerView programinglist;
    private ExpandableListView listView;
    private expandablelist ebtn;
    private List<String> ls;
    private HashMap<String,List<String>> hashMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclierview);
        RecyclerView programinglist = findViewById(R.id.my_recycler_view);
        programinglist.setLayoutManager(new LinearLayoutManager(this));
        programinglist.setAdapter(new myadapter(this,getMYlist()));

    }
    private ArrayList<model> getMYlist(){
        ArrayList<model> modl1=new ArrayList<>();
        model m=new model();
        m.setLocation("netherland1");
        m.setTicket_no("ticket #2358");
        modl1.add(m);

        m=new model();
        m.setLocation("netherland2");
        m.setTicket_no("ticket #2359");
        modl1.add(m);

        m=new model();
        m.setLocation("netherland3");
        m.setTicket_no("ticket #2360");
        modl1.add(m);
        m=new model();
        m.setLocation("netherland4");
        m.setTicket_no("ticket #2361");
        modl1.add(m);
        m=new model();

        m.setLocation("netherland5");
        m.setTicket_no("ticket #2362");
        modl1.add(m);
        return modl1;

    }
}
