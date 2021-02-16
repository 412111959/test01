package cn.tpw.demo.builder.bulider01;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    List<Item> list = new ArrayList<>();
    public List<Item> addItem(Item item){
        list.add(item);
        return list;
    }
    public void name(){
        return;
    }
    public Packing packing(){
        return null;
    }
    public float price(){
        return 0.0f;
    }
    public void showDetail(){
        list.forEach(item-> System.out.println(item.name()+"---"+item.packing().pack()+"----"+item.price()));
    }
}
