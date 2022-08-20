package q4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Technical In Systems Analysis and Development - SENAC EAD
 * Main class of Question 4, Exercise 1
 * @author Kelvin Coelho Loiola
 * @since 2022-08-15
 */
public class Q4 {

    static final int MAX = 15;

    static Scanner input = new Scanner(System.in);

    /**
     * Validades the option chosed by user
     * @return The option chosed
     */
    public static int menu() {
        int option = 0;
        while ((option < 1) || (option > 3)) {
            System.out.println("\n1 - Registrate\n2 - Search\n3 - Exit");
            option = Integer.parseInt(input.nextLine());
        }

        return option;
    }

    /**
     * Search the 'key' name into the ArrayList of Clients.
     * @param cl A reference to the Client List where clients are stored
     * @param key The key name to search
     * @return An integer to the 'name index' in the ArrayList if found. -1 if not found
     */
    public static int search(ArrayList<Client> cl, String key) {
        for (Client client : cl) {
            if (client.getName() != null && client.getName().contains(key)) {
                return cl.indexOf(client);
            }
        }
        return -1;
    }

    /**
     * Register a new Client into the List of Clients
     * @param cl A reference to the Client List to add the new Client
     */
    public static void register(ArrayList<Client> cl) {
        Client c = new Client();
        cl.add(c);
    }

    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Client> clientList = new ArrayList<Client>(MAX);
        int opt;
        int count = 0;
        do {
            opt = menu();

            switch (opt) {
                case 1:
                    System.out.println("Adding new client!");
                    register(clientList);
                    count++;
                    break;
                case 2:
                    System.out.print("Type a Client's name to start searching: ");
                    String name = input.nextLine();
                    int result = search(clientList, name);
                    if (result < 0) {
                        System.out.println("Not found!");
                    } else {
                        System.out.println("Client " + clientList.get(result).getName() + " found at index '" + result + "'");
                    }
                    break;
                case 3:
                    break;
            }
            if (count >= MAX) {
                break;
            }
        } while (opt != 3);
    }

}
