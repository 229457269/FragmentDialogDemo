package com.zhaoq_hero.dialogdemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void toPay(View view){
		
		//µ¥»÷ÊÂ¼þ£º
		PayDialogFragment.getInstance().show(getFragmentManager(), "flag");
		
	}
	
}
