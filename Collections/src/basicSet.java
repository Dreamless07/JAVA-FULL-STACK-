import java.util.HashSet;
import java.util.Set;//inbuilt
public class basicSet {
    public static void main(String[] args) {
        Set<Integer> newSet= new HashSet<>();//in set: hashset,linkedHashset or treeSet
        newSet.add(1);
        newSet.add(13);
        newSet.add(4);
        newSet.add(10);
        System.out.println(newSet);
        newSet.remove(2);
        System.out.println(newSet.contains(2));
        System.out.println(newSet);
    }
}
