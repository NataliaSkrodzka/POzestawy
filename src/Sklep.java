import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Sklep implements InterfaceSklep{
    ArrayList<Produkt> produkty;
    private String nazwaSklepu;
    private Magazyn magazynSklepu;
    private LocalDate dataPowstania;
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Sklep(String nazwaSklepu, Magazyn magazynSklepu, String zformatowanaData) {
        this.produkty = new ArrayList<>();
        this.nazwaSklepu = nazwaSklepu;
        this.magazynSklepu = magazynSklepu;
        this.dataPowstania = LocalDate.parse(zformatowanaData, myFormatObj);
        if (this.dataPowstania.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Data nie może być z przyszłości");
        }
        else{
            this.dataPowstania = LocalDate.parse(zformatowanaData, myFormatObj);
        }
    }

    public ArrayList<Produkt> getProdukty() {
        return produkty;
    }
    public void setProdukty(ArrayList<Produkt> produkty) {
        this.produkty = produkty;
    }
    public String getNazwaSklepu() {
        return nazwaSklepu;
    }
    public void setNazwaSklepu(String nazwaSklepu) {
        this.nazwaSklepu = nazwaSklepu;
    }
    public Magazyn getMagazynSklepu() {
        return magazynSklepu;
    }
    public void setMagazynSklepu(Magazyn magazynSklepu) {
        this.magazynSklepu = magazynSklepu;
    }
    public LocalDate getDataPowstania() {
        return dataPowstania;
    }
    public void setDataPowstania(LocalDate dataPowstania) {
        this.dataPowstania = dataPowstania;
    }


    public void dodajProdukt(Produkt p) {
        this.produkty.add(p);
    }
    @Override
    public void wyswietlOferty() {
        if(this.produkty.size() == 0){
            System.out.println("Jeszcze nie ma ofert w sklepie");
        }
        else {
            System.out.println("Oferty sklepu: ");
            for (Produkt p : produkty) {
                System.out.println(p.getNazwa());
            }
        }
    }
    @Override
    public String wyszukajProduktu(String nazwa) {
        nazwa = nazwa.toLowerCase();
        for (Produkt p : produkty) {
            if (p.getNazwa().toLowerCase().equals(nazwa)) {
                return p.getNazwa();
            }
        }
        return null;
    }
    @Override
    public void zakupy(KoszykZakupowy koszykZakupowy,Produkt p, int ilosc) {
        koszykZakupowy.dodajProdukt(p,ilosc);
    }
}