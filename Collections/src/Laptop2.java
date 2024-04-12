public class Laptop2  {
    private String name;
    private int price;
    private int ram;

    Laptop2(String name, int price, int ram) {

        this.name = name;
        this.price = price;
        this.ram = ram;
    }



    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getRam() {
        return ram;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    @Override
    public String toString() {
        return "Laptop2 [name=" + name + ", price=" + price + ", ram=" + ram + "]";
    }




}
