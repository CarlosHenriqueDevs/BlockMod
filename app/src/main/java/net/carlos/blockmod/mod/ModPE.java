package net.carlos.blockmod.mod;

public class ModPE
{
   public static final String ITEM = "ModPE.setItem(id, texture, damage, name);";
   public static final String GAME_SPEED = "ModPE.setGameSpeed(speed);";
   public static final String SHOW_MESSAGE = "ModPE.showTipMessage(message);";
   public static final String TAKE_SCREENSHOT = "ModPE.takeScreenshot(fileName);";
   public static final String CHANGE_FOV = "ModPE.setFov(fov);";
   public static final String RESET_FOV = "ModPE.resetFov();";
   
   public class Player
   {
      public static final String SET_HEALTH = "Player.setHealth(health);";
      public static final String GET_HEALTH = "Player.getHealth();";
      public static final String SET_HUNGER = "Player.setHunger(hunger);";
      public static final String GET_HUNGER = "Player.getHunger();";
      public static final String GET_X = "Player.getX();";
      public static final String GET_Y = "Player.getY();";
      public static final String GET_CARRIED_ITEM = "Player.getCarriedItem();";
      public static final String GET_ENTITY = "Player.getEntity();";
      public static final String ADD_EXP = "Player.addExp(xp);";
      public static final String GET_SCORE = "Player.getScore();";
      public static final String GET_NAME = "Player.getName(getPlayerEnt());";
   }
   
   public class Level
   {
      public static final int SURVIVAL = 0;
      public static final int CREATIVE = 1;
      
      public static final String GET_NAME = "Level.getAddress();";
      public static final String GET_GAMEMODE = "Level.getGameMode();";
   }
}
