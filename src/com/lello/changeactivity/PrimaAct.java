package com.lello.changeactivity;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class PrimaAct extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.prima);
		
		Button bn = (Button) findViewById(R.id.bn_prima);
		bn.setOnClickListener(new OnClickListener(){
			finish();
			
		});
		
	}

}
