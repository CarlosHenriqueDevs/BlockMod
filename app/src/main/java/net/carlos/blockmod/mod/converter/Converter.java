package net.carlos.blockmod.mod.converter;

import net.carlos.blockmod.mod.Item;
import net.carlos.blockmod.mod.ModPE;

public class Converter
{
   public Converter()
   {

   }

   public static String itemToCode(Item item)
   {
      String code = ModPE.ITEM;
      code.replace("id", "" + item.getId());
      code.replace("texture", item.getTexture());
      code.replace("name", item.getName());
      code.replace("damage", "" + item.getDamage());

      return code;
   }

   public static String showMessage(String message)
   {
      String code = ModPE.SHOW_MESSAGE.replace("message", message);

      return code;
   }

   public static String setGameSpeed(int speed)
   {
      String code = ModPE.GAME_SPEED.replace("speed", "" + speed);

      return code;
   }

   public static String takeScreenshot(String fileName)
   {
      String code = ModPE.TAKE_SCREENSHOT.replace("fileName", fileName);

      return code;
   }
}
