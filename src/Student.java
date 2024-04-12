class Student implements Comparable<Student>{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }



    public int getRollno() {
        return rollno;
    }



    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }



    public void setRollno(int rollno) {
        this.rollno = rollno;
    }



    public void setName(String name) {
        this.name = name;
    }



    public void setAge(int age) {
        this.age = age;
    }




    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
    }



    public int compareTo(Student st){
        if(this.getAge()>st.getAge())
            return 1;
        else
            return -1;
    }
}