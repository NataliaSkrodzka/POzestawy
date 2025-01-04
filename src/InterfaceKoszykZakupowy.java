import java.util.HashMap;

public interface InterfaceKoszykZakupowy {
    void dodajProdukt(Produkt produkt,int ile);
    void usunProdukt(Produkt produkt,int ile);
    double obliczCalkowitaWartosc();
    default void oproznij(HashMap<Produkt,Integer>produkty){
        produkty.clear();
    }
}
