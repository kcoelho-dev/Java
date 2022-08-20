package mathpoints;

/**
 * Class Point2D - Creates a point with its two axis X and Y
 *
 * @author Kelvin Coelho
 */
public class Point2D
{

    private double X;
    /*< Attribute to store coordinate of horizontal X axis*/
    private double Y;

    /*< Attribute to store coordinate of vertical Y axis*/

    /**
     * Default constructor without parameters
     */
    public Point2D()
    {
    }

    /**
     * Parameterized constructor of Class Point2D
     *
     * @param X the X axis
     * @param Y the Y axis
     */
    public Point2D(double X, double Y)
    {
        this.X = X;
        this.Y = Y;
    }

    /**
     * Getter to the value of X axis
     *
     * @return Returns the value of the X axis
     */
    public double getX()
    {
        return X;
    }

    /**
     * Setter to the value of Axis X
     *
     * @param X
     */
    public void setX(double X)
    {
        this.X = X;
    }

    /**
     * Getter to the value of Y axis
     *
     * @return Returns the value of the Y axis
     */
    public double getY()
    {
        return Y;
    }

    /**
     * Setter to the value of Axis X
     *
     * @param Y
     */
    public void setY(double Y)
    {
        this.Y = Y;
    }

    /**
     * Calculates the distance between two points
     *
     * @param a Point2D object to the first point
     * @param b Point2D object to the seccond point
     * @return A double value to the distance between points a and b
     */
    public static double CalcDistance(Point2D a, Point2D b)
    {
        double distance
                = (((b.getX() - a.getX()) * (b.getX() - a.getX()))
                + ((b.getY() - a.getY()) * (b.getY() - a.getY())));
        distance = Math.sqrt(distance);

        return distance;
    }

    /**
     * Multiplies the point coordinate values by K
     *
     * @param k
     */
    public void MultPoint(int k)
    {
        this.X = this.X * k;
        this.Y = this.Y * k;
    }

    /**
     * Prints the coordinates of a Point
     * @return The coordinates of the point like (X,Y)
     */
    public String PrintPoint()
    {
        return ("(" + this.X + "," + this.Y + ")");
    }

}
