package app;

public class Masina {

    //atribute

    public int id;
    public String marca;
    public String color;
    public int year;
    public boolean rulata;
    public double pret;




    //metode
    public String descriere(){
        String text="";
        text+="Id : "+this.id+"\n";
        text+="Marca : "+this.marca+"\n";
        text+="Color : "+this.color+"\n";
        text+="Year : "+this.year+"\n";
        text+="Rulata : "+this.rulata+"\n";
        text+="Pret : "+this.pret+"\n";
        return text;



    }
}
