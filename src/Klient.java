import java.util.ArrayList;

public class Klient extends Osoba {
    private Adres adres;
    private ArrayList<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko, Adres adres) {
        super(imie,nazwisko);
        this.adres = adres;
        this.listaZamowien = new ArrayList<>();
    }
    public Adres getAdres() {
        return adres;
    }
    public void setAdres(Adres adres) {
        this.adres = adres;
        if(adres==null){
            throw new IllegalArgumentException("Pole adres nie może być puste");
        }
    }
    public ArrayList<Zamowienie> getListaZamowien() {
        return listaZamowien;
    }

    public void dodajZamowienie(Zamowienie zamowienie){
        listaZamowien.add(zamowienie);
    }
    public void wyswietlHistorieZamowien(){
        for(Zamowienie z : listaZamowien){
            System.out.println("Zamówienie: ");
            z.wyswietlZamowienie();
            System.out.println();
        }
    }
    public double obliczLacznyKosztZamowien(){
        double oblicz = 0;
        for(Zamowienie z : listaZamowien){
            oblicz+=z.getKosztZamowienia();
        }
        return oblicz;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Klient other = (Klient) obj;
        if (getImie() == null) {
            if (other.getImie() != null)
                return false;
        } else if (!getImie().equals(other.getImie()))
            return false;
        if (getNazwisko() == null) {
            if (other.getNazwisko() != null)
                return false;
        } else if (!getNazwisko().equals(other.getNazwisko()))
            return false;
        if (adres == null) {
            if (other.adres != null)
                return false;
        } else if (!adres.equals(other.adres))
            return false;
        return true;
    }
    @Override
    public int hashCode() {
        int result = 17; // Można zacząć od dowolnej liczby niezerowej
        result = 31 * result + (getImie() != null ? getImie().hashCode() : 0);
        result = 31 * result + (getNazwisko() != null ? getNazwisko().hashCode() : 0);
        //adres -  najpierw musialam zrobic hasha w Adresie zeby dzialalo
        result = 31 * result + (adres != null ? adres.hashCode() : 0);
        return result;
    }

}