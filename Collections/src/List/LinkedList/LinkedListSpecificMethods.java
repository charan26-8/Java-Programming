package List.LinkedList;

import java.util.LinkedList;

public class LinkedListSpecificMethods {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add("Dog");
        l.add("Dog");
        l.add("Cat");
        l.add("Horse");
        System.out.println(l);//[Dog, Dog, Cat, Horse]

        l.addFirst("Tiger");
        l.addLast("Elephant");
        System.out.println(l);//[Tiger, Dog, Dog, Cat, Horse, Elephant]
        System.out.println(l.getFirst());//Tiger
        System.out.println(l.getLast());//Elephant

        l.removeFirst();
        l.removeLast();
        System.out.println("AFter removing first and last elemnts:"+l);//AFter removing first and last elemnts:[Dog, Dog, Cat, Horse]
    }

}
