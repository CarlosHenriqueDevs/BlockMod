package net.carlos.blockmod;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import net.carlos.blockmod.util.ModPEUtils;
import net.carlos.blockmod.mod.Item;
import android.widget.Toast;
import android.content.Context;

public class ModStudio extends Activity
{
   public static Context MOD_CONTEXT;
   
   @Override
   protected void onCreate(Bundle savedInstanceState)
   {
      // TODO: Implement this method
      super.onCreate(savedInstanceState);
      setContentView(R.layout.mod_studio);
      
      ModStudio.MOD_CONTEXT = this;
   }

   public void addItem(View v)
   {
      Item i = ModPEUtils.showCreatingItem();
   }

   public void addVar(View v)
   {

   }

   public void viewCode(View v)
   {
      v.setBackgroundResource(R.drawable.background_pressed);
   }
   
}
