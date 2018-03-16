package iterative_recursive;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Mati on 22.12.2017.
 */
public class HornerRecursiveTest {

    private HornerRecursive hornerRecursive = new HornerRecursive();

    @Test
    public void calculateHornerScheme() {
        int polydeg = 3; // x ^ 3
        hornerRecursive = new HornerRecursive();
        int result = hornerRecursive.calculate(polydeg);
        int expected = 2672;
        Assert.assertEquals(expected, result);


    }
}