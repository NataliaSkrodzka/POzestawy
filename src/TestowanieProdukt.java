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
        System.out.println(Reneta.zjedz(2));//cos nie dzila - nie widzi tych 5









    }
}
// tu jest kod equals
// https://javastart.pl/baza-wiedzy/programowanie-obiektowe/metoda-equals