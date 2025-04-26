package app;

import java.util.ArrayList;
import java.util.List;

public class Filtru {
    private String marca;
    private int pretMin;
    private int pretMax;
    private int anMin;
    private boolean rulata;

    public Filtru(String marca, int pretMin, int pretMax, int anMin) {
        this.marca = marca;
        this.pretMin = pretMin;
        this.pretMax = pretMax;
        this.anMin = anMin;
        rulata = false;
    }

    public Filtru(){
        this.marca = "";
        this.pretMin = 0;
        this.pretMax = 10000000;
        this.anMin = 0;
        this.rulata = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPretMin() {
        return pretMin;
    }

    public void setPretMin(int pretMin) {
        this.pretMin = pretMin;
    }

    public int getPretMax() {
        return pretMax;
    }

    public void setPretMax(int pretMax) {
        this.pretMax = pretMax;
    }

    public int getAnMin() {
        return anMin;
    }

    public void setAnMin(int anMin) {
        this.anMin = anMin;
    }

    public boolean isRulata() {
        return rulata;
    }

    public void setRulata(boolean rulata) {
        this.rulata = rulata;
    }
}
