class Virat{
    int  id;
    String name;


    public Virat(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class Mahi extends  Virat{
    int  mid;
    String mname;


    public Mahi(int id, String name) {
        super(id, name);
        this.mid=mid;
        this.mname=mname;

    }
    void display(){
        System.out.println(id+" "+name);
    }
}
public class Super {
    public static void main(String[] args){
        Mahi m=new Mahi(1,"charan");
        m.display();

    }
}
