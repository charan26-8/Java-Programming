abstract class Animal {
    abstract void sleep();

}
class Dog extends Animal{
    void sleep(){
        System.out.println("Dog is barking");
    }
    public static void main(String[] args){
        Animal d=new Dog();
        d.sleep();
    }
}

