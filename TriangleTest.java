import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void testType()
    {
        Triangle testTriangle = new Triangle(3.0, 3.0, 3.0);
        String eType = testTriangle.evaluateType();
        assertEquals(eType, "equilateral");

        Triangle testTriangle2 = new Triangle(1.0, 1.0, 1.41421356);
        String iRType = testTriangle2.evaluateType();
        assertEquals(iRType, "right and isosceles");

        Triangle testTriangle3 = new Triangle(3.0, 3.0, 5.0);
        String iType = testTriangle3.evaluateType();
        assertEquals(iType, "isosceles");

        Triangle testTriangle4 = new Triangle(3.0, 4.0, 5.0);
        String sRType = testTriangle4.evaluateType();
        assertEquals(sRType, "right and scalene");

        Triangle testTriangle5 = new Triangle(5.0, 6.0, 10.0);
        String sType = testTriangle5.evaluateType();
        assertEquals(sType, "scalene");
    }

    @Test
    public void testArea()
    {
        Triangle testAreaTriangle = new Triangle(3.0, 4.0, 5.0);
        assertEquals(6.0, testAreaTriangle.getArea(), 0.001);
    }

    @Test
    public void testSides()
    {
        Triangle testSidesTriangle = new Triangle(3.0, 4.0, 5.0);
        assertEquals(3.0, testSidesTriangle.getSide1(), 0.001);
        assertEquals(4.0, testSidesTriangle.getSide2(), 0.001);
        assertEquals(5.0, testSidesTriangle.getSide3(), 0.001);
    }
}