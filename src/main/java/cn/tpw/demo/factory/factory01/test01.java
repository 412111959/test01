package cn.tpw.demo.factory.factory01;

public class test01 {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Shape shape01 = factory.getShape("Circle");
        shape01.draw();
        Shape shape02 = factory.getShape("Square");
        shape02.draw();
    }
}
