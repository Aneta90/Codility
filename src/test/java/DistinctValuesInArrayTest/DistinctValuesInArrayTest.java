package DistinctValuesInArrayTest;

import DistinctValuesInArray.DistinctValuesInArray;
import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class DistinctValuesInArrayTest {

    DistinctValuesInArray distinctValuesInArray = new DistinctValuesInArray();

    @Test
    public void productOfTripletTest(){
        int expectedValueOfGivenArray=6;
        int[]array={-3,1,2,-2,5,6};
        assertEquals(distinctValuesInArray.solution(array),expectedValueOfGivenArray);
        assertEquals(distinctValuesInArray.solution2(array),expectedValueOfGivenArray);

    }
}
