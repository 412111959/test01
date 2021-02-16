package cn.tpw.demo.builder.bulider01;

public class VegBurrger extends Burger{

    @Override
    public String name() {
        return "VegBurrger";
    }

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public float price() {
        return 10.2f;
    }
}
