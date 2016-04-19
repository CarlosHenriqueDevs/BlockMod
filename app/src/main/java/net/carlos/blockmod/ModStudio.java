package net.carlos.blockmod;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class ModStudio extends Activity
{
	 @Override
	 protected void onCreate(Bundle savedInstanceState)
	 {
			// TODO: Implement this method
			super.onCreate(savedInstanceState);
			setContentView(R.layout.mod_studio);
	 }

	 public void addItem(View v)
	 {
			
	 }

	 public void addVar(View v)
	 {
			
	 }

	 public void viewCode(View v)
	 {
			v.setBackgroundResource(R.drawable.background_pressed);
	 }
}
