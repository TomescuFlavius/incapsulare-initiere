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
        System.out.println("Constructor gol");
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


    //metode
    public String descriere(){
        String text1="";
        text1+="Id : "+this.id+",";
        text1+="Marca : "+this.marca+",";
        text1+="Color : "+this.color+",";
        text1+="Year : "+this.year+",";
        text1+="Rulata : "+this.rulata+",";
        text1+="Pret : "+this.pret+",";
        return text1;



    }
}
