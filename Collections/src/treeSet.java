import java.util.Set;
import java.util.TreeSet;
public class treeSet {
    public static void main(String[] args) {
        Set<Integer> nt= new TreeSet<>();//treeSet(ordered)
        nt.add(8);
        nt.add(3);
        nt.add(1);
        nt.add(0);
        System.out.println(nt);
    }
}
