class example{//class
    protected void display(){//protected modifier method, so it can be access from anywhere
        System.out.println("This is a protected class");
    }
}

public class protectedexample {
    public static void main(String[] args) {
        example ob=new example();//obj created
        ob.display();//call the method
    }
}
