import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ListPasswords  {

    public List<String> linesWithPasswords = new ArrayList<String>();

    public void addLine(String lin) {
        linesWithPasswords.add(lin);
    }

    //public String getLine(String lin) {
    //    return passwords.get(lin);
   // }

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
                //System.out.println(lin);
            }
        } catch (Exception e) {
            System.err.println("Wystapil blad przy wczytywaniu danych");
            e.printStackTrace();
        }
        

         return(myList);
    }
}