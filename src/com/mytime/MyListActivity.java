package com.mytime;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyListActivity extends Activity {
	private String[] strs = {"apple","banana","orange"};
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO �Զ����ɵķ������
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_list);
	ArrayAdapter<String> adapter = new ArrayAdapter<String>(MyListActivity.this,android.R.layout.simple_list_item_1,strs);
	ListView listView = (ListView)findViewById(R.id.list_view);
	listView.setAdapter(adapter);
}
}
