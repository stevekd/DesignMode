package DesginMode.BuilderPattern.jianhuaBuilderPattern;

/**
 * Test.java
 *  测试类
 */
public class Test {
    public static void main(String[] args) {
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        Product build = concreteBuilder
                .bulidA("牛肉煲")
//              .bulidC("全家桶")
                .bulidD("冰淇淋")
                .build();
        System.out.println(build.toString());
    }
}
