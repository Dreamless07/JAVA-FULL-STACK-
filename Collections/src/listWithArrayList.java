import java.util.ArrayList;
import java.util.List;//inbuilt libraries
public class listWithArrayList {
    public static void main(String[] args) {
        List<Integer> newList= new ArrayList<>();//list object with inbuilt class
        newList.add(10);
        newList.add(50);
        newList.add(40);
        newList.add(60);//add first
        System.out.println(newList.size());//check size
        System.out.println(newList);
        System.out.println(newList.get(3));//get element
        System.out.println(newList);
        newList.set(1,70);//change element
        System.out.println(newList);
        newList.remove(2);//remove element
        System.out.println(newList);
        System.out.println(newList.contains(10));//check for element
    }
}
