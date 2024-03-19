class One{
    int x;
    void getx(){
        x=100;
        System.out.println("x value ="+x);

    }
}
class Two extends One{
    int y,total ;
    void gety(){
        y=200;
        System.out.println("y value ="+y);

    }
    void sum(){
        total=x+y;
        System.out.println("Addition ="+total);
    }

}
class Main{
    public static void main(String[] args){
        Two t=new Two();
        t.getx();
        t.gety();
        t.sum();
    }
}