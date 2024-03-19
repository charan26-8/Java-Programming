class NestedTryBlock2{
    public static void main(String[] args) {
        try {
            try {
                try {
                    int a[] = new int[5];
                    System.out.println(a[10]);

                } catch (ArithmeticException e) {
                    System.out.println(e);
                    System.out.println("inner try block2");
                }
            } catch (ArithmeticException e) {
                System.out.println(e);
                System.out.println("inner ty block 1");
            }
        }
            catch(ArrayIndexOutOfBoundsException e4){
                System.out.println(e4);
                System.out.println("outer try block");

            }
            catch(Exception e){
                System.out.println("exception");
                System.out.println("handles");
            }

    }
}