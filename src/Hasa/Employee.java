package Hasa;

class Employee{
    int empid;
    String empname;
    Address address;

    public Employee(int empid, String empname, Address address) {
        this.empid = empid;
        this.empname = empname;
        this.address = address;
    }

    void display(){
        System.out.println("EmpID ="+empid+" "+"EmpName ="+empname);
        System.out.println("CityName ="+address.cityname+" "+"PostalCode ="+address.postalCode+" "+"StreetName ="+address.streetName);
    }
    public static void main(String[] args){
        Address a=new Address("Nellore",524412,"chillakur");
        Employee e=new Employee(22,"malli",a);
        e.display();
    }
}