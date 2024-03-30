import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pool{
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(10);
        for (int i = 1; i < 10; i++) {
            MyRunnable r = new MyRunnable("my workerthread " + i);
            es.execute(r);


        }
        es.shutdown();
        while(!es.isTerminated()){

        }
        System.out.println("All requests completed successfully");
    }
}

