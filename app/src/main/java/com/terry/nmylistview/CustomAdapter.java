package com.terry.nmylistview;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by terry on 11/14/15.
 */
public class CustomAdapter extends BaseAdapter {
    private MyDatabase cd;
    private Cursor cursor;
    private List<Product> list;

    public CustomAdapter() {
        cd = new MyDatabase(new Activity(),"Student.db",null,1);
        SQLiteDatabase db = cd.getWritableDatabase();
        cursor = db.query("students", null, null, null, null, null, null);
        while (cursor.moveToNext()){
            Product pd = new Product();
            pd.setName(cursor.getString(cursor.getColumnIndex("name")));
            pd.setPlace(cursor.getString(cursor.getColumnIndex("place")));
            pd.setPrice(cursor.getDouble(cursor.getColumnIndex("price")));
            list.add(pd);
        }
    }

    // 描述adpter的大小（确定了listView的条目）
    @Override
    public int getCount() {
        return list.size();
    }

    // Adapter对于的position的数据
    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    // 得到item 在adapter所对应的位置
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView view = new TextView(CustomAdapterDemo.this);
        view.setText("产品名: "+list.get(position).getName()+"  产地: "list.get(position).getPlace()+"  单价: "+list.get(position).getPrice());

        return view;
    }
}

