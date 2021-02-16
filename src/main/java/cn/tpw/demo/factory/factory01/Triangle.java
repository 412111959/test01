package cn.tpw.demo.factory.factory01;

public class Triangle implements Shape{

    private String name;

    public void setName(String name){
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("draw::"+this.name);
    }
}
