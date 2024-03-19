class Bank {
    int  getRateOfInterest(){
        return 8;
    }
}
class Axis extends Bank{
    int getRateOfInterest(){
        return 9;
    }
}
class ICIC extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class Union extends Bank{
    int getRateOfInterest(){
        return 6;
    }
}
class MethodOverriding{
    public static void main(String[] args){
        Union u=new Union();
        ICIC i=new ICIC();
        Axis a=new Axis();
        System.out.println("Union Bank of Interest ="+u.getRateOfInterest());
        System.out.println("ICIC  Bank of Interest ="+i.getRateOfInterest());
        System.out.println("Axis Bank of Interest ="+a.getRateOfInterest());


    }
}