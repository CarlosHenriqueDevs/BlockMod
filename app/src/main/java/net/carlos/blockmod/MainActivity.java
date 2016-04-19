package net.carlos.blockmod;

import android.app.Activity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.content.Intent;

public class MainActivity extends Activity 
{
   @Override
   protected void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.main);

      Button startModelagem = (Button) findViewById(R.id.btMake);

      startModelagem.setOnClickListener(new OnClickListener()
	 {

	    @Override
	    public void onClick(View p1)
	    {
	       Intent mod = new Intent(getApplicationContext(), ModStudio.class);
	       startActivity(mod);
	    }

	 });
   }

   public Drawable resize(Drawable image)
   {
      Bitmap b = ((BitmapDrawable)image).getBitmap();
      Bitmap bitmapResized = Bitmap.createScaledBitmap(b, 50, 50, false);

      return new BitmapDrawable(getResources(), bitmapResized);
   }
}
