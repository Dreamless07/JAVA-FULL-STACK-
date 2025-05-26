//method overloading
class NewClass {// same class for both methods
    public void addition(int a, int b){//diff params same name
        System.out.println(a + b);
    }

    public void addition(int a, int b, int c){//diff params same name
        System.out.println(a + b + c);

    }
}

public class basicpolymorph {
    public static void main(String[] args) {
        NewClass ob = new NewClass();//same object for both
        ob.addition(1, 2, 3);//access based on number,type etc. params
        ob.addition(1, 2);
    }
}
