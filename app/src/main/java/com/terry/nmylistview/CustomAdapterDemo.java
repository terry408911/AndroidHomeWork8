package com.terry.nmylistview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * 自定义适配器通过ListView显示内容，这个比较重要需要掌握
 * Created by terry nie on 11/14/15.
 */
public class CustomAdapterDemo extends Activity {

    private ListView listView;

    private CustomAdapter myAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_adapter);

        listView = (ListView) findViewById(R.id.listView2);
        myAdapter = new CustomAdapter();
        listView.setAdapter(myAdapter);
    }


}