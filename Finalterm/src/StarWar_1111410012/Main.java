package StarWar_1111410012;

public class Main {
    public static void main(String[] args) {
        String[] Weapont={"SFS L-s1 型雷射加農炮”,” SFS L-s1 型雷射加農炮"};
        String [] Weaponx={"Taim & Bak KX9 雷射加農炮","Taim & Bak KX9 雷射加農炮","Taim & Bak KX9 雷射加農炮","Taim & Bak KX9 雷射加農炮","Krupx MG7 質子魚雷發射器","Krupx MG7 質子魚雷發射器"};
        TieFighter Tie01 =new TieFighter("賽納爾艦隊系統","雙離子引擎生產線星際戰鬥機",6.3,1200,4100,"SFS P-s4 雙離子引擎","無" ,Weapont);
        XWing  Xwing01 =new XWing("無","Incom Corporation T65B X-Wing SpaceSuperiority Fighter ",12.5,1050,100,"80MGLT ","Class 1 KoensayrR300-H 之超空間飛 行引擎",Weaponx);

        System.out.println("Tie01  :"+Tie01.toString());
        System.out.println("Xwing01   :"+Xwing01.toString());



    }


}
