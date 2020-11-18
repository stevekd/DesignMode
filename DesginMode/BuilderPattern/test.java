package DesginMode.BuilderPattern;

/**
 * Test.java
 *  测试类
 */
public class test {
    public static void main(String[] args) {
        Director director = new Director();
        Product create = director.create(new ConcreteBuilder());
        System.out.println(create.toString());
    }
}