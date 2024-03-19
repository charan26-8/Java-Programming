public class MultiCatch {
    public static void main(String[] args) {
        try{
            String s=null;
            System.out.println(s.length());

           /* int a[]=new int[5];
            a[5]=20/0;
            System.out.println(a[10]);*/

        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occurs");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndex occurs");
        }catch (Exception e){
            System.out.println("hello");

        }
        System.out.println("bye");
    }
}
