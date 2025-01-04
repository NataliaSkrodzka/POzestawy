import java.util.Objects;

public interface InterfacePlatnosc {
    void zaplac(Zamowienie zamowienie);
    default boolean czyOplacone(Zamowienie zamowienie) {
        return Objects.equals(zamowienie.getStatusZamowienia(), "Oplacone");
    }
}
