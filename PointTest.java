import org.junit.*;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void testNewPoint()
    {
        Point testPoint = new Point(1.0, 2.0);
        assertEquals(1.0, testPoint.returnX(), 0.001);
        assertEquals(2.0, testPoint.returnY(), 0.001);
    }

}