package classwork;

public class Employee {
    public static void main(String[] args) {
        System.out.println(" Employee schedule for (John)");


        String[] daysOfweek = new String[7];


        daysOfweek[0] = "Monday 8A-4P";
        daysOfweek[1] = "Tuesday 8A-4P";
        daysOfweek[2] = "Wednesday 8A-4P";
        daysOfweek[3] = "Thursday 8A-4P";
        daysOfweek[4] = "Friday 8A-4P ";
        daysOfweek[5] = "Saturday (off)";
        daysOfweek[6] = "Sunday (off)";


        System.out.println(daysOfweek[0]);
        System.out.println(daysOfweek[1]);
        System.out.println(daysOfweek[2]);
        System.out.println(daysOfweek[3]);
        System.out.println(daysOfweek[4]);
        System.out.println(daysOfweek[5]);
        System.out.println(daysOfweek[6]);

        for(int x = 0; x>=daysOfweek.length -1; x++){
            System.out.println(daysOfweek[x]);
        }
    }
}
