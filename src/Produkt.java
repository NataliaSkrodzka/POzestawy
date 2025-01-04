import java.util.HashMap;

public class Produkt implements InterfaceProdukt {
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;
    private Magazyn zKtoregoMagazynu;

    public Produkt(String nazwa,double cena,int iloscNaMagazynie) {
        this.nazwa=nazwa;
        this.cena=cena;
        this.iloscNaMagazynie=iloscNaMagazynie;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
        if(nazwa==null || nazwa.isEmpty()){
            throw new IllegalArgumentException("Nazwa nie może być pusta");
        }
    }
    public String getNazwa() {
        return nazwa;
    }
    public double getCena() {
        return cena;
    }
    public int getIloscNaMagazynie() {
        return iloscNaMagazynie;
    }

    public Magazyn getzKtoregoMagazynu() {
        return zKtoregoMagazynu;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setIloscNaMagazynie(int iloscNaMagazynie) {
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public void setzKtoregoMagazynu(Magazyn zKtoregoMagazynu) {
        this.zKtoregoMagazynu = zKtoregoMagazynu;
    }

    @Override
    public String toString() {
        return "Nazwa: "+nazwa+" cena: "+cena+" ilość na magazynie: "+iloscNaMagazynie;
    }
    @Override
    public void dodajDoMagazynu(HashMap<Produkt,Integer> magazyn,Produkt produkt,int dodaj){
        magazyn.put(produkt,dodaj);
        iloscNaMagazynie+=dodaj;
    }
    //@Override
    //    public void dodajProdukt(Magazyn magazyn,Produkt produkt,int ile) {
//        if (produkt.iloscNaMagazynie>=ile){
//            if (magazyn.containsKey(produkt)){
//                produkty.replace(produkt,produkty.get(produkt)+ile);
//            }
//            else {
//                magazyn.put(produkt, ile);
//            }
//        }
//        else {
//            System.out.println("Niewystarczajaca ilosc produktów");
//        }
//    }
    @Override
    public void usunZMagazynu(int usun){
        if (iloscNaMagazynie>=usun) {
            iloscNaMagazynie -= usun;
        }
        else{
            System.out.println("Na magazynie jest tylko "+iloscNaMagazynie+" sztuk");
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produkt other = (Produkt) obj;
        if (nazwa == null) {
            if (other.nazwa != null)
                return false;
        } else if (!nazwa.equals(other.nazwa))
            return false;
        if (Double.doubleToLongBits(cena) != Double.doubleToLongBits(other.cena))
            return false;
        return true;
    }
    @Override
    public int hashCode() {
        int result = 17; // Można zacząć od dowolnej liczby niezerowej
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        result = 31 * result + Double.hashCode(cena);
        return result;
    }

}