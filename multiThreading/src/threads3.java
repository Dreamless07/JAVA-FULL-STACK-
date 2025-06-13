class conversation extends Thread {
    String person1;
    String[] message;//initialize variables, message var will be string array because we have many messages

    conversation(String person1, String[] message) {
        this.person1 = person1;//local and instance variables
        this.message = message;
    }

    public void run() {
        for (String msg : message) {//for each loop used for arrays specifically
            System.out.println(person1 + ":" + msg);
            try {
                Thread.sleep(3000);//multithread delay
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class threads3 {
    public static void main(String[] args) {
        String[] user1 = {"hi", "how are you", "where do you live"};//arrays for both people in string format
        String[] user2 = {"hello", "i am good", "i live in Bangalore"};
        Thread p1 = new conversation("ajay", user1);//threads of both
        Thread p2 = new conversation("arun", user2);
        p1.start();
        p2.start();//start
    }
}
