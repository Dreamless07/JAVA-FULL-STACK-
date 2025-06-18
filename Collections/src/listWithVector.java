import java.util.List;
import java.util.Vector;
public class listWithVector {
    public static void main(String[] args) {
        List<String> vec=new Vector<>();
        vec.add("1VJ21AI022");
        vec.add("1VJ21AI023");
        vec.add("1VJ21AI024");
        vec.add("1VJ21AI001");
        System.out.println(vec);
        System.out.println(vec.get(2));
        vec.clear();//clear all elements
        System.out.println(vec);
    }
}
