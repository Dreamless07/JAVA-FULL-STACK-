//Encapsulation
class aboutperson {//class
    private String name = "Saad";
    private int age = 22;//private variables

    public String getName() {
        return name;//to access private var we use get() method /can also use a public method(performing encapsulation)
    }

    public void setName(String name1) {
        this.name = name1;//to set different value to the var we use set() method
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age1) {
        this.age = age1;
    }
}

public class basicEncapsulation {
    public static void main(String[] args) {
        aboutperson OBJ= new aboutperson();
        OBJ.getName();//calling the getter method to access private(hidden) details
        OBJ.getAge();
        System.out.println("Name: "+OBJ.getName()+"\nAge: "+OBJ.getAge());//print
        OBJ.setName("Aftab");//calling setter method to change the private value
        OBJ.setAge(23);
        System.out.println("Name: "+OBJ.getName()+"\nAge: "+OBJ.getAge());//print it again by calling get with updated value now

    }
}
