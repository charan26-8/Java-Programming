//By string name using thread class

public class Chitti {
    public static void main(String[] args) {
        Thread t=new Thread("hello");
        t.start();
        String str=t.getName();
        System.out.println(str);

    }
}
