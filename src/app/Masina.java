package app;

public class Masina {

    //atribute

    private int id;
    private String marca;
    private String color;
    private int year;
    private boolean rulata;
    private double pret;

    public Masina() {
        this.id = 0;
        this.marca = "";
        this.color = "";
        this.year = 0;
        this.rulata = false;
        this.pret = 0;
    }

    public Masina(int id, String marca, String color, int year, boolean rulata, double pret) {
        this.id = id;
        this.marca = marca;
        this.color = color;
        this.year = year;
        this.rulata = rulata;
        this.pret = pret;
    }

    public Masina(String text){
        text.split(",");
        this.id = Integer.parseInt(text.split(",")[0]);
        this.marca = text.split(",")[1];
        this.color = text.split(",")[2];
        this.year = Integer.parseInt(text.split(",")[3]);
        this.rulata = Boolean.parseBoolean(text.split(",")[4]);
        this.pret = Double.parseDouble(text.split(",")[5]);
    }
    public String descriere(){
        return marca + "," + color + "," + year + "," + rulata + "," + pret;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isRulata() {
        return rulata;
    }

    public void setRulata(boolean rulata) {
        this.rulata = rulata;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }
}
