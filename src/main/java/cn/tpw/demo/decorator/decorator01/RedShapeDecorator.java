package cn.tpw.demo.decorator.decorator01;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
//        shape.draw();
        super.draw();
        setBorder();
    }
    public void setBorder(){
        System.out.println("red border");
    }
}
