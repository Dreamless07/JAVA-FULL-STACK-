interface AB{
    void classA();
}
public class lambdaFunction {
    public static void main(String[] args) {
        AB ob=() -> System.out.println("Hello");//no need to write anonymous class and object instead just use lambda class
        ob.classA();//directly take interface name and then directly call that class through object
    }
}
