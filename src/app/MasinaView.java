package app;

import java.util.Scanner;

public class MasinaView {

    public MasinaService masinaService = new MasinaService();
    public Scanner scanner = new Scanner(System.in);


    public void meniu() {

        System.out.println("1->afisare masini");
        System.out.println("2->masina scumpa");
        System.out.println("3->marca BMW");
        System.out.println("4->marca Porsche");
        System.out.println("5->masinile in ordine descrescatoare in functie de pret");
        System.out.println("6->cea mai ieftina masina");
        System.out.println("7->masinile in ordine crescatoare in functie de pret");
        System.out.println("8->adauga masina");
        //todo:crud create read update delete
        //todo:manaeger de filtrari


    }


    public void play() {
        boolean running = true;
        this.masinaService.load();
        while (running) {
            meniu();

            int alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere) {
                case 1:
                    this.afisareMasini();
                    break;
                case 2:
                    this.afisareCeaMaiScumpaMasina();
                    break;
                case 3:
                    this.afisareBMW();
                    break;
                case 4:
                    this.afisarePorsche();
                    break;
                case 5:
                    this.pretDescrescator();
                    break;
                case 6:
                    this.afisareCeaMaiIeftinaMasina();
                    break;
                case 7:
                    this.pretCrescator();
                    break;
                case 8:
                    this.addCar();
                    break;
                default:
                    System.out.println("Alegere invalida");
            }
        }
    }


    public void afisareCeaMaiScumpaMasina() {


        Masina masina = this.masinaService.ceaMaiScumpa();


        System.out.println(masina.descriere());

    }

    public void afisarePorsche() {
        this.masinaService.afisarePorsche();
    }

    public void afisareBMW() {
        this.masinaService.afisareBMW();
    }

    public void afisareMasini() {
        this.masinaService.afisareMasini();
    }

    public void pretDescrescator() {
        this.masinaService.pretDescrescator();
    }

    public void afisareCeaMaiIeftinaMasina() {
        Masina m = this.masinaService.ceaMaiIeftina();
        System.out.println(m.descriere());
    }

    public void pretCrescator() {
        this.masinaService.pretCrescator();
    }

    public void addCar() {

        System.out.println("Introduceti detaliile masini cu ,intre ele: marca,culoare,an,rulata,pret");

        String prop = scanner.nextLine();
        String[] cuvinte = prop.split(",");
        Masina m = this.masinaService.getMasinaByColorAndMarca(cuvinte[0], cuvinte[1]);

        if (m != null) {
            //todo:mesaj
            System.out.println("Masina exista deja");
            return;
        }

        //todo:adaugare

        Boolean addedCar = this.masinaService.addCar(
                cuvinte[0],
                cuvinte[1],
                Integer.parseInt(cuvinte[2]),
                Boolean.parseBoolean(cuvinte[3]),
                Double.parseDouble(cuvinte[4]));

        if (!addedCar) {

            System.out.println("Eroare la adaugare");
            return;
        }

        System.out.println("Masina a fost  adaugata cu succes");


    }
}
