package com.terry.nmylistview;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button arrayAdapter = (Button)findViewById(R.id.button);
        Button simpleAdapter =(Button)findViewById(R.id.button2);
        Button customAdapter = (Button)findViewById(R.id.button3);


        arrayAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ArrayAdapterDemo.class);
                startActivity(intent);
            }
        });

        simpleAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SimpleAdapterDemo.class);
                startActivity(intent);
            }
        });

        customAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //为下一步准备数据库数据
                final MyDatabase cd = new MyDatabase(MainActivity.this,"Student.db",null,1);
                SQLiteDatabase db = cd.getWritableDatabase();
                ContentValues values = new ContentValues();
                values.put("name","海尔冰箱");
                values.put("place","青岛");
                values.put("price",1000);
                db.insert("students", null, values);
                values.put("name", "格力空调");
                values.put("place","广州");
                values.put("price",3000);
                db.insert("students", null, values);
                values.put("name", "iPhone6");
                values.put("place","American");
                values.put("price",6000);
                db.insert("students", null, values);

                Intent intent = new Intent(MainActivity.this,SimpleAdapterDemo.class);
                startActivity(intent);
            }
        });
    }
}
