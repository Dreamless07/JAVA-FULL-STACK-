class threadnew1 extends Thread{//using Thread for simultaneous execution of both class
    public void run(){//inbuilt method 'run' when using Thread
            System.out.println("Red, Stop");
    }
}
class threadnew2 extends Thread{
    public void run(){
            System.out.println("Yellow, Caution");
    }
}
class threadnew3 extends Thread{
    public void run(){
            System.out.println("Green, GOOOO");
    }
}
public class threads2 {
    public static void main(String[] args) {
        threadnew1 newo1= new threadnew1();
        threadnew2 newo2= new threadnew2();//object
        threadnew3 newo3= new threadnew3();
        newo1.start();//use start for method calling when using run method
        try{Thread.sleep(3000);} catch(Exception e){System.out.println("No");}//delay and then print
        newo2.start();
        try{Thread.sleep(3000);} catch(Exception e){System.out.println("No");}
        newo3.start();
    }
}
