public class KlientFirmowy extends Klient{
    private final int NIP;
    private final int REGON;

    public KlientFirmowy(String imie, String nazwisko, Adres adres, final int NIP, final int REGON) {
        super(imie, nazwisko, adres);
        this.NIP=NIP;
        this.REGON=REGON;
    }
}
