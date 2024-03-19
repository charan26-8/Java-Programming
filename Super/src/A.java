interface A{
void print();
}
class B implements A{
    public void print(){
        System.out.println("hello");

    }
    public static void main(String[] args){
        B b=new B();
        b.print();
    }
}
