class internew1 implements Runnable{//runnable is the inbuilt interface
    public void run(){//since we cannot create objects and run method in interface directly so we instance of threads and runnable interface
        for (int i=0;i<5;i++){
            System.out.println("Java");
            try{Thread.sleep(2000);} catch(Exception e){System.out.println("No");}//sleep for 2sec and then print
        }
    }
}
class internew2 implements Runnable{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("Python");
            try{Thread.sleep(2000);} catch(Exception e){System.out.println("No");}//sleep for 2sec and then print
        }
    }
}

public class threadsbyInterface {
    public static void main(String[] args) {
        Runnable objint1=new internew1();//runnable object but cannot be called
        Runnable objint2=new internew2();
        Thread t1=new Thread(objint1);//create thread object with reference of Runnable object to call
        Thread t2=new Thread(objint2);
        t1.start();
        t2.start();
    }
}
