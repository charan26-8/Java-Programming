public class Run extends Thread{
    public void run(){
        try {
            for (int i = 1; i < 5; i++) {
                Thread.sleep(500);
                System.out.println(i);
            }
        }
        catch(Exception e){
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        Run r=new Run();
        Run r1=new Run();
        r.run();
        r1.run();
    }
}
