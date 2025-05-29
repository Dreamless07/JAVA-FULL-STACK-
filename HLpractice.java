class CAR1{
    String color;
    CAR1(String color){
        this.color=color;
    }
    void display0(){
        System.out.println("The Car is "+color);
    }
}
class bmw1 extends CAR1{
    String price;
    bmw1(String color, String price){
        super(color);
        this.price=price;
    }
    void display1(){
        System.out.println("The BMW is "+color+" and the price is "+price);
    }
}
class AUDI extends CAR1{
    String price1;
    AUDI(String color, String price){
        super(color);
        this.price1=price;
    }
    void display2(){
        System.out.println("The AUDI is "+color+" and the price is "+price1);
    }
}

public class HLpractice {
    public static void main(String[] args) {
        CAR1 ob1=new CAR1("Red");
        bmw1 ob2=new bmw1("Red","70 Lakh");
        AUDI ob3=new AUDI("Blue","20 Lakh");
        ob1.display0();
        ob2.display1();
        ob3.display2();
    }
}
