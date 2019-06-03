package ProductOfTripletTest;

import ProductOfTriplet.ProductOfTriplet;
import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class ProductOfTripletTest {

    private ProductOfTriplet productOfTriplet = new ProductOfTriplet();

    @Test
    public void productOfTripletTest(){
        int expectedValueOfGivenArray=60;
        int[]array={-3,1,2,-2,5,6};
        assertEquals(productOfTriplet.solution(array),expectedValueOfGivenArray);

    }
}
