class combine{//CLASS
    String name;
    int age;
    combine(String n, int a){//CONSTRUCTOR
        name=n;
        age=a;

    }
    public void details(){//METHOD
        System.out.println(name+" "+age);
    }
}

public class methodsandconstructors{
    public static void main(String[] args) {
        combine obj=new combine("saad", 22);
        obj.details();//CALL METHOD
    }
}