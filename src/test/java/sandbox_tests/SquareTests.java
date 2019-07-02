package sandbox_tests;

import org.junit.Assert;
import org.junit.Test;



public class SquareTests {

    @Test


    public void squareTest() {

        Square s = new Square(3);
        Assert.assertEquals((s.area(3)), 9);
    }
}


