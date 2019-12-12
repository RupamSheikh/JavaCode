package classwork;

public class AirTicket {
    public static void main(String[] args) {
        int airTicketPrice = 400;


        if (airTicketPrice <= 400 && airTicketPrice >= 375) {
            System.out.println("I will fly to my destination");
        } else if (airTicketPrice >= 400) {
            System.out.println("I will take the train to my destination");
        } else {
            System.out.println("Cancel the trip");
        }

    }
}




