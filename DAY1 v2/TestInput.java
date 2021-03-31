import java.util.List;

import junit.framework.Assert;

public class TestInput {

	@org.junit.Test 

    public void testReadFile(){
        Input input = new Input();
        List<String> listOfPasswords = input.readFile("file.txt");
        Assert.assertFalse(listOfPasswords.isEmpty());
        
        

    }

}