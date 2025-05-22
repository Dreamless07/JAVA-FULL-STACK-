class noaccess {//class
    private int number = 10;
    private void display() {//method
        System.out.println("accessed the method from another method");
    }
    void accessdisplayfunc () {//added one more method inside the class to access the private method
        display();//calls it
    }
}
public class accessmodifiers {
    public static void main(String[] args) {
        noaccess obj = new noaccess();//create object
        obj.accessdisplayfunc();//call the method
    }
}
