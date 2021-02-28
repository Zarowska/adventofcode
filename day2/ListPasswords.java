import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ListPasswords {

    public List<String> linesWithPassword = new ArrayList<String>();

    public void addLine(String lin) {
        linesWithPassword.add(lin);
    }

    public String getLine(int ind) {
        return linesWithPassword.get(ind);
    }

    public int countLines() {
        return linesWithPassword.size();
    }

    public static ListPasswords createListFromFile(String nazwaPliku) {
        ListPasswords myLista = new ListPasswords();

        try {
            BufferedReader br = new BufferedReader(new FileReader(nazwaPliku));
            String bufferLine = null;
            while ((bufferLine = br.readLine()) != null) {
                myLista.addLine(bufferLine);
            }
        } catch (Exception e) {
            System.err.println("There was an error loading the data");
            e.printStackTrace();
        }
        return (myLista);
    }
}