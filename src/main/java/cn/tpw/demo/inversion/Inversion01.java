package cn.tpw.demo.inversion;

public class Inversion01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.send(new Message());
        person.send(new WX());
    }
}
interface ISend{
    public String sendMessage();
}
class Message implements ISend{
    @Override
    public String sendMessage() {
        return "短信";
    }
}
class WX implements ISend{
    @Override
    public String sendMessage() {
        return "微信";
    }
}
class Person{
    public void send(ISend send){
        System.out.println(send.sendMessage());
    }
}
