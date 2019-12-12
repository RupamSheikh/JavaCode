package classwork;

public class Phone {
    public static void main(String[] args) {

            System.out.print("I am planing to buy a phone");
            Phone myPhone = new Phone();
            myPhone.call();
            myPhone.calender();
            myPhone.picture();
    }
        public void calender() {
        System.out.println("Phone should have a calender");
    }
        public void call(){
        System.out.println("Phone should make call ");
    }
        public void picture(){
        System.out.println(" should be able to take picture");
        }
}
