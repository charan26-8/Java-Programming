//by extending thread class
class Robo extends Thread{

    public void run(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
      Robo r=new Robo();
      r.start();

    }
}