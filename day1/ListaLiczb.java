import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ListaLiczb {

    public List<Integer> liczby = new ArrayList<Integer>();

    public void dodajLiczbe(int liczba) {
        liczby.add(liczba);
    }

    public int wezLiczbe(int indeks) {
        return liczby.get(indeks);
    }

    public int ileLiczb() {
        return liczby.size();
    }

    public static ListaLiczb stworzListezPliku(String nazwaPliku) {
        ListaLiczb mojaLista = new ListaLiczb();

        try {
            BufferedReader br = new BufferedReader(new FileReader(nazwaPliku));
            String linia = null;
            while ((linia = br.readLine()) != null) {
                int liczba = Integer.parseInt(linia.trim());
                mojaLista.dodajLiczbe(liczba);
            }
        } catch (Exception e) {
            System.err.println("Wystapil blad przy wczytywaniu danych");
            e.printStackTrace();
        }
         return(mojaLista);
    }
}