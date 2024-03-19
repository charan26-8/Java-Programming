class Vehicle {
    void model(){
        System.out.println("vehicle model");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("car driving");
    }
}
class Honda extends Car{
    void xuv(){
        System.out.println("xuv honda");
    }
}
class Multilevel{
    public static void main(String[] args){
        Honda h=new Honda();
        h.model();
        h.drive();
        h.xuv();
    }
}