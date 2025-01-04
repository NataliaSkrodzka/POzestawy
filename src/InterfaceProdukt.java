import java.util.HashMap;

public interface InterfaceProdukt {
    void dodajDoMagazynu(HashMap<Produkt,Integer> magazyn, Produkt produkt, int dodaj);
    //void dodajProdukt(Magazyn magazyn,Produkt produkt,int ile);
    void usunZMagazynu(int usun);
    default void wyswietlIlosc(Produkt produkt) {
        System.out.println(produkt.getIloscNaMagazynie());
    }
}
