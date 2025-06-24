import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class streamApi {
    public static void main(String[] args) {
        List<Integer> n1 = Arrays.asList(1, 2, 3, 4, 5, 6);//stores elements in n1 directly as list
        System.out.println(n1);
        n1.stream().filter((Integer i) -> i % 2 == 0).forEach(System.out::println);//predicate is also a functional interface(inbuilt) in Filter
        //Stream is both Interface & method, can be used only once, converts n1 into stream and stores in s1
        //method reference for : for-each method(can print like this)
    }
}
