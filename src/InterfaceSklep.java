import java.util.ArrayList;

public interface InterfaceSklep {
    void wyswietlOferty();
    String wyszukajProduktu(String nazwa);
    void zakupy(KoszykZakupowy koszykZakupowy,Produkt p, int ilosc);
    default void wyswietlIloscProduktow(ArrayList<Produkt> produkty) {
        int s=produkty.size();
        System.out.println(s);
    }

}
