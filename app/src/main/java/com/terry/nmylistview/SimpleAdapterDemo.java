package com.terry.nmylistview;

/**
 * Created by terry on 11/14/15.
 */

import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

        import android.app.ListActivity;
        import android.os.Bundle;
        import android.widget.SimpleAdapter;

public class SimpleAdapterDemo extends ListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SimpleAdapter adapter = new SimpleAdapter(this, getData(),
                R.layout.test_simple_adapter, new String[] { "img", "name", "place" },
                new int[] { R.id.img, R.id.title, R.id.info });
        setListAdapter(adapter);
    }

    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("img", R.drawable.img);
        map.put("name", "玫瑰");
        map.put("place", "河南");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img", R.drawable.img1);
        map.put("name", "水仙花");
        map.put("place", "河北");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img", R.drawable.img2);
        map.put("name", "月季花");
        map.put("place", "江苏");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img", R.drawable.img3);
        map.put("name", "菊花");
        map.put("place", "开封");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img", R.drawable.img4);
        map.put("name", "太阳花");
        map.put("place", "湖北");
        list.add(map);

        return list;
    }
}