class threadclass1 extends Thread{//using Thread for simultaneous execution of both class
    public void run(){//inbuilt method 'run' when using Thread
        for (int i=0;i<5;i++){
            System.out.println("Java");
            try{Thread.sleep(2000);} catch(Exception e){System.out.println("No");}//sleep for 2sec and then print
        }
    }
}
class threadclass2 extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("Kotlin");
            try{Thread.sleep(2000);} catch(Exception e){System.out.println("No");}
        }
    }
}

public class threads {
    public static void main(String[] args) {
        threadclass1 newob1= new threadclass1();
        threadclass2 newob2= new threadclass2();//object
        newob1.start();//use start for method calling when using run method
        newob2.start();
    }
}


