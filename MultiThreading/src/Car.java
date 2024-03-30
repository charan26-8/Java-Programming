public class Car extends Thread {
    public void run(){
        for (int i=1;i<=5;i++) {
            try {
                System.out.println(i);
                Thread.sleep(700);
            }catch(Exception e){

            }
        }
    }

    public static void main(String[] args) {
        Car c=new Car();
        Car c1=new Car();
       /* System.out.println("Thread name="+c.getName());
        c.setName("charan");
        System.out.println("Thread name after change="+c.getName());
        System.out.println("Thread priority ="+c.getPriority());
        c.setPriority(10);
        System.out.println("Thread priority after change="+c.getPriority());
        //c.start();
        System.out.println("Thread status ="+c.isAlive());*/
        c.start();
        try{
            c.join();
        }catch(Exception e){

        }

        c1.start();

    }
}
