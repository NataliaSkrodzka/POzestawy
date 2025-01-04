import java.util.Scanner;

public class Zestaw2 {
    public static void main(String[] args) {
        //zad 1
        //23.0+76 - Float
        //41*2.0+3 - Float
        //5-33 - Integer
        //109%3 - Integer
        //50/2 - Integer
        //4|2 - Integer
        //3^5 - Integer
        //7&9 - Integer
        //zad 2
        double a = (((Math.sqrt(7))-1)/2)+((Math.pow(3,3))%2);
        System.out.println((int)(a));

        int b = 1985/(24*1);
        System.out.println(b);

        double c = ((3+(Math.sqrt(3)))/((Math.sqrt(5))/2)/3)+1;
        System.out.println((int)c);

        double d = 9%2%2;
        System.out.println((int)d);

        double e = ((8%7)+1)/Math.pow(2,1/4);
        System.out.println((int)e);
        //zad 3
        Scanner slowo1 = new Scanner(System.in);
        System.out.println("Wpisz słowo: ");

        String pobraneSlowo1 = slowo1.nextLine();

        Scanner slowo2 = new Scanner(System.in);
        System.out.println("Wpisz drugie słowo: ");

        String pobraneSlowo2 = slowo2.nextLine();

        System.out.println("Wpisałaś: " + pobraneSlowo1 + " " + pobraneSlowo2);

        //zad 4
        Scanner liczba1 = new Scanner(System.in);
        System.out.println("Wpisz liczbę: ");

        double pobranaliczba1 = liczba1.nextDouble();

        Scanner liczba2 = new Scanner(System.in);

        System.out.println("Wpisz drugą liczbę: ");
        double pobranaliczba2 = liczba2.nextDouble();

        double suma = pobranaliczba1 + pobranaliczba2;
        double roznica = pobranaliczba1 - pobranaliczba2;
        double iloczyn = pobranaliczba1 * pobranaliczba2;
        double iloraz = pobranaliczba1 / pobranaliczba2;

        System.out.println("Suma twoich liczb to: " + suma);
        System.out.println("Różnica twoich liczb to: " + roznica);
        System.out.println("Iloczyn twoich liczb to: " + iloczyn);
        System.out.println("Iloraz twoich liczb to: " + iloraz);

        Scanner liczba3 = new Scanner(System.in);
        System.out.println("Wpisz liczbę: ");
        double pobranaliczba3 = liczba3.nextDouble();
        double powiekszona = pobranaliczba3 + 140;
        double pomniejszona = pobranaliczba3 - 31;
        double powiekszonaRazy = pobranaliczba3 * 7;
        double pomniejszonaRazy = pobranaliczba3 / 13;
        double modulo = pobranaliczba3 % 7;
        double dzielenie =pobranaliczba3 / 4;
        int calkowita = (int)dzielenie;
        double potega = Math.pow(pobranaliczba3,45);
        int pobranaliczba3Int = (int) pobranaliczba3;
        int iloczynbitowy = pobranaliczba3Int & 67;
        int sumabitowa = pobranaliczba3Int | 59;
        int xor = pobranaliczba3Int ^ 23;
        int przesunietaWlewo = pobranaliczba3Int << 5;
        int przesunietaWprawo = pobranaliczba3Int >> 6;
        System.out.println("Twoja liczba powiększona o 140 to " + powiekszona);
        System.out.println("Twoja liczba pomniejszona o 31 to " + pomniejszona);
        System.out.println("Twoja liczba powiększona 7 razy to " + powiekszonaRazy);
        System.out.println("Twoja liczba pomniejszona 13 razy to " + pomniejszonaRazy);
        System.out.println("Twoja liczba modulo 7 to " + modulo);
        System.out.println("Część całkowita z dzielenia twojej liczby przez 4 to: " + calkowita);
        System.out.println("Twoja liczba podniesiona do potęgi 45 to " + potega);
        System.out.println("Iloczyn bitowy twojej liczby z 67 to " + iloczynbitowy);
        System.out.println("Suma bitowa twojej liczby z 59 to " + sumabitowa);
        System.out.println("Xor twojej liczby z 23 to " + xor);
        System.out.println("Twoja liczba przesunieta o 5 bitów w lewo to " + przesunietaWlewo);
        System.out.println("Twoja liczba przesunieta o 6 bitów w prawo to " + przesunietaWprawo);

    }
}