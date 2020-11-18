package DesginMode.yuanxingprototype.Test;

import DesginMode.yuanxingprototype.EntityClone.User;

import java.util.Date;
/*浅拷贝测试*/

public class testuser {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date =  new Date(1231231231231l);
        User user = new User();
        user.setName("波波烤鸭");
        user.setAge(18);
        user.setBirth(date);
        System.out.println("----输出原型对象的属性------");
        System.out.println(user);
        System.out.println(user.getName());
        System.out.println(user.getBirth());
        // 克隆对象
        User user1 =(User) user.clone();
        // 修改原型对象中的属性
        date.setTime(123231231231l);
        System.out.println(user.getBirth());

        // 修改参数
        user1.setName("dpb");
        System.out.println("-------克隆对象的属性-----");
        System.out.println(user1);
        System.out.println(user1.getName());
        System.out.println(user.getName());
        System.out.println(user1.getBirth());
        System.out.println(user.getBirth());
        System.out.println(user1.getAge());
        System.out.println(user.getAge());
    }

}
