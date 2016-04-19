package net.carlos.blockmod.util;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.InputType;
import android.widget.EditText;
import android.widget.LinearLayout;
import net.carlos.blockmod.ModStudio;
import net.carlos.blockmod.R;
import net.carlos.blockmod.mod.Item;
import android.widget.Toast;

public class ModPEUtils
{
   public ModPEUtils()
   {

   }

   public static Item showCreatingItem()
   {
      final AlertDialog.Builder dialog = new AlertDialog.Builder(ModStudio.MOD_CONTEXT);

      final Item item = new Item();

      final EditText id = new EditText(ModStudio.MOD_CONTEXT);
      id.setHint("ID");
      id.setInputType(InputType.TYPE_NUMBER_FLAG_SIGNED);

      final EditText texture = new EditText(ModStudio.MOD_CONTEXT);
      texture.setHint("Textura");

      final EditText damage = new EditText(ModStudio.MOD_CONTEXT);
      damage.setHint("Damage");
      damage.setInputType(InputType.TYPE_NUMBER_FLAG_SIGNED);

      final EditText name = new EditText(ModStudio.MOD_CONTEXT);
      name.setHint("Nome");

      LinearLayout group = new LinearLayout(ModStudio.MOD_CONTEXT);
      group.setOrientation(LinearLayout.VERTICAL);
      group.addView(id);
      group.addView(texture);
      group.addView(damage);
      group.addView(name);

      dialog.setTitle("Cutom item");
      dialog.setIcon(resize(ModStudio.MOD_CONTEXT.getResources().getDrawable(R.drawable.item)));
      dialog.setNegativeButton("Cancelar", null);
      dialog.setPositiveButton("Criar", new DialogInterface.OnClickListener()
	 {

	    @Override
	    public void onClick(DialogInterface p1, int p2)
	    {
	       item.setId(Integer.parseInt(id.getText().toString()));
	       item.setTexture(texture.getText().toString());
	       item.setDamage(Integer.parseInt(damage.getText().toString()));
	       item.setName(name.getText().toString());
	       
	       Toast.makeText(ModStudio.MOD_CONTEXT, item.toString(), Toast.LENGTH_LONG).show();
	    }

	 });
      dialog.setView(group).show();

      return item;
   }

   public static Drawable resize(Drawable image)
   {
      Bitmap b = ((BitmapDrawable)image).getBitmap();
      Bitmap bitmapResized = Bitmap.createScaledBitmap(b, 50, 50, false);

      return new BitmapDrawable(ModStudio.MOD_CONTEXT.getResources(), bitmapResized);
   }
}
