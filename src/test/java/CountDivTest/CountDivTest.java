package CountDivTest;

import CountDiv.CountDiv;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class CountDivTest {

    private CountDiv countDiv = new CountDiv();

    @Test
    @Parameters({"6,11,2,3",
            "1,1,1,1",
            "10,10000,10,1000"
              })
    public void countDivTest(int A,int B, int K, int expectedValue){

        assertEquals(expectedValue,countDiv.solution(A,B,K));

    }

}
