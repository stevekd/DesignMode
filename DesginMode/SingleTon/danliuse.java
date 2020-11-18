package DesginMode.SingleTon;

import DesginMode.SingleTon.danli;

import java.util.Map;

public class danliuse {
    public static void main(String[] args) {

       danli.getInstance().init();
        int i = danli.getInstance().add2(2, 3);
        Map<String, String> info = danli.getInstance().getInfo();
        System.out.println(info);
        System.out.println(i);
        i=9+8;
        System.out.println(i);

    }
}
