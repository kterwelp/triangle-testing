import static java.lang.System.out;
import java.util.Scanner;
import java.util.InputMismatchException;

public class TriangleProgram {

    static public void evaluateSides(double side1, double side2, double side3) {

        double sum1_2 = side1 + side2;
        double sum1_3 = side1 + side3;
        double sum2_3 = side2 + side3;

        //Double.compare() is used to determine if the sides entered by the user are negative,
        //equal to zero or if the sum of 2 sides is less than the 3rd side (impossible triangle)
        int compareNegative1 = Double.compare(0.0, side1);
        int compareNegative2 = Double.compare(0.0, side2);
        int compareNegative3 = Double.compare(0.0, side3);

        if(compareNegative1 >= 0)
        {
            out.println("\nERROR: Side 1 is less than or equal to 0.");
            out.println("Terminating...\n");
            System.exit(1);
        }
        else if (compareNegative2 >= 0)
        {
            out.println("\nERROR: Side 2 is less than or equal to 0.");
            out.println("Terminating...\n");
            System.exit(2);
        }
        else if(compareNegative3 >= 0)
        {
            out.println("\nERROR: Side 3 is less than or equal to 0.");
            out.println("Terminating...\n");
            System.exit(3);
        }

        int compare1 = Double.compare(side1, sum2_3);
        int compare2 = Double.compare(side2, sum1_3);
        int compare3 = Double.compare(side3, sum1_2);

        if(compare1 >= 0)
        {
            out.println("\nERROR: Side 1 is greater than or equal to the sum of sides 2 and 3.");
            out.println("Terminating...\n");
            System.exit(11);
        }
        else if (compare2 >= 0)
        {
            out.println("\nERROR: Side 2 is greater than or equal to the sum of sides 1 and 3.");
            out.println("Terminating...\n");
            System.exit(22);
        }
        else if(compare3 >= 0)
        {
            out.println("\nERROR: Side 3 is greater than or equal to the sum of sides 1 and 2.");
            out.println("Terminating...\n");
            System.exit(33);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int selection = 0;
        double side1 = 0.0;
        double side2 = 0.0;
        double side3 = 0.0;

        double x1, x2, x3, y1, y2, y3;
        x1 = x2 = x3 = y1 = y2 = y3 = 0.0;

        String triangleType = "";

        out.println("\nCREATE A TRIANGLE MENU");
        out.println("===============================================");
        out.println("\n1. Enter 3 sides to create triangle.");
        out.println("2. Enter 3 points to create triangle.");
        out.print("Please enter your selection (integer only): ");

        //Try-catch block is used to catch exceptions for inaccurate user input (not an integer value)
        try {
            selection = input.nextInt();
        } catch (InputMismatchException e) {
            out.println("\nERROR: Invalid selection. The user input is not an integer value.");
            out.println("Terminating...\n");
            System.exit(0);
        }

        switch(selection)
        {
            case 1:

                out.print("Please enter the length (double) of side 1: ");

                //Try-catch blocks are used to catch exceptions for inaccurate user input (not a double value)
                try {
                    side1 = input.nextDouble();
                } catch (InputMismatchException e) {
                    out.println("\nERROR: The user input is not a double value.");
                    out.println("Terminating...\n");
                    System.exit(0);
                }

                out.print("Please enter the length (double) of side 2: ");

                try {
                    side2 = input.nextDouble();
                } catch (InputMismatchException e) {
                    out.println("\nERROR: The user input is not a double value.");
                    out.println("Terminating...\n");
                    System.exit(0);
                }

                out.print("Please enter the length (double) of side 3: ");

                try {
                    side3 = input.nextDouble();
                } catch (InputMismatchException e) {
                    out.println("\nERROR: The user input is not a double value.");
                    out.println("Terminating...\n");
                    System.exit(0);
                }

                evaluateSides(side1, side2, side3);

                Triangle newTriangle = new Triangle(side1, side2, side3);

                triangleType = newTriangle.evaluateType();

                out.println("\nThe triangle created is " + triangleType + ".\n");
                out.printf("The area of the triangle is %.4f.\n\n", newTriangle.getArea());
                break;

            case 2:
                out.print("Enter point 1, coordinate x: ");
                try {
                    x1 = input.nextDouble();
                } catch (InputMismatchException e) {
                    out.println("\nERROR: The user input is not a double value.");
                    out.println("Terminating...\n");
                    System.exit(0);
                }

                out.print("Enter point 1, coordinate y: ");
                try {
                    y1 = input.nextDouble();
                } catch (InputMismatchException e) {
                    out.println("\nERROR: The user input is not a double value.");
                    out.println("Terminating...\n");
                    System.exit(0);
                }

                out.print("Enter point 2, coordinate x: ");
                try {
                    x2 = input.nextDouble();
                } catch (InputMismatchException e) {
                    out.println("\nERROR: The user input is not a double value.");
                    out.println("Terminating...\n");
                    System.exit(0);
                }

                out.print("Enter point 2, coordinate y: ");
                try {
                    y2 = input.nextDouble();
                } catch (InputMismatchException e) {
                    out.println("\nERROR: The user input is not a double value.");
                    out.println("Terminating...\n");
                    System.exit(0);
                }

                out.print("Enter point 3, coordinate x: ");
                try {
                    x3 = input.nextDouble();
                } catch (InputMismatchException e) {
                    out.println("\nERROR: The user input is not a double value.");
                    out.println("Terminating...\n");
                    System.exit(0);
                }

                out.print("Enter point 3, coordinate y: ");
                try {
                    y3 = input.nextDouble();
                } catch (InputMismatchException e) {
                    out.println("\nERROR: The user input is not a double value.");
                    out.println("Terminating...\n");
                    System.exit(0);
                }

                Point point1 = new Point(x1, y1);
                Point point2 = new Point(x2, y2);
                Point point3 = new Point(x3, y3);

                ThreeCorners threeCornersObj = new ThreeCorners(point1, point2, point3);

                threeCornersObj.createSides();

                side1 = threeCornersObj.getSide1();
                side2 = threeCornersObj.getSide2();
                side3 = threeCornersObj.getSide3();

                evaluateSides(side1, side2, side3);

                triangleType = threeCornersObj.evaluateType();

                out.println("\nThe triangle created is " + triangleType + ".\n");
                break;

            default:
                out.println("\nERROR: The user input is not a valid selection (1 or 2 only).");
                out.println("Terminating...\n");
                System.exit(0);
        }

        input.close();

    }
}
