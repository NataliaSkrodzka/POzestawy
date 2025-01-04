public class Osoba {
    private String imie;
    private String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
        if(imie==null || imie.isEmpty()) {
            throw new IllegalArgumentException("Pole imie nie może być puste");
        }
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
        if(nazwisko==null || nazwisko.isEmpty()){
            throw new IllegalArgumentException("Pole nazwisko nie może być puste");
        }
    }
}
