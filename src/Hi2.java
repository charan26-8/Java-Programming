
interface Employee{
    public final int id=10;
    public abstract void getId();
}
interface Org{
    public final int rollno=20;
    public abstract void getRollno();
}
class World implements Employee,Org{
    public void getId(){
        System.out.println("ID ="+id);
    }
    public void getRollno(){
        System.out.println("RollNo ="+rollno);
    }
    void display(){
        System.out.println("Addition ="+(id+rollno));
    }
}
class Hi2{
    public static void main(String[] args){
        World w=new World();
        w.getId();
        w.getRollno();
        w.display();
    }

}
