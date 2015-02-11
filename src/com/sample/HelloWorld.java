package com.sample;


import com.example.sample.R;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class HelloWorld extends Activity {
@Override
 protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.first);
	
	 //--- find both the buttons---
    Button sButton = (Button) findViewById(R.id.button_s);
     
    // -- register click event with first button ---
    sButton.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			onShow();
		}
	});
	}


protected void onShow() {
	
		//define a new Intent for the second Activity
		Intent intent = new Intent(this,SecondActivity.class);
 
		//start the second Activity
		this.startActivity(intent);
	}

}
