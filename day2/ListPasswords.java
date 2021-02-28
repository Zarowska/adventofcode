import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ListPasswords {

    public List<String> linesWithPasswords = new ArrayList<String>();

    public void addLine(String lin) {
        linesWithPasswords.add(lin);
    }

    public String getLine(int ind) {
        return linesWithPasswords.get(ind);
    }

    public int countLines() {
        return linesWithPasswords.size();
    }

    String lin = null;

    public static ListPasswords createListFromFile(String nazwaPliku) {
        ListPasswords myList = new ListPasswords();
        String lin = null;

        try {
            BufferedReader br = new BufferedReader(new FileReader(nazwaPliku));

            while ((lin = br.readLine()) != null) {
                myList.addLine(lin);
            }
        } catch (Exception e) {
            System.err.println("There was an error loading the data");
            e.printStackTrace();
        }

        return (myList);
    }
}