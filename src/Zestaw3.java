import java.util.Arrays;
import java.util.Scanner;
public class Zestaw3 {
    static void trojkiPitagorejskie(double n){
        for(int i=1;i<=n;i++) {
            for(int j=1;j<i;j++) {
                for(int k=1;k<j;k++) {
                    if (Math.pow(k, 2) + Math.pow(j, 2) == Math.pow(i, 2)) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }
    static void funKwaRozwiazania (int n){
        for(int i=1;i<=n;i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (Math.pow(i,2)-4*j*k >= 0) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }
    static void funKwaDelta (int n){
        for(int i=1;i<=n;i++) {
            for(int j=0;j<=n;j++) {
                for (int k = 0; k < n; k++) {
                    double delta = Math.pow(i, 2) - 4 * j * k;
                    if (delta >= 0 && Math.sqrt(delta)==Math.pow(i,2)){
                        System.out.println(i + " " + j + " " + k);
                    }

                }
            }
        }
    }
    static void liczbyPierwsze (int n){
        for(int i=2;i<=n;i++) {
            int k=0;
            for(int j=2;j<i;j++) {
                if (i%j==0){
                    k++;
                }
            }
            if (k==0){
                System.out.println(i);
            }
        }
    }
    static void liczbyPodzielne (int m,int n){
        for(int i = (int) Math.pow(10,m-1); i<(int)Math.pow(10,m); i++) {
            if(i%n==0){
                System.out.println(i);
            }
        }
    }
    static void piramida (int n,int variant){
        if (variant==1){
            for (int i=1;i<=n;i++) {
                for (int j=1;j<=i;j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
        else if (variant==2) {
            for (int i=1;i<=n;i++) {
                for (int j=1;j<=n-i;j++) {
                    System.out.print(" ");
                }
                for (int j=1;j<=2*i-1;j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
        else {
            System.out.println("Variant powinien byc cyfra 1 lub 2");
        }
    }
    static int silnia (int n){
        int wynik = 1;
        for(int i=n; i>1;i--) {
            wynik *=i;
        }

        return wynik;
    }
    static int silniaPodwojna (int n){
        int wynik = 1;
        for (int i=n;i>1;i-=2 ) {
            wynik *=i;
        }
        return wynik;
    }
    static int silnia (int m, int n){
        int wynik = 1;
        for (int i=n;i>1;i-=m) {
            wynik *=i;
        }
        return wynik;
    }
    static int dwumianNewtona (int n, int k){
        int wynik = silnia(n)/(silnia(k)*silnia(n-k));
        return wynik;

    }
    static void ciagFibonacciego (int n){
        int przedostatni = 0;
        int ostatni = 1;
        if (n==1){
            System.out.println(0);
        }
        else {
            System.out.println(0);
            System.out.println(1);
        }
        for (int i=2;i<n;i++) {
            int wynik = przedostatni + ostatni;
            przedostatni = ostatni;
            ostatni = wynik;

            System.out.println(wynik);
        }
    }
    static int sumaNaturalnych (int n){
        int suma = 0;
        for (int i=1;i<=n;i++) {
            suma += i;
        }
        return suma;
    }
    static int sumaParzystych (int n){
        int suma = 0;
        for (int i=2;i<=n;i+=2) {
            suma += i;
        }
        return suma;
    }
    static int sumaNieparzystych (int n){
        int suma = 0;
        for (int i=1;i<=n;i+=2) {
            suma += i;
        }
        return suma;
    }
    static int sumaKwaNaturalnych (int n){
        int suma = 0;
        for (int i=1;i<=n;i++) {
            suma += (int)Math.pow(i,2);
        }
        return suma;
    }
    static int sumaSzeNaturalnych (int n){
        int suma = 0;
        for (int i=1;i<=n;i++) {
            suma += (int) Math.pow(i,3);
        }
        return suma;
    }
    static double sumaOdwNaturalnych (int n){
        double suma = 0;
        for (int i=1;i<=n;i++) {
            suma +=  Math.pow(i,-1);
        }
        return suma;
    }
    static boolean czyPalindrom (String wyraz){
        int k=0;
        boolean czyTakaSama;
        for (int i=0;i<wyraz.length()/2;i++) {
            if (wyraz.charAt(i)!=wyraz.charAt(wyraz.length()-1-i)) {
                k++;
            }
        }
        czyTakaSama= k == 0;
        return czyTakaSama;
    }
    static void trojkatPascala (int n) {
        for (int i = 0; i < 1; i++) {
            for (int j = 2; j <= n - i; j++){
                System.out.print(" ");
            }
            System.out.println(1);
        }
        for (int i = 1; i < 2; i++) {
            for (int j = 2; j <= n - i; j++){
                System.out.print(" ");
            }
            System.out.println(1+" "+1);
        }
        for (int i = 2; i < n; i++) {
            for (int j=2;j<=n-i;j++) {
                System.out.print(" ");
            }
            System.out.print(1+ " ");
            for (int j = 1; j < i; j++) {

                System.out.print(dwumianNewtona(i, j)+" ");
            }
            System.out.println(1);
        }
    }



    static boolean czyPalindrom (int n) {
        //najpierw sprawdzamy ile ma cyf, potem dzielimy na 2 i to bedzie nasz ogranicznik, nastepnie pierwsza cyfra porownujemy do ostatniacyfra
        boolean czyTakaSama = true;
        int k=0;
        int l;
        int o=0;
        int ostatnia=n;
        int m=1;
        for (int i=0;i<ileCyfr(n)/2;i++) {
            int pierwsza=n;
            while (pierwsza >= 10 * m) {
                pierwsza /= 10;
                }
            if(pierwsza<10)
            {k = pierwsza;}
            else{
                k=pierwsza%10;
            }

            l=ostatnia%10;
            if(k!=l) {
                o++;
            }
            czyTakaSama=o==0;
            m*=10;
            ostatnia/=10;
        }
        return czyTakaSama;
    }
    static int ileCyfr (int n) {
        int ileCyfr=1;
        while (n>9) {
            n=n/10;
            ileCyfr++;
        }
        return ileCyfr;
    }
    static boolean czyDoskonala (int n) {
        int k=0;
        for (int i=1;i<n;i++) {
            if (n%i==0){
                k+=i;
            }
        }
        return k==n;
    }
    static boolean czyPierwsza (int n) {
        boolean czyPierwsza = n != 1 && n != 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                czyPierwsza = false;
                break;
            }
        }
        return czyPierwsza;
    }
    static int NWD (int a, int b) {
        int d=1;
        if (a>b) {
            for (int i = b; i >=1; i--) {
                if (a%i==0&&b%i==0) {
                    d=i;
                    break;
                }
            }
        }
        else {
            for (int i = a; i >=1; i--) {
                if (a % i == 0 && b % i == 0) {
                    d = i;
                    break;
                }
            }
        }
        return d;
    }
    static void wczytajTablice(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj ile bedziesz przypisywal liczb: ");
        int ile  = myObj.nextInt();
        int[] tablica= new int[ile];
        for (int i=1;i<=ile;i++) {
            System.out.println("Podaj " + i + " liczbe: ");
            int jaka  = myObj.nextInt();
            tablica[i-1]=jaka;
        }
        for (int i:tablica) {
            System.out.print(i +" ");
        }
    }
    static void podzbiory (int[] tab) {
        System.out.println("∅");
        for (int i: tab) {
            System.out.println(i);
        }
        for (int i: tab) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
            int m = 0;
            while (m<tab.length) {
                for (int i = m + 1; i < tab.length; i++) {
                    System.out.println(tab[m] + " " + tab[i]);
                }
                m++;
            }
        System.out.print("\n");
                for(int i=0;i<tab.length;i++){
                    for(int j=0;j<tab.length;j++){
                        if(i!=j){
                            System.out.print(tab[j] +" ");
                        }
                    }
                    System.out.print("\n");
                }

    }


    public static void main(String[] args) {
        System.out.println("Trójki pitagorejskie: ");
        trojkiPitagorejskie(25);
        System.out.println("Rozwiazania funkcji kwadratowej: ");
        funKwaRozwiazania(4);
        System.out.println("Rozwiazania funkcji kwadratowej, pierwiastek z delty jest kwadratem: ");
        funKwaDelta(10);
        System.out.println("Liczby pierwsze ");
        liczbyPierwsze(19);
        System.out.println("Liczby podzielne ");
        liczbyPodzielne(1,3);
        piramida(4,2);
        System.out.println("Silnia: ");
        System.out.println(silnia(3));
        System.out.println("Silnia podwójna: ");
        System.out.println(silniaPodwojna(4));
        System.out.println(" ");
        System.out.println("Silnia m-ta liczby n: ");
        System.out.println(silnia(3,4));
        System.out.println("Dwumian Newtona: ");
        System.out.println(dwumianNewtona(5,2));
        System.out.println("Ciag Fibonnaciego: ");
        ciagFibonacciego(8);
        System.out.println("Suma n naturalnych: ");
        System.out.println(sumaNaturalnych(3));
        System.out.println("Suma parzystych: ");
        System.out.println(sumaParzystych(6));
        System.out.println("Suma nieparzystych: ");
        System.out.println(sumaNieparzystych(5));
        System.out.println("Suma kwadratow liczb naturalnych: ");
        System.out.println(sumaKwaNaturalnych(6));
        System.out.println("Suma szescianow liczb Naturalnych: ");
        System.out.println(sumaSzeNaturalnych(3));
        System.out.println("Suma odwrotnosci liczb naturalnych: ");
        System.out.println(sumaOdwNaturalnych(5));
        System.out.println("Czy wyraz jest palindromem?: ");
        System.out.println(czyPalindrom("koto"));
        System.out.println("Trojkat Pascala: ");
        trojkatPascala(7);
        System.out.println("Czy palindrom liczba: ");
        System.out.println(czyPalindrom(111282111));
        System.out.println("ile cyfr: ");
        System.out.println(ileCyfr(349));
        System.out.println("Czy doskonala: ");
        System.out.println(czyDoskonala(28));
        System.out.println("Najwiekszy wspolny dzielnik: ");
        System.out.println(NWD(2,8));
        System.out.println("Tablica");
        wczytajTablice();
        System.out.println(" ");
        System.out.println("Podzbiory: ");
        podzbiory(new int[]{1, 2, 3, 6});




    }
}