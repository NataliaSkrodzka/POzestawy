public class KlientIndywidualny extends Klient{
    private final int PESEL;
    public KlientIndywidualny(String imie, String nazwisko, Adres adres, final int PESEL) {
        super(imie, nazwisko, adres);
        this.PESEL = PESEL;
    }
}
