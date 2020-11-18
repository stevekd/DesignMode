package DesginMode.gongchangmode.gongchang;

import DesginMode.gongchangmode.CarChanpin.Car;
import DesginMode.gongchangmode.HumanChanpin.Human;

//创建人类工厂
//这里可以是多工厂，创建人类工厂，创建汽车工厂等等
/*
* 好处：扩展性很强，结构清晰，屏蔽产品类，解耦架构*/
public class HumanFactory extends AbstractHumanFactory {
    public <T extends Human> T createHuman(Class<T> c) {
        //定义一个生产的人种
        Human human = null;
        try {
            //产生一个人种
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误！");
        }
        return (T) human;
    }
    public <T extends Car> T createCar(Class<T> c) {
        //定义一个生产的人种
        Car car = null;
        try {
            //产生一个人种
            car = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误！");
        }
        return (T) car;
    }
}
