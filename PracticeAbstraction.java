abstract class PracticeNew{//abstract class(parent class)
    void Start(){//normal method
        System.out.println("Welcome to the Company");
    }
    abstract void Employee(String name, String ID);//2 abstract methods ie. having no body
    abstract void Department(String DName, String Staff);

}
class access extends PracticeNew{// a derived class(child class)
    void Employee(String name,String ID){//definition is done for both abstract classes in derived class
        System.out.println("The employee name is "+name+" and the ID is "+ID);
    }
    void Department(String Dname, String Staff){
        System.out.println("The department name is "+Dname+" and the ID is "+Staff);
    }
}

public class PracticeAbstraction {
    public static void main(String[] args) {
        access ob23=new access();//object created
        ob23.Start();
        ob23.Employee("Saad","12345");
        ob23.Department("Junior Developers","25 Employees");//accessing the methods
    }
}
