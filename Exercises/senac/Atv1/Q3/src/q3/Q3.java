package q3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Technical In Systems Analysis and Development - SENAC EAD
 * Main class of Question 3, Exercise 1
 * @author Kelvin Coelho Loiola
 * @since 2022-08-15
 */
public class Q3 {

    static Scanner in = new Scanner(System.in);

    /**
     * Validates the value of the daily tax rate from a hotel
     * @return The daily tax rate value
     */
    public static float readHotelRate() {
        float value = 0;
        while (value <= 0) {
            System.out.print("Enter the hotel's daily rate: ");
            value = Float.parseFloat(in.nextLine());
            if (value <= 0) {
                System.out.println("\t***Invalid hotel`s daily rate!***\n\t***Try again!***");
            }
        }
        return value;
    }

    /**
     * Validates the age of the client
     * @return Age
     */
    public static int readAge() {
        int value = 0;
        while (value <= 0) {
            System.out.print("Enter the Client's age: ");
            value = Integer.parseInt(in.nextLine());
            if (value <= 0) {
                System.out.println("\t***Invalid age!***\n\t***Try again!***");
            }
        }
        return value;
    }

    /**
     * Reads the name of the guest
     * @return Name
     */
    public static String readName() {
        System.out.print("Enter the Client's name (type STOP to finish client Insert: ");
        String value = in.nextLine();

        return value;
    }

    /**
     * main program 
     */
    public static void main(String[] args) {
        ArrayList<Client> clientList = new ArrayList<Client>();
        float hotelDailyFees = readHotelRate();
        float totalFees = 0;
        int halfCount = 0;
        int freeCount = 0;
        String readname = "";
        int readage;

        while (!(readname = readName()).equals("STOP")) {
            readage = readAge();
            Client x = new Client(readname, readage);
        
            if (x.getAge() < 4) {
                System.out.println(x.getName() + " has free pass!");
                freeCount++;
            } else if (x.getAge() > 80) {
                System.out.println(x.getName() + " pays half of the fees!");
                totalFees += hotelDailyFees / 2;
                halfCount++;
            } else {
                totalFees += hotelDailyFees;
            }
            
            clientList.add(x);
        }

        System.out.println("Total Fees from accomodation: R$" + totalFees);
        System.out.println(freeCount + " free pass;");
        System.out.println(halfCount + " half pass;");

    }

}
