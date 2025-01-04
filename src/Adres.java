public class Adres {
    private String ulica;
    private int numerDomu;
    private int numerMieszania;
    private String miasto;
    private int kodPocztowy;

    public Adres(String ulica, int numerDomu, int numerMieszania, String miasto, int kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszania = numerMieszania;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }
    public Adres(String ulica, int numerDomu, String miasto, int kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }
    public String getUlica() {
        return ulica;
    }
    public void setUlica(String ulica) {
        this.ulica = ulica;
        if(ulica==null || ulica.isEmpty()){
            throw new IllegalArgumentException("Ulica nie może być pusta");
        }
    }
    public int getNumerDomu() {
        return numerDomu;
    }
    public void setNumerDomu(int numerDomu) {
        this.numerDomu = numerDomu;
        if(numerDomu==0){
            throw new IllegalArgumentException("Numerem domu nie może być zero");
        }
    }
    public int getNumerMieszania() {
        return numerMieszania;
    }
    public void setNumerMieszania(int numerMieszania) {
        this.numerMieszania = numerMieszania;
        if(numerMieszania==0){
            throw new IllegalArgumentException("Numerem mieszkania nie może być 0");
        }
    }
    public String getMiasto() {
        return miasto;
    }
    public void setMiasto(String miasto) {
        this.miasto = miasto;
        if(miasto==null || miasto.isEmpty()){
            throw new IllegalArgumentException("pole miasto nie może być puste");
        }
    }
    public int getKodPocztowy() {
        return kodPocztowy;
    }
    public void setKodPocztowy(int kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
        if(kodPocztowy == 0){
            throw new IllegalArgumentException("Kod pocztowy musi mieć format XX-XXX");
        }
    }

    public void pokaz(){
        System.out.println("kod pocztowy: " + kodPocztowy + " miasto: " + miasto);
        if (numerMieszania == 0){
            System.out.println("ulica: " + ulica + " numerDomu: " + numerDomu);
        }
        else {
            System.out.println("ulica: " + ulica + " numerDomu: " + numerDomu + " numerMieszania: " + numerMieszania);
        }
    }
    public boolean przed(int kodPocztowy){
        return this.kodPocztowy < kodPocztowy;
    }
    @Override
    public int hashCode() {
        int result = 17; // Można zacząć od dowolnej liczby niezerowej
        result = 31 * result + numerDomu;
        result = 31 * result + numerMieszania;
        result = 31 * result + kodPocztowy;
        result = 31 * result + (ulica != null ? ulica.hashCode() : 0);
        result = 31 * result + (miasto != null ? miasto.hashCode() : 0);
        return result;
    }

}