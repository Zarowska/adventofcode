public class Day1 {
    public static void main(String[] args) {

        ListaLiczb lista2 = new ListaLiczb();

        int liczba1, liczba2, iloczyn;

        lista2 = ListaLiczb.stworzListezPliku("file.txt");

        for (int i = 0; i < lista2.ileLiczb(); i++) {
            for (int j = i + 1; j < lista2.ileLiczb(); j++) {

                int suma = lista2.wezLiczbe(i) + lista2.wezLiczbe(j);
                if (suma == 2020) {
                    liczba1 = lista2.wezLiczbe(i);
                    liczba2 = lista2.wezLiczbe(j);
                    iloczyn = liczba1 * liczba2;
                    System.out.println("liczba1: " + liczba1);
                    System.out.println("liczba2: " + liczba2);
                    System.out.println("iloczyn: " + iloczyn);
                    break;
                }
            }
        }
    }
}