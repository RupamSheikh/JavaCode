package classwork;

public class Laptop {
    public static void main(String[] args) {
        System.out.println("I want to buy a laptop");
        Laptop hpLaptop = new Laptop();
        hpLaptop.price();
        hpLaptop.warrenty();
        hpLaptop.memmorie();
        hpLaptop.screensize();
        hpLaptop.color();
    }
    public void price(){
        System.out.println("Price range of this Laptop should be $800.00-$1000.00");
    }
    public void warrenty(){
        System.out.println(" This Laptop must have one year warrenty on it ");
    }
    public void memmorie(){
        System.out.println(" This Laptop must have 8G of memmorie capacity");
    }
    public void screensize(){
        System.out.println(" Screen size of this Laptop has to be 17'");
    }
    public void color(){
        System.out.println(" This Laptop must be in Black color");
    }
}
