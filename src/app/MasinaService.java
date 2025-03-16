package app;

import java.util.ArrayList;
import java.util.List;

public class MasinaService {

    public List<Masina> masini = new ArrayList<Masina>();

    public void load(){
        Masina m1 = new Masina();
        m1.id = 1;
        m1.color = "rosu";
        m1.marca = "Porsche";
        m1.pret = 200000;
        m1.rulata = false;
        m1.year = 2025;
        Masina m2 = new Masina();
        m2.id = 2;
        m2.color = "albastru";
        m2.marca = "BMW";
        m2.pret = 100000;
        m2.rulata = true;
        m2.year = 2020;
        Masina m3 = new Masina();
        m3.id = 3;
        m3.color = "negru";
        m3.marca = "Audi";
        m3.pret = 50000;
        m3.rulata = true;
        m3.year = 2015;
        Masina m4 = new Masina();
        m4.id = 4;
        m4.color = "rosu";
        m4.marca = "Volkswagen";
        m4.pret = 6000;
        m4.rulata = true;
        m4.year = 2009;
        Masina m5 = new Masina();
        m5.id = 5;
        m5.color = "alb";
        m5.marca = "BMW";
        m5.pret = 15000;
        m5.rulata = true;
        m5.year = 2014;


        this.masini.add(m1);
        this.masini.add(m2);
        this.masini.add(m3);
        this.masini.add(m4);
        this.masini.add(m5);
    }

    //todo metoda afisare masini
    public void afisareMasini(){
        for(int i = 0; i < masini.size(); i++){
            System.out.println(this.masini.get(i).descriere());
        }
    }

    //todo metoda ce returneaza masina cea mai scumpa

    public Masina ceaMaiScumpa() {
       Masina pretMax = masini.getFirst();
        for(int i = 0; i < masini.size(); i++) {
            if (masini.get(i).pret > pretMax.pret) {
                pretMax = masini.get(i);
            }
        }

        return pretMax;
    }


    //metoda ce returneaza bmw uri
    public void  afisareBMW(){
        Masina BMW = masini.get(0);
        for(int i = 0; i < masini.size(); i++){
            if(masini.get(i).marca.equals("BMW")){
                System.out.println(this.masini.get(i).descriere());
            }
        }
    }


    public void  afisarePorsche(){
        Masina Porsche = masini.get(0);
        for(int i = 0; i < masini.size(); i++){
            if(masini.get(i).marca.equals("Porsche")){
                System.out.println(this.masini.get(i).descriere());
            }
        }
    }


    public void pretDescrescator(){
        for(int i = 0; i < masini.size()-1; i++){
            for(int j = i+1; j < masini.size(); j++){
                if(masini.get(i).pret < masini.get(j).pret){
                    Masina Temp = masini.get(i);
                    masini.set(i, masini.get(j));
                    masini.set(j, Temp);
                }
            }
        }
        for(int i = 0; i < masini.size(); i++){
            System.out.println(masini.get(i).descriere());
        }
    }


    public Masina ceaMaiIeftina() {
        Masina pretMin = masini.get(0);
        for (int i = 1; i < masini.size(); i++) {
            if (masini.get(i).pret < pretMin.pret) {
                pretMin = masini.get(i);
            }
        }
        return pretMin;
    }



    public void pretCrescator() {

        for (int i = 0; i < masini.size() - 1; i++) {
            for (int j = 0; j < masini.size() - i - 1; j++) {
                if (masini.get(j).pret > masini.get(j + 1).pret) {
                    Masina temp = masini.get(j);
                    masini.set(j, masini.get(j + 1));
                    masini.set(j + 1, temp);
                }
            }
        }
        for (int i = 0; i < masini.size(); i++) {
            System.out.println(masini.get(i).descriere());
        }
    }

}
