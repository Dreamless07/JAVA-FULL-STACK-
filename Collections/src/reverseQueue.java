//Reverse a queue using Stack
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class reverseQueue {
    public static void main(String[] args) {
        Queue<Integer> newQ = new LinkedList<>();
        Stack<Integer> newS = new Stack<>();
        newQ.add(9);
        newQ.add(4);
        newQ.add(8);
        newQ.add(5);
        newQ.add(3);
        System.out.println(newQ);
        while (!newQ.isEmpty()) {//until queue is empty push all elements to stack
            newS.push(newQ.poll());//push elements from queue to stack and pop from Queue simultaneously
        }
        while (!newS.isEmpty()) {
            newQ.offer(newS.pop());//push elements from Stack to queue again and pop from Stack simultaneously
        }
        System.out.println(newQ);
    }
}
