package q1;

import java.util.Scanner;

/**
 * Technical In Systems Analysis and Development - SENAC EAD
 * Main class of Question 1, Exercise 1
 * @author Kelvin Coelho Loiola
 * @since 2022-08-15
 */
public class Q1 {
        static final int ALFA = 150;
        static final int EXTRAALFA = 70;
//        static final int MAXBETA = 350;
        static Scanner in = new Scanner(System.in);
        
        /**
         * Validades the input of the quantity of guests
         * @return The quantity of guests
         */
        public static int SetGuestsQuantity()
        {
            int guests = 0;
            while (guests <= 0 || guests > 350)
            {
                System.out.println("How many guests will attend the event?");
                guests = in.nextInt();
                if (guests <= 0 || guests > 350)
                {
                    System.out.println("\t\t***Invalid quantity of guests.***\n\t***Please insert a number between 1 and 350!***\n");
                    in.nextLine();
                }
            }
            in.close();
            return guests;
        }
        

        /**
         * Set the appropriate auditorium to host the guests
         * @param qg Quantity of Guests
         */
        public static void SetAuditorium(int qg)
        {
            if (qg <= ALFA)
            {
                System.out.println("To " + qg + " guests, use auditorium Alfa");
            }
            else if(qg > ALFA && (qg <= ALFA + EXTRAALFA))
            {
                System.out.println("To " + qg + " guests, use auditorium Alfa\nInclude more " + (qg - ALFA) + " seat(s).");
            }
            else
            {
                System.out.println("To " + qg + " guests, use auditorium Beta");
            }
        }
        
        public static void main(String[] args) {
            int guests = SetGuestsQuantity();
            SetAuditorium(guests);
        }
    
}
