package mathpoints;

import java.util.ArrayList;

/**
 * Class Trajectory - Stores points to create a trajectory
 * @author kelvi
 */
public class Trajectory
{

    private ArrayList<Point2D> route = new ArrayList<Point2D>(); /*<An ArrayList attribute to stores the points of the trajectory*/

    /**
     * Adds a new point to the private attribute route
     * @param point 
     */
    public void AddPoint(Point2D point)
    {
        this.route.add(point);
    }
    
    /**
     * 
     * @param index
     * @return If index is equal to -1, returns the last point of the route
     */
    public String getTrajectoryPoint(int index)
    {
        if (index == -1)
        {
            return route.get(route.size() -1).PrintPoint();
        }
        else
        {
            return route.get(index).PrintPoint();
        }
    }

    /**
     * Calculates the total distance from the first point to the last
     */
    public void CalcRoute()
    {
        double totalRoute = 0;
        for (int i = 0; i < route.size() - 1; i++)
        {
            System.out.print(route.get(i).PrintPoint());
            System.out.print(" to ");
            System.out.print(route.get(i + 1).PrintPoint());
            System.out.printf
            (
                    " - Distance: %.1f\n",
                    Point2D.CalcDistance(route.get(i),
                    route.get(i + 1))
            );

            totalRoute += Point2D.CalcDistance
            (
                route.get(i),
                route.get(i + 1)
            );
        }

    }

    /**
     * Calculates the distance between the first and the last point of a route
     * @return Double value to the distance from first to the last points
     */
    public double CalcDistanceFirstLastPoints()
    {
        Point2D fp = route.get(0);
        Point2D lp = route.get(route.size() - 1); // Last Point

        return Point2D.CalcDistance(fp, lp);
    }

}
