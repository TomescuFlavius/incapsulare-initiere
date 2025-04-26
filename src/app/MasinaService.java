package app;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MasinaService {

    private List<Masina> masini;
    private File file;
    public MasinaService() {
        masini=new ArrayList<Masina>();
        this.file=new File("C:\\mycode\\oop\\incapsulare\\Teorie Incapsulare\\Masini");
        this.load();
    }
    private void load() {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Masina masina = new Masina(line);
                this.masini.add(masina);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //todo metoda afisare masini
    public void afisare() {
        for (int i = 0; i < masini.size(); i++) {
            System.out.println(this.masini.get(i).descriere());
        }
    }

    public void addMasina(Masina masina) {
        this.masini.add(masina);
    }

    public Masina ceaMaiScumpa() {
        Masina pretMax = masini.getFirst();
        for (int i = 0; i < masini.size(); i++) {
            if (masini.get(i).getPret() > pretMax.getPret()) {
                pretMax = masini.get(i);
            }
        }

        return pretMax;
    }

    //metoda ce returneaza bmw uri
    public void afisareBMW() {
        Masina BMW = masini.get(0);
        for (int i = 0; i < masini.size(); i++) {
            if (masini.get(i).getMarca().equals("BMW")) {
                System.out.println(this.masini.get(i).descriere());
            }
        }
    }

    public void afisarePorsche() {
        Masina Porsche = masini.get(0);
        for (int i = 0; i < masini.size(); i++) {
            if (masini.get(i).getMarca().equals("Porsche")) {
                System.out.println(this.masini.get(i).descriere());
            }
        }
    }

    public void pretDescrescator() {
        for (int i = 0; i < masini.size() - 1; i++) {
            for (int j = i + 1; j < masini.size(); j++) {
                if (masini.get(i).getPret() < masini.get(j).getPret()) {
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
            if (masini.get(i).getPret() < pretMin.getPret()) {
                pretMin = masini.get(i);
            }
        }
        return pretMin;
    }

    public void pretCrescator()     {

        for (int i = 0; i < masini.size() - 1; i++) {
            for (int j = 0; j < masini.size() - i - 1; j++) {
                if (masini.get(j).getPret() > masini.get(j + 1).getPret()) {
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
    public Masina getMasinaByColorAndMarca(String marca, String color) {
        for (int i = 0; i < masini.size(); i++) {
            if (masini.get(i).getMarca().equals(marca) && masini.get(i).getColor().equals(color)) {
                return masini.get(i);
            }
        }
        return null;
    }

    //todo:functei ce genereaza un id unic
    public Masina getMasinaById(int id) {
        for (int i = 0; i < masini.size(); i++) {
            if (id == masini.get(i).getId()) {
                return masini.get(i);
            }
        }
        return null;
    }

    public int maxId() {

        int maxId = 0;
        for (int i = 0; i < masini.size(); i++) {
            if (masini.get(i).getId() > maxId) {
                maxId = masini.get(i).getId();
            }
        }
        return maxId;
    }

    public int generareNumar() {
        Random r = new Random();
        return r.nextInt(1000) + maxId();
    }

    public int generateId() {
        int id = generareNumar();
        while (getMasinaById(id) == null) {
            id = generareNumar();
        }
        return id;
    }


    public boolean removeCar(int ID) {
        for (int i = 0; i < masini.size(); i++) {
            if (masini.get(i).getId() == ID) {
                masini.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean updateCar(int id, String marca, String color, int year, boolean rulata, double pret) {
        Masina masina = getMasinaById(id);

        if (masina == null) {
            return false;
        }

        masina.setMarca(marca);
        masina.setColor(color);
        masina.setYear(year);
        masina.setRulata(rulata);
        masina.setPret(pret);

        return true;
    }

    public List<Masina> filtrariMarca(String marca) {

        List<Masina> filtrMas = new ArrayList<>();
        for (int i = 0; i < masini.size(); i++) {
            if (marca.equals(masini.get(i).getMarca())) {
                filtrMas.add(this.masini.get(i));
            }
        }
        return filtrMas;
    }

    public List<Masina> filtrariPret(int pretMin,int pretMax) {
        List<Masina> filtrMas = new ArrayList<>();
        for (int i = 0; i < masini.size(); i++) {
            if (masini.get(i).getPret() > pretMin && masini.get(i).getPret() <= pretMax) {
                filtrMas.add(this.masini.get(i));
            }
        }
        return filtrMas;
    }

    public List<Masina> filtarariRulata() {
        List<Masina> filtrMas = new ArrayList<>();
        for (int i = 0; i < masini.size(); i++) {
            if (masini.get(i).isRulata()) {
                filtrMas.add(this.masini.get(i));
            }
        }
        return filtrMas;
    }



    //todo: functie ce returneaza intersectia dintre 2 liste

    public List<Masina> intersectieListe(List<Masina> lista1, List<Masina> lista2) {

        List<Masina> comune = new ArrayList<>();
        for (int i = 0; i < lista1.size(); i++) {

            if (lista2.contains(lista1.get(i))) {

                comune.add(lista1.get(i));
            }
        }
        return comune;
    }

    public List<Masina> filtrare(Filtru filtru) {
        List<Masina> comune = new ArrayList<>();
        comune.addAll(this.masini);
        if (filtru.getMarca().length() > 0) {
            comune = intersectieListe(comune, filtrariMarca(filtru.getMarca()));
        }
        if(filtru.getPretMax()>=0&&filtru.getPretMax()>=0){
            comune=intersectieListe(comune,filtrariPret(filtru.getPretMin(),filtru.getPretMax()));
        }
        if (filtru.isRulata())
            comune = intersectieListe(comune, filtarariRulata());
        return comune;

    }
}