class one {
    int x;
    String name;
    void add(int x,String name){
        x=x;
        name=name;
    }
}

class Two extends one{
    float age;
    void display(int x,String name,float age){
       super.add(1,"charan");
       age=age;

}
void show(){
        System.out.println(x+" "+name+" "+age);
}


}
class Main{
    public static void main(String[] args){
        Two t= new Two();
        t.display(1,"malli",78);
        t.show();

    }
}