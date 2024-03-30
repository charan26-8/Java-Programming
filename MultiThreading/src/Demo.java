public class Demo extends Thread{
    public void run(){
        System.out.println("Name ="+Thread.currentThread().getName());
        System.out.println("Daemon ="+Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
        Demo d1=new Demo();
        Demo d2=new Demo();
        d1.setDaemon(true);
        d1.start();
        d2.start();
    }
}
