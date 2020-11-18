package DesginMode.SingleTon;

import java.util.HashMap;
import java.util.Map;
/*单例模型的实际应用SingleTon*/
/*某个类只能有一个实例，提供一个全局的访问点
* 单例模式运用最多的就是Java，因为java没有全局变量，只有静态变量。所以某种意义上单例模式是java为了实现全局变量的一种方式。
* 例如本实例上的info就是一个全局变量*/

/* 三个重要方法 danli;instance;getInstance ,其他是额外实现的类。
* */
public class danli {
    private static danli instance=new danli();//重要
    private Map<String, String> info = new HashMap<String, String>();

    public Map<String, String> getInfo() {
        return info;
    }

    private danli(){ } //重要
    public static danli getInstance() {
        return instance;
    } //重要

    public void init(){
        info.put("a","b");
    }
    public int add2(int m,int n){
        return m+n;
    }

}
