package TriangleTest;

import Triangle.Triangle;
import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TriangleTest {

    private Triangle triangle = new Triangle();

    @Test
    public void productOfTripletTestWithResult1(){
        int expectedValueOfGivenArray=1;
        int[]array={10,2,5,1,8,20};
        assertEquals(triangle.solution(array),expectedValueOfGivenArray);
    }

    @Test
    public void productOfTripletTestWithResult0(){
        int expectedValueOfGivenArray=0;
        int[]array={10,50,5,1};
        assertEquals(triangle.solution(array),expectedValueOfGivenArray);
    }
}
