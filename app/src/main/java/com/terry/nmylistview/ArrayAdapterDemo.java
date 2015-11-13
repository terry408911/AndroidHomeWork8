package com.terry.nmylistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.lang.String;

import java.util.ArrayList;

/**
 * Created by terry on 11/13/15.
 */
public class ArrayAdapterDemo extends AppCompatActivity {
    private ListView myListView;
    private ArrayList<String> myArrayList = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.array_adapter);

        myListView = (ListView)findViewById(R.id.listView);
        myListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, getData()));

    }

    private ArrayList<String> getData(){
        myArrayList.add("玫瑰花");
        myArrayList.add("水仙花");
        myArrayList.add("月季");
        myArrayList.add("菊花");
        myArrayList.add("太阳花");
        return  myArrayList;
//        myArrayAdapter.notifyDataSetChanged();
    }
}
