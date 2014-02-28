package com.lello.changeactivity;

import android.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button bn1, bn2;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		Button bn1 = (Button) findViewById(R.id.button1);
		Button bn2 = (Button) findViewById(R.id.button2);
		
		bn1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent it1 = new Intent(getApplicationContext(), PrimaAct.class);
				startActivity(it1);
			}
			
		});
		
		bn2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent it2 = new Intent(getApplicationContext(), SecondaAct.class);
				startActivity(it2);
			}
			
		})
	}
}
