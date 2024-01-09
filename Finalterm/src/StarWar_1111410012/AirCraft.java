package StarWar_1111410012;

import java.util.Arrays;

public class AirCraft {
   private String manufacturer;
   private String Model;
   private String Manufacturer;
   private double Length;
   private double irSpeed;
   private double SpaceSpeed;
   private String StdandardEngine;
   private String HyperSpaceEngine;
   private double AirSpeed;
   private String [] Weapon;

   AirCraft(){};
   AirCraft(String Manufacturer,String Model ,double Length ,double AirSpeed,double SpaceSpeed , String StdandardEngine , String HyperSpaceEngine ,String[] Weapon )
   {
      this.setManufacturer(Manufacturer);
      this.setLength(Length);
      this.setModel(Model);
      this.setAirSpeed(AirSpeed);
      this.setSpaceSpeed(SpaceSpeed);
      this.setStdandardEngine(StdandardEngine);
      this.setWeapon(Weapon);
   }

   @Override
   public String toString() {
      return "{" +
              "製造商='" + manufacturer + '\'' +
              ", 型號='" + Model + '\'' +
              ", 長度(公尺) =" + Length +
              ", 字宙空間加速度=" + SpaceSpeed +
              ", 標準引擎資料='" + StdandardEngine + '\'' +
              ", 超空間引擎='" + HyperSpaceEngine + '\'' +
              ", 武器裝備名=" + Arrays.toString(Weapon) +
              '}';
   }

   public String getManufacturer() {
      return manufacturer;
   }

   public void setManufacturer(String manufacturer) {
      this.manufacturer = manufacturer;
   }

   public double getLength() {
      return Length;
   }

   public void setLength(double length) {
      Length = length;
   }

   public double getIrSpeed() {
      return irSpeed;
   }

   public void setIrSpeed(double irSpeed) {
      this.irSpeed = irSpeed;
   }

   public double getSpaceSpeed() {
      return SpaceSpeed;
   }

   public void setSpaceSpeed(double spaceSpeed) {
      SpaceSpeed = spaceSpeed;
   }

   public String getStdandardEngine() {
      return StdandardEngine;
   }

   public void setStdandardEngine(String stdandardEngine) {
      StdandardEngine = stdandardEngine;
   }

   public String getHyperSpaceEngine() {
      return HyperSpaceEngine;
   }

   public void setHyperSpaceEngine(String hyperSpaceEngine) {
      HyperSpaceEngine = hyperSpaceEngine;
   }

   public String[] getWeapon() {
      return Weapon;
   }

   public void setWeapon(String[] weapon) {
      Weapon = weapon;
   }

   public String getModel() {
      return Model;
   }

   public void setModel(String model) {
      Model = model;
   }

   public double getAirSpeed() {
      return AirSpeed;
   }

   public void setAirSpeed(double airSpeed) {
      AirSpeed = airSpeed;
   }
}
