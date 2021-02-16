package cn.tpw.demo.adapter;

import cn.tpw.demo.adapter.adapter01.Adapter01;

public class adapter {
    public static void main(String[] args) {
        new Adapter01(){
            @Override
            public void m1() {
                System.out.println("001");
            }
        }.m1();

    }
}
