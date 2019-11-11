import org.junit.*;
import static org.junit.Assert.*;

public class ThreeCornersTest {

    @Test
    public void testSides()
    {
        Point point1 = new Point(4.0, 0.0);
        Point point2 = new Point(1.0, 0.0);
        Point point3 = new Point(1.0, 4.0);
        ThreeCorners sides = new ThreeCorners(point1, point2, point3);
        sides.createSides();
        assertEquals(3.0, sides.getSide1(), 0.001);
        assertEquals(4.0, sides.getSide2(), 0.001);
        assertEquals(5.0, sides.getSide3(), 0.001);
    }

}