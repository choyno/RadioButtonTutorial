package com.example.radiobutontutorial;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends Activity {
	RadioGroup rg;
	Context context;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main); 
		RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);  
	 
		for(int i=0; i<6; i++)
		{
			  RadioButton rb = new RadioButton(this);
		       rb.setText("rdo"+i);
		       rb.setId(i);
		       rg.addView(rb);           
		  }      
		 
	
		 rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){  
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				   final String value = ((RadioButton)findViewById(checkedId)).getText().toString(); 
				 ShowDialog(value);		 
			}
		});
	}
	
	@SuppressWarnings("deprecation")
	private void ShowDialog(String string) { 
		
		AlertDialog alertDialog = new AlertDialog.Builder(this).create();
		alertDialog.setTitle("Sure ka?");
		alertDialog.setMessage("You have selected " + string); 
		alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
		   public void onClick(DialogInterface dialog, int which) {
		      // TODO Add your code for the button here.
		   }
		}); 
		alertDialog.show();
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
