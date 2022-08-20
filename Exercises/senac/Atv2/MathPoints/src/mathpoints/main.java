package mathpoints;

import java.util.Scanner;

/**
 * Main class to run make the programs run
 *
 * @author Kelvin Coelho
 */
public class main
{

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        Trajectory trajectory1 = new Trajectory();
        Trajectory trajectory2 = new Trajectory();
        readPoints(trajectory1);
        readPoints(trajectory2);
        
        System.out.println
        (
            "Trajectory 1 - The distance between the first point "
            + trajectory1.getTrajectoryPoint(0)
            + " to the last point "
            + trajectory1.getTrajectoryPoint(-1)
            + " is: "
            + trajectory1.CalcDistanceFirstLastPoints()
        );
     
        System.out.println("Route from Trajectory 1");
        trajectory1.CalcRoute();

        System.out.println
        (
            "Trajectory 2 - The distance between the first point "
            + trajectory2.getTrajectoryPoint(0)
            + " to the last point "
            + trajectory2.getTrajectoryPoint(-1)
            + " is: "
            + trajectory2.CalcDistanceFirstLastPoints()
        );
        
        System.out.println("Route from Trajectory 2");
        trajectory2.CalcRoute();
    }
    
    /**
     * Read, validate and return an Integer to the quantity of points the user wants to input
     * @return 
     */
    public static int readN()
    {
        int n;
        while (true)
        {
            System.out.print("How many points you want to include at the trajectory? ");
            n = Integer.parseInt(input.nextLine());
            if (n < 2 || n > 5)
            {
                System.out.println("\t****Invalid quantity!****\n\t****Please enter a value between 2 and 5!****");
            } else
            {
                break;
            }
        }
        return n;
    }
    
    /**
     * Read and return an integer to the axis
     * @return 
     */
    public static int readAxis()
    {
        System.out.print("Enter a value to the current axis: ");
        return Integer.parseInt(input.nextLine());
    }
    
    /**
     * Reads the points to insert into trajectories
     * @param t 
     */
    public static void readPoints(Trajectory t)
    {
        int n = readN();
        int cont = 0;
        
        while (cont < n)
        {
            Point2D point = new Point2D(readAxis(), readAxis());
            t.AddPoint(point);
            System.out.println("New point added: " + point.PrintPoint());
            cont++;
        }
    }
}
