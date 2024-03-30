public class CurrentThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        CurrentThread ct=new CurrentThread();
        CurrentThread ct2=new CurrentThread();
        ct.start();
        ct2.start();
    }
}
