class dog{
    String name;
    dog(String name){
        this.name=name;
    }
    void print1(){
        System.out.println("The dog name is "+name);
    }
}
class Baby_dog extends dog{
    String color;
    String age;
    Baby_dog(String name, String color, String age){
        super(name);
        this.color=color;
        this.age=age;
    }
    void print2(){
        System.out.println("The baby dog name is "+name+" the color is "+color);
    }
    void extra(){
        System.out.println("the age is "+age);
    }
}

public class SIpractice {
    public static void main(String[] args) {
        dog ob1=new dog("Bruno");
        Baby_dog ob2=new Baby_dog("Tom","Brown","2");
        ob1.print1();
        ob2.print2();
        ob2.extra();
    }
}
