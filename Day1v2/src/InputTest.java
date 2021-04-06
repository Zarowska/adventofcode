import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

import junit.framework.Assert;

class InputTest {
    @org.junit.Test

    public void testReadFile(){
        Input input = new Input();
        List<String> listOfPasswords = input.readFile("file.txt");
        assertFalse(listOfPasswords.isEmpty());
    }

}