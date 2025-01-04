import java.util.HashMap;
import java.util.Objects;

public class Zamowienie implements InterfaceZamowienie {
    KoszykZakupowy koszykZakupowy;
    String statusZamowienia="Nieopłacone";
    String platnosc;
    double kosztZamowienia;
    public Zamowienie(KoszykZakupowy koszykZakupowy) {
        this.koszykZakupowy=koszykZakupowy;
        this.kosztZamowienia=koszykZakupowy.obliczCalkowitaWartosc();
    }
    public double getKosztZamowienia() {
        return kosztZamowienia;
    }

    public String getPlatnosc() {
        return platnosc;
    }

    public String getStatusZamowienia() {
        return statusZamowienia;
    }

    public void setStatusZamowienia(String statusZamowienia) {
        this.statusZamowienia= statusZamowienia;
    }
    public void setPlatnosc(String platnosc) {
        this.platnosc = platnosc;
    }

    public void setKosztZamowienia(double kosztZamowienia) {
        this.kosztZamowienia = kosztZamowienia;
    }

    @Override
    public void ustawStatusZamowienia(String statusZamowienia) {
        this.statusZamowienia = statusZamowienia;
    }
    @Override
    public void finalizujZamowienie(){
        if(Objects.equals(platnosc, "Opłacone")){
            this.statusZamowienia = "Gotowe do wysyłki";
        }
    }
    @Override
    public void wyswietlZamowienie(){
        System.out.println(this.koszykZakupowy.toString());
        System.out.println("Status: " + statusZamowienia);
    }
    @Override
    public void zwrocProdukt(Produkt produkt, int ilosc){
        this.koszykZakupowy.usunProdukt(produkt,ilosc);
    }
}