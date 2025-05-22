class publicnew{//class
    public void display(){//method
        System.out.println("This is a public access modifier");
    }
}

public class publicaccessmod {
    public static void main(String[] args) {
        publicnew obj=new publicnew();//object created
        obj.display();//access the method publicly
    }
}
