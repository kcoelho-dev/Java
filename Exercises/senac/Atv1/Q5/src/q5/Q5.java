package q5;

import java.util.Scanner;

/**
 * Technical In Systems Analysis and Development - SENAC EAD
 * Main class of Question 5, Exercise 1
 * @author Kelvin Coelho Loiola
 * @since 2022-08-15
 */
public class Q5 {

    static Scanner input = new Scanner(System.in);

    /**
     * Prints the matrix that represents the Hotel plant in reverse mode
     * @param m Reference to the matrix where content are stored
     */
    public static void printMatrix(String[][] m) {
        for (int i = 3; i >= 0; i--) {
            System.out.print("Floor "+ (i+1) + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println("");
        }
    }

    /**
     * Initialize the matrix with empty brackets
     * @param m Reference to the matrix where content are stored
     */
    public static void fillMatrix(String[][] m) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = "[ ]";
            }
        }
    }

    /**
     * Sets the room (matrix column) where the client is hosted
     * @return The room (matrix column) index where client is hosted
     */
    public static int setRoom() {
        int room = 0;
        while (room < 1 || room > 3) {
            System.out.print("Enter a valid room number between 1 and 3: ");
            room = Integer.parseInt(input.nextLine());
        }
        return room - 1;
    }

    /**
     * Sets the floor (matrix row) where the client is hosted
     * @return The floor (matrix row) index where client is hosted
     */
    public static int setFloor() {
        int floor = 0;
        while (floor < 1 || floor > 4) {
            System.out.print("Enter a valid floor number between 1 and 4: ");
            floor = Integer.parseInt(input.nextLine());
        }
        return floor - 1;
    }

    /**
     * Marks the exactly floor(row) X room(column) wher client is hosted
     * @param floor The floor(row) of the hotel(matrix)
     * @param room The room(column) of the hotel(matrix)
     * @param m The referenced matrix
     */
    public static void accomodateClient(int floor, int room, String[][] m) {
        if (m[floor][room].equals("[ ]")) {
            m[floor][room] = "[X]";
        } else {
            System.out.println("The room " + room + " at '" + floor + "' floor is already occupied!");
        }
    }

    public static void main(String[] args) {
        String[][] hotel = new String[4][3];

        fillMatrix(hotel);
        String option = "Y";
        while (option.contains("Y") || option.contains("y")) {

            int floor = setFloor();
            int room = setRoom();
            accomodateClient(floor, room, hotel);
            System.out.println("Do you want to inform another occupation? (Y/N)");
            option = input.nextLine();

        }
        printMatrix(hotel);
    }

}
