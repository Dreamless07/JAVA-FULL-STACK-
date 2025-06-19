import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashSet {
    public static void main(String[] args) {
        Set<String> names=new LinkedHashSet<>();//linked hashset(ordered)
        names.add("Lion");
        names.add("Elephant");
        names.add("Deer");
        System.out.println(names);
    }
}
