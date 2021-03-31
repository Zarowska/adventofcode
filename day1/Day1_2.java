public class Day1_2 {
    public static void main(String[] args) {

        ListaLiczb lista2 = new ListaLiczb();

        int liczba1, liczba2, liczba3, iloczyn;

        lista2 = ListaLiczb.stworzListezPliku("file.txt");

        for (int i = 0; i < lista2.ileLiczb(); i++) {
            for (int j = i + 1; j < lista2.ileLiczb(); j++) {
                for (int k = j + 1; k < lista2.ileLiczb(); k++) {
                    int suma = lista2.wezLiczbe(i) + lista2.wezLiczbe(j) + lista2.wezLiczbe(k);
                    if (suma == 2020) {
                        liczba1 = lista2.wezLiczbe(i);
                        liczba2 = lista2.wezLiczbe(j);
                        liczba3 = lista2.wezLiczbe(k);
                        iloczyn = liczba1 * liczba2 * liczba3;
                        System.out.println("liczba1: " + liczba1);
                        System.out.println("liczba2: " + liczba2);
                        System.out.println("liczba3: " + liczba3);
                        System.out.println("iloczyn: " + iloczyn);
                        break;
                    }
                }
            }
        }
    }
}