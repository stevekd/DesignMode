package DesginMode.gongchangmode;

import DesginMode.gongchangmode.CarChanpin.Audi;
import DesginMode.gongchangmode.CarChanpin.BenZi;
import DesginMode.gongchangmode.CarChanpin.Car;
import DesginMode.gongchangmode.HumanChanpin.*;
import DesginMode.gongchangmode.gongchang.AbstractHumanFactory;
import DesginMode.gongchangmode.gongchang.HumanFactory;

//女娲类 也就是调用使用方
class NvWa{
    public static void main(String[] args){
        //声明阴阳八卦炉
        AbstractHumanFactory YinYangLu = new HumanFactory();
        //女娲第一次造人，火候不足，于是白人产生了
        System.out.println("造出来的第一批人是白色人种");
        Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        //女娲第二次造人， 火候过足， 于是黑人产生了
        System.out.println("造出的第二批人是黑色人种");
        Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        //第三次造人， 火候刚刚好， 于是黄色人种产生了
        System.out.println("造出的第三批人是黄色人种");
        Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();


        Car benzi=YinYangLu.createCar(BenZi.class);
        benzi.turnleft();
        benzi.turnright();
    }
}