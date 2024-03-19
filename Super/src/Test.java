
abstract class Shape {
    abstract void draw();


}
class Rectangle extends Shape{
    void draw(){
        System.out.println("It is a rectangle");
    }
}
class Circle extends  Shape{
    void draw(){
        System.out.println("It is a circle");
    }
}
class Test{
    public static void main(String[] args) {
        Circle c=new Circle();
        c.draw();

    }
}

