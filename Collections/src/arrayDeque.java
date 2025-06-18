import java.util.ArrayDeque;
public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> aname=new ArrayDeque<>();//similar to priority queue but can be any order and can insert and delete from both ends
        aname.addFirst("Sam");
        aname.push("Bob");
        aname.push("Chandler");
        aname.push("Alex");
        aname.addLast("Michael");
        System.out.println(aname);
        aname.removeLast();
        System.out.println(aname);
        aname.removeFirst();
        System.out.println(aname);
        System.out.println(aname.peek());
    }
}
