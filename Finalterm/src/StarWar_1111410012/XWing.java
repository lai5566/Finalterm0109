package StarWar_1111410012;

import java.util.Arrays;

public class XWing extends AirCraft{
    private String Shield;
    private  static double  [] ShieldPower={1000,1000,1000};

    XWing(){};
    XWing(String Manufacturer,String Model ,double Length ,double AirSpeed,double SpaceSpeed , String StdandardEngine , String HyperSpaceEngine ,String[] Weapon)
    {
        super.setManufacturer(Manufacturer);
        super.setModel(Model);
        super.setLength(Length);
        super.setAirSpeed(AirSpeed);
        super.setSpaceSpeed(SpaceSpeed);
        super.setStdandardEngine(StdandardEngine);
        super.setWeapon(Weapon);
    };
    @Override
    public String toString() {
      return super.toString()+"防護照:"+getShield()+"防護罩能量"+getShieldPower();
    }

    /*AirCraft(String Manufacturer,String Model ,double Length ,double AirSpeed,double SpaceSpeed , String StdandardEngine , String HyperSpaceEngine ,String[] Weapon )
    {
        this.setManufacturer(Manufacturer);
        this.setLength(Length);
        this.setModel(Model);
        this.setAirSpeed(AirSpeed);
        this.setSpaceSpeed(SpaceSpeed);
        this.setStdandardEngine(StdandardEngine);
        this.setWeapon(Weapon);
    }*/
     protected  double RemainShieldPower(double AttackStrength)
     {
         for(int i=0;i<3;i++)
         {
             /* 有防護罩，就有防禦指示（即防護罩剩餘電子的方法:RemainShieldPower( )），傳入參
數為一 double 數值變數 AttackStrength(攻擊強度)，代表敵機雷射炮的能量，方法會回傳
抵抗敵機雷射炮能量後，戰機剩下的防護能量。注意方法前為#表示 protected。*/

         }
         return 0;
     };


    public String getShield() {
        return Shield;
    }

    public void setShield(String shield) {
        Shield = shield;
    }

    public double[] getShieldPower() {
        return ShieldPower;
    }

    public void setShieldPower(double shieldPower) {
        for(int i=0;i<3;i++)
        {
            if(shieldPower<1000.0&&shieldPower>0)
            {
                ShieldPower[i] = shieldPower;
            }
        }


    }
}
