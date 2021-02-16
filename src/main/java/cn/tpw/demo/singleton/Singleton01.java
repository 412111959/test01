package cn.tpw.demo.singleton;

public class Singleton01 {
    private static final Singleton01 INSTANCE = new Singleton01();
    private Singleton01(){}
    public static Singleton01 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton01 s1 = Singleton01.getInstance();
        Singleton01 s2 = Singleton01.getInstance();
        Singleton01 s3 = Singleton01.getInstance();
        if (s1==s2&&s1==s3){
            System.out.println(true);
        }
        System.out.println(s1);
        System.out.println(s3);
        System.out.println(s2);
    }
}
