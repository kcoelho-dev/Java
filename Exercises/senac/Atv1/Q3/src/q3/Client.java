package q3;

/**
 * Technical In Systems Analysis and Development - SENAC EAD
 * Class Client - A class part of Question 3, Exercise 1
 * @author Kelvin Coelho Loiola
 * @since 2022-08-15
 */
public class Client {

    private int clientNumber = 1;   /*<Count to the quantity of clients added */
    private String name;            /*<The name of the client  */
    private int age;                /*<The age of the client */

    /**
     * Parametrized Constructor of class Client
     * @param name Name of the client
     * @param age  Age of the client
     */
    public Client(String name, int age) {
        this.name = name;
        this.age = age;
        clientNumber++;
    }

    /**
     * Name Setter
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Age Setter
     */
    public void setAge() {
        int age = 0;
        while (age <= 0) {
            if (age <= 0) {
                System.out.print("Invalid Age!\nPlease insert an age greater than 0: ");
            }
        }
        this.age = age;
    }

    /**
     * Name Getter
     * @return this.name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Age Getter
     * @return this.age
     */
    public int getAge() {
        return this.age;
    }
} //End of Class Client
