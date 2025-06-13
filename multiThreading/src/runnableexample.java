class waterfills implements Runnable{//runnable is the inbuilt interface
    public void run(){//since we cannot create objects and run method in interface directly so we instance of threads and runnable interface
        for (int i=10;i<=50;i+=10){
            System.out.println(i+"%");
            System.out.println("Filling the tank");
            if(i==50){
                System.out.println("Filled the tank");
            }
            try{Thread.sleep(2000);} catch(Exception e){System.out.println("No");}//sleep for 2sec and then print
        }
    }
}

public class runnableexample {
    public static void main(String[] args) {
        Runnable runob1=new waterfills();//runnable object but cannot be called
        Thread th1=new Thread(runob1);//create thread object with reference of Runnable object to call
        th1.start();
    }
}
