package DesginMode.yuanxingprototype.Test;

import DesginMode.yuanxingprototype.EntityClone.User2;

import java.util.Date;

public class testuser2 {
    /*我们发现克隆的对象的属性并没有随着我们对Date的修改而改变，说明克隆对象的Date属性和原型对象的Date属性引用的不是同一个对象，实现的深度复制。

    /*深度拷贝测试代码*/
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date =  new Date(1231231231231l);
        User2 user = new User2();
        user.setName("波波烤鸭");
        user.setAge(18);
        user.setBirth(date);
        System.out.println("----输出原型对象的属性------");
        System.out.println(user);
        System.out.println(user.getName());
        System.out.println(user.getBirth());
        // 克隆对象
        User2 user1 =(User2) user.clone();
        // 修改原型对象中的属性
        date.setTime(123231231231l);
        System.out.println(user.getBirth());

        // 修改参数
        user1.setName("dpb");
        System.out.println("-------克隆对象的属性-----");
        System.out.println(user1);
        System.out.println(user1.getName());
        System.out.println(user1.getBirth());
    }
}
