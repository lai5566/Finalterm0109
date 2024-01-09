package StarWar_1111410012;

public class TieFighter extends AirCraft{
    TieFighter(){};


    TieFighter(String Manufacturer,String Model ,double Length ,double AirSpeed,double SpaceSpeed , String StdandardEngine , String HyperSpaceEngine ,String[] Weapon)
    {
        super.setManufacturer(Manufacturer);
        super.setLength(Length);
        super.setModel(Model);
        super.setAirSpeed(AirSpeed);
        super.setSpaceSpeed(SpaceSpeed);
        super.setStdandardEngine(StdandardEngine);
        super.setWeapon(Weapon);
    };
}
