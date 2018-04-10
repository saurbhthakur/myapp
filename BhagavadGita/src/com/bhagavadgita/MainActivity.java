package com.bhagavadgita;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	ListView lv;
	String[] st={"अध्याय 1- कुरुक्षेत्र के युद्दसथ्ल में सेन्य निरीक्षण","अध्याय 2 - गीता का सार","अध्याय 3 - कर्मयोग","अध्याय 4 - दिव्य ज्ञान","अध्याय 5-कर्मयोग-क्रिश्न्भावनाभावित कर्म","अध्याय 6 - धयानयोग","अध्याय 7 - भगवाद्ज्ञान","अध्याय 8-भाग्वत्प्रपति","अध्याय 9-परम गुह्य ज्ञान","अध्याय 10- श्री भगवान् का ऐश्वर्य"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ActionBar bar=getActionBar();
		bar.setBackgroundDrawable(new ColorDrawable(Color.LTGRAY));
		lv=(ListView)findViewById(R.id.listView1);
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, st);
	    lv.setAdapter(adapter);
	    lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int i,
					long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "Item Clicked: "+i, Toast.LENGTH_LONG).show();
				if(i==0)
				{
					Intent intent=new Intent(MainActivity.this,Kurukshetar.class);
					startActivity(intent);
				} 
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
