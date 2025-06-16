import java.util.LinkedList;
public class listWithLinkedList {
    public static void main(String[] args) {
        LinkedList<String> lnew =new LinkedList<>();//list object through linked list
        lnew.add("Jim");
        lnew.add("Raymond");
        lnew.add("Skyros");//also can use remove, set, contains etc. methods also
        System.out.println(lnew);
        lnew.addFirst("Bob");//add in first
        System.out.println(lnew);
        lnew.addLast("Reyes");//add in last
        System.out.println(lnew);
        lnew.removeFirst();//remove first node
        System.out.println(lnew);
        lnew.removeLast();//remove last node
        System.out.println(lnew);
        lnew.clear();//clear all elements
        System.out.println(lnew);
    }
}
