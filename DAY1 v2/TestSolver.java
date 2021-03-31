 import junit.framework.Assert;
 
 public class TestSolver {
 
 	@org.junit.Test
 	public void testGetResult() {
      Input input = new Input() ;
      int  result = new Solver(input).getResult();
      Assert.assertEquals(result,100);

     }
 }