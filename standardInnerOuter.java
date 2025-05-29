class outerclassnew{//outer
    private class innerclass{//private inner
        void emp(String empname, int empid){//a method with arguments
            System.out.println("Name of the employee is "+empname+" and the ID is "+empid);//cannot access outside outer class with object
        }
        void dept(String nameofdept, int deptid){
            System.out.println("Name of the department is "+nameofdept+" and the ID is "+deptid);
        }
    }
    void anotherclassnew(){//to access inner class we use another method inside outer class
        innerclass objinner=new innerclass();//create object to access inner class now
        objinner.emp("Saad",22);
        objinner.dept("Full Stack Engineer",2215);
    }
}
public class standardInnerOuter {
    public static void main(String[] args) {
        outerclassnew objouter=new outerclassnew();//create object for outer class
        objouter.anotherclassnew();
    }
}
