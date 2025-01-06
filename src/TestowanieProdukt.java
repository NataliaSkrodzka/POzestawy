import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.HashMap;

public class TestowanieProdukt {
    public static void main(String[] args) {

        Jabłka Reneta = new Jabłka("Reneta",5.5,5);
        Reneta.smak();
        System.out.println(Reneta.getStanCzystosci());
        Reneta.umyj();
        System.out.println(Reneta.getStanCzystosci());
        System.out.println(Reneta.getIloscNaMagazynie());
        System.out.println(Reneta.zjedz(2));
        Słuchawki Słuchawki1= new Słuchawki("JBL",129.99,20);
        Słuchawki1.uzyj();
        Słuchawki1.wlacz();
        Słuchawki1.zepsuj();
        Słuchawki1.zepsuj();
        Słuchawki1.napraw();
        Słuchawki1.wylacz();

        Magazyn magazyn1=new Magazyn(HashMap.newHashMap(5));
        Sklep sklep1 =new Sklep("Warzywniak u Basi",magazyn1,"12-02-2024");
        sklep1.wyswietlOferty();
        sklep1.dodajProdukt(Reneta);
        sklep1.wyswietlOferty();
        Sklep sklep2=new Sklep("Elektryczny",magazyn1,"12-02-2024");
        sklep2.wyswietlOferty();
        sklep2.dodajProdukt(Słuchawki1);
        sklep2.wyswietlOferty();










    }
}
// tu jest kod equals
// https://javastart.pl/baza-wiedzy/programowanie-obiektowe/metoda-equals