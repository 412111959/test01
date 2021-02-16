package cn.tpw.demo.builder.bulider01;

public class MealBuilder {
    public static void main(String[] args) {
        Meal meal = new Meal();
        meal.addItem(new VegBurrger());
        meal.addItem(new ChickenBurrger());
        meal.showDetail();
    }
}
