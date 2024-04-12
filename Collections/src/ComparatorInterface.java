import java.util.*;
public class ComparatorInterface{
    public static void main(String args[]){
        ArrayList<Laptop2> al=new ArrayList<Laptop2>();
        al.add(new Laptop2("Dell",34,23));
        al.add(new Laptop2("Acer",343,27));
        al.add(new Laptop2("Lenovo",342,21));
        Comparator<Laptop2> com=new Comparator<Laptop2>()
        {
            public int compare(Laptop2 lap1,Laptop2 lap2) {
                if(lap1.getPrice()>lap2.getPrice()) {
                    return 1;

                }else {
                    return -1;
                }

            }
        };

        Collections.sort(al,com);
        for(Laptop2 st:al){
            System.out.println(st);//comparable interface in java means to sort the elements in the use-defined manner

        }
    }
}