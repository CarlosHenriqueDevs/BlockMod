package net.carlos.blockmod.mod;

public class Item
{
   private int id;
   private String texture;
   private String name;
   private int damage;
   
   public Item(int id, String texture)
   {
      this.id = id;
      this.texture = texture;
   }

   public Item(int id, String texture, String name, int damage)
   {
      this(id, texture);
      this.name = name;
      this.damage = damage;
   }

   public void setId(int id)
   {
      this.id = id;
   }

   public int getId()
   {
      return id;
   }

   public void setTexture(String texture)
   {
      this.texture = texture;
   }

   public String getTexture()
   {
      return texture;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getName()
   {
      return name;
   }

   public void setDamage(int damage)
   {
      this.damage = damage;
   }

   public int getDamage()
   {
      return damage;
   }

   @Override
   public String toString()
   {
      return "Nome: " + name + "\nId: " + id + "\nDamage: " + damage + 
	 "Texture: " + texture;
   }

}
