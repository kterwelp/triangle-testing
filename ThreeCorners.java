import java.lang.Math;

public class ThreeCorners extends Triangle {

    private Point point1;
    private Point point2;
    private Point point3;

    public ThreeCorners(Point point1, Point point2, Point point3) //Explicit constructor
    {
        super();
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public void createSides()
    {
        double x1, x2, x3, y1, y2, y3;
        x1 = x2 = x3 = y1 = y2 = y3 = 0.0;
        x1 = point1.returnX();
        x2 = point2.returnX();
        x3 = point3.returnX();
        y1 = point1.returnY();
        y2 = point2.returnY();
        y3 = point3.returnY();

        //Distance formula is used to determine the triangle side length
        side1 = Math.sqrt(((x2 - x1)*(x2 - x1)) + ((y2-y1)*(y2-y1)));
        side2 = Math.sqrt(((x3 - x2)*(x3 - x2)) + ((y3-y2)*(y3-y2)));
        side3 = Math.sqrt(((x3 - x1)*(x3 - x1)) + ((y3-y1)*(y3-y1)));

    }
}
