package cn.tpw.demo.factory.factory01;

public class Factory {
    public Shape getShape(String type){
        if(type == null){
            return null;
        }else {
            if (type == "Circle"){
                Circle circle = new Circle();
                circle.setName("circle");
                return circle;
            }else if (type == "Square"){
                Square square = new Square();
                square.setName("square");
                return square;
            }

            return null;
        }
    }
}
