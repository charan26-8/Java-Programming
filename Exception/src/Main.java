public class Main {

    public static void main(String[] args) {
        int a=19,b=0,res;
        try {
            res = a/b;
            System.out.println(res);

        }
        catch(Exception e){
            System.out.println("hello");
        }
        System.out.println("hi this try catch block");
    }
}