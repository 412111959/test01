package cn.tpw.demo.builder.bulider01;

public class ChickenBurrger extends Burger{

    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public float price() {
        return 20.2f;
    }
}
