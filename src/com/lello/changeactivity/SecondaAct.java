package com.lello.changeactivity;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondaAct extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.seconda);
		
		Button bn = (Button) findViewById(R.id.bn_seconda);
		bn.setOnClickListener(new OnClickListener(){
			
			public void onClick(View v) {
				finish();
			}
		});
	}

}
