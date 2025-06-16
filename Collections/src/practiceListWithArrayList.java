import java.util.ArrayList;
import java.util.List;
public class practiceListWithArrayList {
    public static void main(String[] args) {
        List<String> fruits= new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Banana");
        fruits.add("Kiwi");
        System.out.println(fruits.size());
        System.out.println(fruits);
        System.out.println(fruits.get(1));
        System.out.println(fruits);
        fruits.set(4,"Pineapple");//change element
        System.out.println(fruits);
        fruits.remove(2);//remove element
        System.out.println(fruits);
        System.out.println(fruits.contains("Apple"));//check for element
    }
}
