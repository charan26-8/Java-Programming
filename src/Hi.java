class School{
    void provideclass(){
        System.out.println("classes");
    }
}
class Teacher extends School{
    void teach(){
        System.out.println("teaching");
    }
}
class Student extends School{
    void study(){
        System.out.println("studying");
    }


}
class Hi{
    public static void main(String[] args){
        Student s=new Student();
        s.provideclass();
        s.study();


    }
}