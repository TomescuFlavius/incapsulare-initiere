package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MasinaService {

    public List<Masina> masini = new ArrayList<Masina>();

    public void load() {
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
        Masina m6 = new Masina();
        m6.id = 6;
        m6.color = " ";
        m6.marca = " ";

        this.masini.add(m1);
        this.masini.add(m2);
        this.masini.add(m3);
        this.masini.add(m4);
        this.masini.add(m5);
        this.masini.add(m6);
    }

    //todo metoda afisare masini
    public void afisareMasini() {
        for (int i = 0; i < masini.size(); i++) {
            System.out.println(this.masini.get(i).descriere());
        }
    }

    //todo metoda ce returneaza masina cea mai scumpa

    public Masina ceaMaiScumpa() {
        Masina pretMax = masini.getFirst();
        for (int i = 0; i < masini.size(); i++) {
            if (masini.get(i).pret > pretMax.pret) {
                pretMax = masini.get(i);
            }
        }

        return pretMax;
    }
    //metoda ce returneaza bmw uri
    public void afisareBMW() {
        Masina BMW = masini.get(0);
        for (int i = 0; i < masini.size(); i++) {
            if (masini.get(i).marca.equals("BMW")) {
                System.out.println(this.masini.get(i).descriere());
            }
        }
    }
    public void afisarePorsche() {
        Masina Porsche = masini.get(0);
        for (int i = 0; i < masini.size(); i++) {
            if (masini.get(i).marca.equals("Porsche")) {
                System.out.println(this.masini.get(i).descriere());
            }
        }
    }
    public void pretDescrescator() {
        for (int i = 0; i < masini.size() - 1; i++) {
            for (int j = i + 1; j < masini.size(); j++) {
                if (masini.get(i).pret < masini.get(j).pret) {
                    Masina Temp = masini.get(i);
                    masini.set(i, masini.get(j));
                    masini.set(j, Temp);
                }
            }
        }
        for (int i = 0; i < masini.size(); i++) {
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
    //todo:ce:unicitae
    public Masina getMasinaByColorAndMarca(String marca,String color) {
        for (int i = 0; i < masini.size(); i++) {
            if(masini.get(i).marca.equals(marca) && masini.get(i).color.equals(color)) {
               return masini.get(i);
            }
        }
        return null;
    }
    //todo:functei ce genereaza un id unic
    public Masina getMasinaById(int id){
        for (int i = 0; i < masini.size(); i++) {
            if(id != masini.get(i).id) {
              return masini.get(i);
            }
        }
        return null;
    }
    public int maxId(){

        int maxId=0;
        for (int i = 0; i < masini.size(); i++) {
            if(masini.get(i).id > maxId) {
                maxId=masini.get(i).id;
            }
        }
        return maxId;
    }
    public int generareNumar(){
        Random r = new Random();
        return r.nextInt(1000)+maxId();
    }
    public int generateId(){
        int id=generareNumar();
        while (getMasinaById(id) == null) {
            id=generareNumar();
        }
        return id;
    }
    //todo:functie de adaugare
    public boolean addCar(String marca,String color, int year, boolean rulata, double pret){
        Masina m=this.getMasinaByColorAndMarca(color,marca);
        if(m!=null) {
            return false;
        }
        int id=generateId();
        Masina mas= new Masina();
        mas.id=id;
        mas.marca=marca;
        mas.color=color;
        mas.pret= pret;
        mas.rulata=rulata;
        mas.year=year;
        this.masini.add(mas);

        return true;
    }
}
