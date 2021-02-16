package cn.tpw.demo.decorator.decorator01;

public class test01 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();
        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        redRectangle.draw();
    }
}
