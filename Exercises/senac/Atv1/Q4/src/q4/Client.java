package q4;

import java.util.Scanner;

/**
 * Technical In Systems Analysis and Development - SENAC EAD
 * Class Client - A class part of Question 4, Exercise 1
 * 
 * @author Kelvin Coelho Loiola
 * @since 2022-08-15
 */
public class Client {

    Scanner input = new Scanner(System.in);

    private String name; /* <The name of the client */

    /**
     * Default Constructor calling the Name Setter
     */
    public Client() {
        setName();
    }

    /**
     * Name Setter
     */
    public void setName() {
        System.out.print("Type the name of the Client: ");
        String name = input.nextLine();
        this.name = name;
    }

    /**
     * Name Getter
     * @return this.name
     */
    public String getName() {
        return this.name;
    }

} // End of Class
