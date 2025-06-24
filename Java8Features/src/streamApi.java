import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;//for filter only when using without lambda
import java.util.function.Function;//for map only when using without lambda
import java.util.function.BinaryOperator;//for reduce only when using without lambda
public class streamApi {
    public static void main(String[] args) {
        List<Integer> n1 = Arrays.asList(1, 2, 3, 4, 5, 6);//stores elements in n1 directly as list
        //Stream is both Interface & method, can be used only once, converts n1 into stream
        System.out.println(n1);//we have used lambda function for all below
        Integer sum=n1.stream().filter(i -> i % 2 == 0)//Predicate is functional interface, inbuilt method is Test in Filter
                               .map(i -> i*2)//Function is functional interface, inbuilt method is Apply in Map
                               .reduce(0,(i,j)->i+j);//Binary Operator is FI, inbuilt method is Apply in Reduce
        System.out.println(sum);
        //can use forEach(System.out::println) method reference only if many iterations
    }
}
