class outerclass{//outer
    private class innerclass{//private inner
        void newmmethod(){//a method
            System.out.println("Accessed the private class");//cannot access outside outer class with object
        }
    }

    void anotherclass(){//to access inner class we use another method inside outer class
        innerclass objinner=new innerclass();//create object to access inner class now
        objinner.newmmethod();
    }
}

public class basicInnerOuterclass {
    public static void main(String[] args) {
        outerclass objouter=new outerclass();//create object for outer class
        objouter.anotherclass();//access outer class first
    }
}
