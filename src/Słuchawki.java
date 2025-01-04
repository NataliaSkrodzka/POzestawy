import javax.swing.*;

public class Słuchawki extends UrzadzenieElektroniczne {
    private boolean czyWlaczone;
    private boolean czyZepsute;
    public Słuchawki(String nazwa, double cena, int iloscNaMagazynie) {
        super(nazwa, cena, iloscNaMagazynie);
        this.czyWlaczone = false;
    }

    @Override
    public void napraw() {
        if(czyZepsute){
            czyZepsute = false;
            System.out.println("Naprawione!");
        }
        else{
            System.out.println("Słuchawki nie są zepsute");
        }

    }

    @Override
    public void uzyj() {
        System.out.println("Uzywasz słuchawek");
    }

    @Override
    public void zepsuj() {
        if(!czyZepsute){
            czyZepsute = true;
            System.out.println("Zepsułeś/aś słuchawki!");
        }
        else{
            System.out.println("Próbujesz zepsuć zepsute słuchawki!");
        }
    }

    @Override
    public void wlacz() {
        if (!czyWlaczone) {
            czyWlaczone = true;
            System.out.println("Bip Bip, słuchawki włączone");
        }
        else {
            System.out.println("Bip Bip, słuchawki już są włączone");
        }

    }

    @Override
    public void wylacz() {
        if (czyWlaczone) {
            czyWlaczone = false;
            System.out.println("Bip Bip, słuchawki wyłączone");
        }
        else {
            System.out.println("Bip Bip, słuchawki już są wyłączone");
        }
    }
}

