package app;

import java.net.IDN;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MasinaView {

    private MasinaService masinaService;
    private Scanner scanner;
    public MasinaView() {
        this.masinaService = new MasinaService();
        this.scanner = new Scanner(System.in);
        this.play();
    }

    private void meniu() {

        System.out.println("1->afisare masini");
        System.out.println("2->masina scumpa");
        System.out.println("3->marca BMW");
        System.out.println("4->marca Porsche");
        System.out.println("5->masinile in ordine descrescatoare in functie de pret");
        System.out.println("6->cea mai ieftina masina");
        System.out.println("7->masinile in ordine crescatoare in functie de pret");
        System.out.println("8->adauga masina");
        System.out.println("9->elimina masina");
        System.out.println("10->update masina dupa Id");
        System.out.println("11->lista dupa marca selectata");
        System.out.println("12-> filtrare detaliata");



    }


    public void play() {
        boolean running = true;

        while (running) {
            meniu();

            int alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere) {
                case 1:
                    this.masinaService.addMasina(5, "Ferarri", "alb", 2025, true, 230000);
                    break;
                case 2:
                    this.masinaService.ceaMaiScumpa();
                    break;
                case 3:
                    this.masinaService.afisareBMW();
                    break;
                case 4:
                    this.masinaService.afisarePorsche();
                    break;
                case 5:
                    this.masinaService.pretDescrescator();
                    break;
                case 6:
                    this.masinaService.ceaMaiIeftina();
                    break;
                case 7:
                    this.masinaService.pretCrescator();
                    break;
                case 8:
                    this.masinaService.addMasina(7,"Ferarri","alb",2025,false,230000);
                    break;
                case 9:
                    this.masinaService.removeCar(1);
                    break;
                case 11:
                    this.masinaService.filtrariMarca("porsche");
                    break;
                case 12:
                    this.masinaService.filtrare(Filtru);
                    break;
                default:
                    System.out.println("Alegere invalida");
            }
        }
    }


//    public void afisareCeaMaiScumpaMasina() {
//
//
//        Masina masina = this.masinaService.ceaMaiScumpa();
//
//
//        System.out.println(masina.descriere());
//
//    }
//
//    public void afisarePorsche() {
//        this.masinaService.afisarePorsche();
//    }
//
//    public void afisareBMW() {
//        this.masinaService.afisareBMW();
//    }
//
//    public void afisareMasini() {
//        this.masinaService.afisareMasini();
//    }
//
//    public void pretDescrescator() {
//        this.masinaService.pretDescrescator();
//    }
//
//    public void afisareCeaMaiIeftinaMasina() {
//        Masina m = this.masinaService.ceaMaiIeftina();
//        System.out.println(m.descriere());
//    }
//
//    public void pretCrescator() {
//        this.masinaService.pretCrescator();
//    }
//
//    public void addCar() {
//
//        System.out.println("Introduceti detaliile masini cu ,intre ele: marca,culoare,an,rulata,pret");
//
//        String prop = scanner.nextLine();
//        String[] cuvinte = prop.split(",");
//        Masina m = this.masinaService.getMasinaByColorAndMarca(cuvinte[0], cuvinte[1]);
//
//        if (m != null) {
//            //todo:mesaj
//            System.out.println("Masina exista deja");
//            return;
//        }
//
//        //todo:adaugare
//
//        Boolean addedCar = this.masinaService.addCar(
//                cuvinte[0],
//                cuvinte[1],
//                Integer.parseInt(cuvinte[2]),
//                Boolean.parseBoolean(cuvinte[3]),
//                Double.parseDouble(cuvinte[4]));
//
//        if (!addedCar) {
//
//            System.out.println("Eroare la adaugare");
//            return;
//        }
//
//        System.out.println("Masina a fost  adaugata cu succes");
//
//
//    }
//
//    public void removeCar() {
//        System.out.println("Introdu ID-ul masinii pe care vrei sa o elimini:");
//        int id = Integer.parseInt(scanner.nextLine());
//        Boolean removedCar = this.masinaService.removeCar(id);
//        if (!removedCar) {
//            System.out.println("Eroare la eliminare");
//            return;
//        }
//        System.out.println("Masina a fost  eliminata cu succes");
//    }
//
//    public void updateCar() {
//        System.out.println("Introdu ID-ul mașinii pe care vrei să o actualizezi:");
//        int id = Integer.parseInt(scanner.nextLine());
//
//        System.out.println("Introdu noile detalii separate prin virgula: marca, culoare, an, rulata, pret");
//        String prop = scanner.nextLine();
//        String[] cuvinte = prop.split(",");
//
//        boolean updated = this.masinaService.updateCar(
//                id,
//                cuvinte[0],
//                cuvinte[1],
//                Integer.parseInt(cuvinte[2]),
//                Boolean.parseBoolean(cuvinte[3]),
//                Double.parseDouble(cuvinte[4])
//        );
//
//        if (!updated) {
//            System.out.println("Eroare la actualizare! ID-ul nu exista.");
//            return;
//        }
//
//        System.out.println("Mașina a fost actualizata cu succes!");
//    }
//    public void filtrareMarca() {
//        System.out.println("Marca care te intereseaza:");
//        String marca = scanner.nextLine();
//
//        List<Masina>masini=this.masinaService.filtrariMarca(marca);
//
//
//        for (Masina m : masini) {
//            System.out.println(m.descriere());
//        }
//
//
//    }
//    public void filtrareDetaliata(){
//
//
//        Filtru filtru= new Filtru();
//
//        filtru.marca="BMW";
//        filtru.rulata=true;
//
//        List<Masina> masini=this.masinaService.filtrare(filtru);
//
//        for (Masina m : masini) {
//            System.out.println(m.descriere());
//        }
//
//
//    }
}
