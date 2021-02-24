import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ListPasswords  {

    public List<String> passwords = new ArrayList<String>();

    public void addLine(String lin) {
        passwords.add(lin);
    }

    //public String getLine(String lin) {
    //    return passwords.get(lin);
   // }

    public int countLines() {
        return passwords.size();
    }

    public static ListPasswords stworzListezPliku(String nazwaPliku) {
        ListPasswords myList = new ListPasswords();

        try {
            BufferedReader br = new BufferedReader(new FileReader(nazwaPliku));
            String lin = null;
            while ((lin = br.readLine()) != null) {
                myList.addLine(lin);
            }
        } catch (Exception e) {
            System.err.println("Wystapil blad przy wczytywaniu danych");
            e.printStackTrace();
        }
         return(myList);
    }
}