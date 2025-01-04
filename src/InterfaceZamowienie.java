public interface InterfaceZamowienie {
    void ustawStatusZamowienia(String statusZamowienia);
    void finalizujZamowienie();
    void wyswietlZamowienie();
    void zwrocProdukt(Produkt produkt, int ilosc);
    default void wyswietlStatus(Zamowienie zamowienie) {
        System.out.println(zamowienie.getStatusZamowienia());
    }
}
