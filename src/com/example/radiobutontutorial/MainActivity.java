package com.example.radiobutontutorial;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends Activity {
	RadioGroup rg;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1); 
		  final String value = ((RadioButton)findViewById(rg.getCheckedRadioButtonId() )).getText().toString(); 
		 rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){  
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
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
		// Set the Icon for the Dialog 
		alertDialog.show();
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
