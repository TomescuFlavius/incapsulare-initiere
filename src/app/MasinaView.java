package app;

import java.util.Scanner;

public class MasinaView {

    public MasinaService masinaService= new MasinaService();
    public Scanner scanner = new Scanner(System.in);


    public void meniu(){

        System.out.println("1->afisare masini");
        System.out.println("2->masina scumpa");
        System.out.println("3->marca BMW");
        System.out.println("4->marca Porsche");
        System.out.println("5->masinile in ordine descrescatoare in functie de pret");
        System.out.println("6->cea mai ieftina masina");
        System.out.println("7->masinile in ordine crescatoare in functie de pret");

        //todo:crud create read update delete


    }


    public void play(){
        boolean running = true;
        this.masinaService.load();
        while (running) {
            meniu();

            int alegere=Integer.parseInt(scanner.nextLine());
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
                    default:
                        System.out.println("Alegere invalida");
            }
        }
    }


    public void afisareCeaMaiScumpaMasina(){


        Masina masina=this.masinaService.ceaMaiScumpa();


        System.out.println(masina.descriere());

    }
    public void afisarePorsche(){
        this.masinaService.afisarePorsche();
    }
    public void afisareBMW(){
        this.masinaService.afisareBMW();
    }
    public void afisareMasini(){
       this.masinaService.afisareMasini();
    }
    public void pretDescrescator(){
        this.masinaService.pretDescrescator();
    }
    public void afisareCeaMaiIeftinaMasina(){
        Masina m=this.masinaService.ceaMaiIeftina();
        System.out.println(m.descriere());
    }
    public void pretCrescator(){
        this.masinaService.pretCrescator();
    }
}
