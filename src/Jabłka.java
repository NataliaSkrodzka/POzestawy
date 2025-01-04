public class Jabłka extends Owoc{
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;
    private String stanCzystosci;
    public Jabłka(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, cena, iloscNaMagazynie);
        this.stanCzystosci ="brudne";
    }
    public String getStanCzystosci() {
        return stanCzystosci;
    }
    public void setStanCzystosci(String stanCzystosci) {
        this.stanCzystosci = stanCzystosci;
    }
    @Override
    public void smak() {
        System.out.println("kwaśny");
    }

    @Override
    public void umyj() {
        stanCzystosci="czyste";
    }

    @Override
    public int zjedz(int ile) {
        //cos nie dziala
        if(ile<=iloscNaMagazynie) {
            iloscNaMagazynie -= ile;
            System.out.println("Zjedzone! zostało: " + iloscNaMagazynie);
        }
        else{
            System.out.println("Nie ma takiej ilosci na magazynie");
        }
        return iloscNaMagazynie;
    }
}
