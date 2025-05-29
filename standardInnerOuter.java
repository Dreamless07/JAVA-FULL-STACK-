class outerclassnew{//outer
    private class innerclass{//private inner
        void newmmethod(String nameofperson, int ageofperson){//a method with arguments
            System.out.println("Name of the person is "+nameofperson+" and the age is "+ageofperson);//cannot access outside outer class with object
        }
    }
    void anotherclassnew(){//to access inner class we use another method inside outer class
        innerclass objinner=new innerclass();//create object to access inner class now
        objinner.newmmethod("Saad",22);
    }
}
public class standardInnerOuter {
    public static void main(String[] args) {
        outerclassnew objouter=new outerclassnew();//create object for outer class
        objouter.anotherclassnew();
    }
}
