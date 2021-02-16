package cn.tpw.demo.builder.bulider01;

public class Burger implements Item {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Packing packing() {
        return null;
    }

    @Override
    public float price() {
        return 0.0f;
    }
}
