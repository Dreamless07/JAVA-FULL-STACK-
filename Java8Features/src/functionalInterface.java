import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;//inbuilt libraries


/*
class example1 implements Consumer<Integer>{//Consumer is a Functional Interface and lambda function can also be used
    public void accept(Integer i){//this Interface contains a default method accept
        System.out.println(i);                                                      // while using normal class definition
    }
}


*/
public class functionalInterface {
    public static void main(String[] args) {
        List<Integer> listOb = Arrays.asList(1,2,3,4,5);//inbuilt Arrays method can use asList directly
        //Consumer<Integer> obj=new example1();//Consumer object creation
        Consumer<Integer>obj=i->System.out.println(i);                       //using lambda function
        listOb.forEach(obj);//call object from for each method to accept method
    }
}
