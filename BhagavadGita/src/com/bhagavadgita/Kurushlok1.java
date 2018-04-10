package com.bhagavadgita;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class Kurushlok1 extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
		setContentView(R.layout.kuruslok1);
		ActionBar bar=getActionBar();
		bar.setBackgroundDrawable(new ColorDrawable(Color.LTGRAY));
	}
}
