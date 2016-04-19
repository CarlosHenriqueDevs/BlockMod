package net.carlos.blockmod.mod;

public class Mod
{
   private String modName;
   private String code;
   
   public Mod(String modName)
   {
      this.modName = modName;
   }

   public Mod(String modName, String code)
   {
      this(modName);
      this.code = code;
   }

   public Mod()
   {

   }

   public void setCode(String code)
   {
      this.code = code;
   }

   public String getCode()
   {
      return code;
   }

   public void setModName(String modName)
   {
      this.modName = modName;
   }

   public String getModName()
   {
      return modName;
   }

   public void appendCode(String code)
   {
      this.code.concat("\n" + code);
   }

   @Override
   public String toString()
   {
      return "Nome do mod: " + getModName() + "\nCódigo: \n\n" + getCode();
   }

}
