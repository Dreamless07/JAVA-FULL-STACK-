import java.util.PriorityQueue;
public class alphabetpriority {
    public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.add("Sanjay");
        pq.add("Abhi");
        pq.add("Vijay");
        System.out.println(pq);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
