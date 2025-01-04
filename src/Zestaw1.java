import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Zestaw1 {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //zad 1
        String imie = "Natalia";
        String nazwisko = "Skrodzka";
        System.out.println(imie + " " + nazwisko);
        //zad 2
        int dlugosc = imie.length() + nazwisko.length();
        System.out.println("Dlugosc imienia i nazwiska to: " + dlugosc);
        //zad 3
        String wyraz1 = "Ala";
        String wyraz2 = "ma";
        String wyraz3 = "kota";
        String wyraz4 = (wyraz1 + wyraz2 + wyraz3);
        System.out.println(wyraz4);
        //zad 4
        for (int i = 0; i < 10; i++) {
            System.out.printf(" ");
        }
        System.out.println("*");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" ");
        }
        System.out.println("**");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" ");
        }
        System.out.println("***");
        for (int i = 0; i < 14; i++) {
            System.out.printf("*");
        }
        System.out.printf("\n");
        for (int i = 0; i < 15; i++) {
            System.out.printf("*");
        }
        System.out.printf("\n");
        for (int i = 0; i < 14; i++) {
            System.out.printf("*");
        }
        System.out.printf("\n");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" ");
        }
        System.out.println("***");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" ");
        }
        System.out.println("**");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" ");
        }
        System.out.println("*");
        //zad 5
        System.out.println("     *");
        System.out.println("    * *");
        System.out.println("   * * *");
        System.out.println("  * * * *");
        System.out.println(" * * * * *");
        System.out.println("* * * * * *");
        System.out.println(" * * * * *");
        System.out.println("  * * * *");
        System.out.println("   * * *");
        System.out.println("    * *");
        System.out.println("     *");
        //zad 6
        String zdanie = ("Ala ma kota");
        String zdaniee = zdanie.replace('a','e');
        System.out.println(zdaniee);
        String zdanie2 = zdanie.toUpperCase();
        System.out.println(zdanie2);
        String zdanie3 = zdanie.toLowerCase();
        System.out.println(zdanie3);
        //zad 7
        int kod1 = (int)'A';
        int kod2 = (int)'!';
        int kod3 = (int)'@';
        int kod4 = (int)'>';
        int kod5 = (int)'~';
        int kod6 = (int)'\n';
        int kod7 = (int)'\b';

        System.out.println("Kody ASCI znaków: 'A' - " + kod1 + ", '!' - " + kod2 + ", '@' - " + kod3 + ", '>' - " +kod4 + ",'~' - " + kod5 + ", \'\\n\' - " + kod6 + ", \'\\b\'  - " + kod7  );
        //zad 8 male litery 61-122, duze litery 65-90, cyfry 48-57
        //zad 9
        String zdanko = ("Grzesiek nie wiedzial dlaczego %s jest tak drapieznym %s mimo, ze jego %s na to nie wskazuje");
        System.out.println(String.format(zdanko, "kot", "zwierzeciem", "wyglad"));
        //zad 10
        String ksiazka = ("%s to najlepsza ksiazka napisana przez %s.");
        System.out.println(String.format(ksiazka, "\"Harry Potter\"", "J. K. Rowling"));
        //zad 11
        String slowo = ("wydrze");
        System.out.println(slowo.concat(slowo.concat(slowo.concat(slowo.concat(slowo)))));
        //zad 12
        LocalDateTime dataiczas = LocalDateTime.now();
        DateTimeFormatter data = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter godzina = DateTimeFormatter.ofPattern("HH:mm:ss");
        String dobradata = dataiczas.format(data);
        String dobragodzina = dataiczas.format(godzina);
        System.out.println("Dzisiaj jest " + dobradata + " godzina " + dobragodzina);
        //zad 13
        char znak1 = 54, znak2 = 103, znak3 = 241, znak4 = 67, znak5 = 9999, znak6 = 15, znak7 = 17802;
        System.out.println(znak1);
        System.out.println(znak2);
        System.out.println(znak3);
        System.out.println(znak4);
        System.out.println(znak5);
        System.out.println(znak6);
        System.out.println(znak7);
    }
}