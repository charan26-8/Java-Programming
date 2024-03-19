abstract class Bike {
    Bike(){
        System.out.println("It is a constructor");
    }
    abstract void run();
    void ride(){
        System.out.println("It is method ");

    }
}
class Honda extends Bike{
    void run(){
        System.out.println("It is abstract bike override");
    }

    public static void main(String[] args) {
        Honda h=new Honda();
        h.run();
        h.ride();
    }
}
