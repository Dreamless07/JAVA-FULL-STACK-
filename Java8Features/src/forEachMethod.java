import java.util.LinkedList;
import java.util.List;
public class forEachMethod {
    public static void main(String[] args) {
        List<Integer> list1=new LinkedList<>();
        list1.add(3);
        list1.add(5);
        list1.add(6);
        list1.add(4);
        list1.add(9);
        list1.forEach(newVar->System.out.println(newVar));//lambda is the arrow and this is the inbuilt method
    }
}
