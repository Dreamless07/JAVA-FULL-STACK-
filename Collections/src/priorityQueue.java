import java.util.PriorityQueue;
public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> pqueue=new PriorityQueue<>();//similar to queue but difference in priority
        pqueue.add("Parks");
        pqueue.add("Aiden");
        pqueue.add("Sam");//priority queue stores elements in order ie alphabetical or numerical etc.
        System.out.println(pqueue);
        System.out.println(pqueue.peek());//peek method also works in ordered manner
    }
}
