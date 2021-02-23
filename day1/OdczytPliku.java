import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OdczytPliku {

   public  static  void  main (String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        long lineCount = Files.lines(Paths.get("file.txt")).count();
        String linia = null;
        Integer foo = null;
            while ((linia = br.readLine()) != null) {
              foo = Integer.parseInt(linia);
              System.out.println(foo);
             }
        br.close();
            }
}
