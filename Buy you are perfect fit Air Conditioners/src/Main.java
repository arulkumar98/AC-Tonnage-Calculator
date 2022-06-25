import java.util.Scanner;

public class Main {

    public static void ac(double l,double b) {
        double roomSize = l * b;
        System.out.println("The square feet of you're room is: " + roomSize + "sq.ft");

        if (roomSize <= 100) {
            System.out.println("Select 0.8 ton ac is over");
        } else if (roomSize <= 150) {
            System.out.println("Select 1 ton ac is over");
        } else if (roomSize <= 250) {
            System.out.println("Select 1.5 ton inverter ac for better energy saving");
            
        } else if (roomSize <= 400) {
            System.out.println("Select 2 ton inverter ac for better energy saving");
        } else if (roomSize > 401) {
            System.out.println("For better performance buy 2 ACs");
        }

    }

            public static void main (String[]args){
                Scanner in = new Scanner(System.in);
                System.out.print("Please enter the you're room length in feet:");
                double l = in.nextInt();
                System.out.print("Please enter the you're room width in feet:");
                double b = in.nextInt();
                ac(l, b);
        }



    }