class abc{
    abc(){//constructor
        System.out.println("Constructor body");
    }
}
public class Constructor {
    public static void main(String[] args) {
        abc obj=new abc();//no need to call the constructor
    }
}
