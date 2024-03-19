public class NestedTry{
    public static void main(String[] args) {
        try{
            try{
                System.out.println("going to divide by 0");
                int b=39/0;

            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
            try{
                int a[]=new int[5];
                a[5]=1;

            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            System.out.println("other stmt");
        }
        catch(Exception e){
            System.out.println("Handled the exception handled outer catch");
        }
        System.out.println("NormalFlow");
    }

}
