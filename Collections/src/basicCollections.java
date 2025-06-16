import java.util.ArrayList;
import java.util.Collection;//inbuilt libraries
public class basicCollections {
    public static void main(String[] args) {
        Collection<String> name=new ArrayList<>();//Since we cannot create object directly from interface we use inbuilt class ie Arraylist etc.
        name.add("Bob");
        name.add("Harry");
        name.add("Burton");
        System.out.println(name);
    }
}
