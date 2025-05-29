class OC{//outer
    class IC{//private inner
        void NM(){//a method
            System.out.println("Accessed the private class");//cannot access outside outer class with object
        }
    }
    void AC(){//to access inner class we use another method inside outer class
        IC objinner=new IC();//create object to access inner class now
        objinner.NM();
    }
}
public class InnerOuterforboth {
    public static void main(String[] args) {
        OC OO=new OC();
        OO.AC();
        OC.IC IO=OO.new IC();
    }
}
