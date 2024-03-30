//By using thread class and using (string name,runnable r)
public class Dhoni implements Runnable{
    public void run(){
        System.out.println("Captain of india");
    }

    public static void main(String[] args) {
        Dhoni d=new Dhoni();
        Thread t=new Thread(d,"Dhoni is an ");
        t.start();
        String str=t.getName();
        System.out.println(str);


    }
}
