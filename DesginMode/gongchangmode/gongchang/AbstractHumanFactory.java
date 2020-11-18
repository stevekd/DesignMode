package DesginMode.gongchangmode.gongchang;

import DesginMode.gongchangmode.CarChanpin.Car;
import DesginMode.gongchangmode.HumanChanpin.Human;

//创建人类抽象工厂
/* 1   为创建一组相关或相互依赖的对象提供一个接口，而且无须指定它们的具体类。
*  2    有N个产品族，在抽象工厂类中就应该有N个创建方法。*/
//客户端提供一个接口，使得客户端在不必指定产品的具体类型的情况下，创建多个产品族中的产品对象
public abstract class AbstractHumanFactory{
    //这里采用了泛型，对createHuman的输入参数产生两层限制
    //1.必须是Class类型
    //2.必须是Human的实现类
    public abstract <T extends Human> T createHuman(Class<T> c);
    public abstract <T extends Car> T createCar(Class<T> c);
}

