import java.util.LinkedList;
import java.util.Queue;//inbuilt
public class basicQueue {
    public static void main(String[] args) {
        Queue<String> newQ=new LinkedList<>();//can use 3 inbuilt classes ll, arraydeque and priority queue
        newQ.offer("Jim");//insert
        newQ.offer("Jack");
        newQ.offer("Raze");
        System.out.println(newQ);
        System.out.println(newQ.peek());//read first element
        System.out.println(newQ);
        newQ.poll();//remove first element
        System.out.println(newQ);
        newQ.add("justin");
        System.out.println(newQ);
        System.out.println(newQ.contains("Jack"));
        newQ.remove("Raze");
        System.out.println(newQ);
        newQ.clear();
        System.out.println(newQ);
    }
}
