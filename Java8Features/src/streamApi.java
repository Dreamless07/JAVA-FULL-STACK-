import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;//inbuilt libraries

public class streamApi {
    public static void main(String[] args) {
        List<Integer> n1 = Arrays.asList(1,2,3,4,5,6);//stores elements in nl
        System.out.println(n1);
        //predicate is also a functional interface(inbuilt)
        Stream s1= n1.stream();//Stream is both Interface & method, can be used only once, converts n1 into stream and stores in s1
        s1.forEach(System.out::println);//method reference for : for-each method(can print like this)
    }
}
