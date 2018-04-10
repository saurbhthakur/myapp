package com.bhagavadgita;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Kurukshetar extends Activity{
	ListView lv;
	String[] st={"शलोक 1","शलोक  2","शलोक  3","शलोक  4,5,6","शलोक  7","शलोक  8","शलोक  9","शलोक  10","शलोक  11","शलोक  12","शलोक  13","शलोक  14","शलोक  15","शलोक  16","शलोक  17,18","शलोक  19","शलोक  20,21","शलोक  22","शलोक  23","शलोक  24,25","शलोक  26","शलोक  27","शलोक  28,29","शलोक  30","शलोक  31","शलोक  32","शलोक  33","शलोक  34","शलोक 35","शलोक  36","शलोक  37","शलोक  38,39","शलोक  40","शलोक 41","शलोक  42","शलोक  43","शलोक  44","शलोक  45","शलोक  46","शलोक  47"};
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kurukshetar);
		ActionBar bar=getActionBar();
		bar.setBackgroundDrawable(new ColorDrawable(Color.GRAY));
		bar.setTitle("कुरुक्षेत्र के युद्दस्थल में सेन्य निरीक्षण");
	  //  bar.setHomeButtonEnabled(true);
		bar.setDisplayHomeAsUpEnabled(true);
		lv=(ListView)findViewById(R.id.listView2);
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
					Intent intent=new Intent(Kurukshetar.this,Kurushlok1.class);
					startActivity(intent);
				} 
				
			}
		});
	}
	/*@Override
	public boolean onOptionsItemSelected(MenuItem menu)
	{
		switch(menu.getItemId())
		{
		case android.R.id.home:
			return true;
	    default:
	    	return super.onOptionsItemSelected(menu);
		}
		
	}*/
}
