class java{  // class declaration
    public void person(String name, int age )
    {//method declaration
        System.out.println(name+" "+age);
    }
    public void phone(String brand, String colour) {
        System.out.println(brand + " " + colour);
    }
}

public class methodsprog {
    public static void main(String[] args) {
        java obj=new java();
        obj.person("ajay", 18);
        obj.phone("xiaomi", "red");
    }
}
