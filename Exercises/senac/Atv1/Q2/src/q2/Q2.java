package q2;

import java.util.Scanner;

/**
 * Technical In Systems Analysis and Development - SENAC EAD
 * Main class of Question 2, Exercise 1
 * @author Kelvin Coelho Loiola
 * @since 2022-08-15
 */
public class Q2 {

    static Scanner in = new Scanner(System.in);

    /**
     * Static class to create Client objects. Clients have: clientNumber (a count of clients quantity), name and age
     */
    public static class Client {

        private static int clientNumber = 1;
        private static String name;
        private static int age;

        /**
         * Default constructor of Class Client
         */
        public Client() {
            setName();
            setAge();
            clientNumber++; // Increment of the quantity of clientes created
        }

        /**
         * Name Setter
         */
        public static void setName() {
            String _name;
            System.out.print("Type the Client 00" + clientNumber + " name: ");
            _name = in.nextLine();
            name = _name;
        }

        /**
         * Age Setter
         */
        public static void setAge() {
            int _age = 0;
            while (_age <= 0) {
                System.out.print("Type the age of the client: ");
                _age = Integer.parseInt(in.nextLine());
                if (_age <= 0) {
                    System.out.print("Invalid Age!\nPlease insert an age greater than 0: ");
                }
            }
            age = _age;
        }

        /**
         * Name Getter
         * @return Name of the guest
         */
        public static String getName() {
            return name;
        }

        /**
         * Age Getter
         * @return Age of the guest
         */
        public static int getAge() {
            return age;
        }
    } // End of Class Client

    public static void main(String[] args) {
        Client roomA;
        Client roomB;
        Client c1 = new Client();

        roomA = c1;

        Client c2 = new Client();

        if (c1.getAge() < c2.getAge()) {
            roomA = c2;
            roomB = c1;
        } else {
            // roomA = c1; Not necessary as roomA already stores c1 data (line 61)
            roomB = c2;
        }

        if (roomA.getAge() >= 60) {
            System.out.println("Room A is reserved to : " + roomA.getName() + "."
                    + "\nAs " + roomA.getName() + " has more than 60 years old, gets 40% discount!");
            System.out.println("Room B is reserved to: " + roomB.getName());
        } else {
            System.out.println("Room A is reserved to: " + roomA.getName());
            System.out.println("Room B is reserved to: " + roomB.getName());
        }
        in.close();

    }

}
