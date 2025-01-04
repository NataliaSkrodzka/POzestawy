public abstract class Owoc extends ProduktSpożywczy{
    public Owoc(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, cena, iloscNaMagazynie);
    }

    public abstract void smak();
    public abstract void umyj();
    public abstract int zjedz(int ile);
}
