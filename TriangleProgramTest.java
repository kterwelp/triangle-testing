import org.junit.*;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

public class TriangleProgramTest {

    @Rule
    public final ExpectedSystemExit exitTest = ExpectedSystemExit.none();

    @Test
    public void testSideEvaluation()
    {
        TriangleProgram triangleTest = new TriangleProgram();
        exitTest.expectSystemExitWithStatus(1);
        triangleTest.evaluateSides(0.0, 2.0, 3.0);

        exitTest.expectSystemExitWithStatus(2);
        triangleTest.evaluateSides(2.0, -2.0, 3.0);

        exitTest.expectSystemExitWithStatus(3);
        triangleTest.evaluateSides(2.0, 2.0, -3.0);

        exitTest.expectSystemExitWithStatus(11);
        triangleTest.evaluateSides(4.0, 2.0, 2.0);

        exitTest.expectSystemExitWithStatus(22);
        triangleTest.evaluateSides(2.0, 5.0, 2.0);

        exitTest.expectSystemExitWithStatus(33);
        triangleTest.evaluateSides(2.0, 2.0, 6.0);
    }

}