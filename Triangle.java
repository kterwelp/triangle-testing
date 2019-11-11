import java.lang.Math;

public class Triangle {

    protected double side1;
    protected double side2;
    protected double side3;

    private final double THRESHOLD = 0.0001; //"THRESHOLD" variable sets number of significant figures
    //for the comparisons below

    public Triangle() //Default Constructor
    {
        this.side1 = this.side2 = this.side3 = 0.0;
    }

    public Triangle(double side1, double side2, double side3) //Explicit Constructor
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public String evaluateType()
    {
        double side1_squared = side1 * side1; //squares side1 of triangle
        double side2_squared = side2 * side2; //squares side2 of triangle
        double side3_squared = side3 * side3; //squares side3 of triangle
        double sum1_2 = (side1_squared) + (side2_squared); //stores sum of side1_squared and side2_squared
        double sum1_3 = (side1_squared) + (side3_squared); //stores sum of side1_squared and side3_squared
        double sum2_3 = (side2_squared) + (side3_squared); //stores sum of side2_squared and side3_squared

        //Comparisons are obtained by calculating the difference between the sides and
        //taking the absolute value of that result.  If this result is less than the
        //threshold set above, the values are considered to be equal (greater than for not equal)
        //"==", "<", ">" and etc are inaccurate for comparisons when dealing with floating point numbers
        if((Math.abs(side1-side2) < THRESHOLD) && (Math.abs(side2-side3) < THRESHOLD))
        {
            return "equilateral";
        }
        else if ((Math.abs(side1-side2) < THRESHOLD) || (Math.abs(side2-side3) < THRESHOLD) ||
                (Math.abs(side1-side3) < THRESHOLD))
        {
            if ((Math.abs(side1_squared-sum2_3) < THRESHOLD) || (Math.abs(side2_squared-sum1_3) < THRESHOLD) ||
                    (Math.abs(side3_squared-sum1_2) < THRESHOLD))
            {
                return "right and isosceles";
            }

            return "isosceles";
        }
        else if ((Math.abs(side1-side2) > THRESHOLD) && (Math.abs(side2-side3) > THRESHOLD) &&
                (Math.abs(side1-side3) > THRESHOLD))
        {
            if ((Math.abs(side1_squared-sum2_3) < THRESHOLD) || (Math.abs(side2_squared-sum1_3) < THRESHOLD) ||
                    (Math.abs(side3_squared-sum1_2) < THRESHOLD))
            {
                return "right and scalene";
            }

            return "scalene";
        }
        else if ((Math.abs(side1_squared-sum2_3) < THRESHOLD) || (Math.abs(side2_squared-sum1_3) < THRESHOLD) ||
                (Math.abs(side3_squared-sum1_2) < THRESHOLD))
        {
            return "right";
        }

        return "inconclusive";
    }

    public double getArea()
    {
        double area = 0.0;
        double s = 0.0;

        s = (side1 + side2 + side3) / 2;

        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

        return area;
    }

    public double getSide1()
    {
        return side1;
    }

    public double getSide2()
    {
        return side2;
    }

    public double getSide3()
    {
        return side3;
    }
}
