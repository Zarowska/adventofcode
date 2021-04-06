import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class SolverTest {
    @org.junit.Test
    public void testGetResult() {
        Input input = new Input() ;
        int  result = new Solver(input).getResult();
        Assert.assertEquals(result,100);
    }
}