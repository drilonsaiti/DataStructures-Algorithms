package sample.StackQueue.Queue.Easy;

import java.util.Scanner;
class People {
    private String imePrzime;
    private int lKarta;
    private int pasos;
    private int vozacka;

    public People(String imePrzime, int lKarta, int pasos, int vozacka) {
        this.imePrzime = imePrzime;
        this.lKarta = lKarta;
        this.pasos = pasos;
        this.vozacka = vozacka;
    }
    public People() {
    }

    public String getImePrzime() {
        return imePrzime;
    }

    public void setImePrzime(String imePrzime) {
        this.imePrzime = imePrzime;
    }

    public int getlKarta() {
        return lKarta;
    }

    public void setlKarta(int lKarta) {
        this.lKarta = lKarta;
    }

    public int getPasos() {
        return pasos;
    }

    public void setPasos(int pasos) {
        this.pasos = pasos;
    }

    public int getVozacka() {
        return vozacka;
    }

    public void setVozacka(int vozacka) {
        this.vozacka = vozacka;
    }
    public String toString(){
        return imePrzime;
    }
}
public class MVR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedQueue<People> licnaKarta = new LinkedQueue<People>();
        LinkedQueue<People> pasos = new LinkedQueue<People>();
        LinkedQueue<People> vozacka = new LinkedQueue<People>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++){
            String imePrezime = scanner.nextLine();
            int l = Integer.parseInt(scanner.nextLine());
            int p = Integer.parseInt(scanner.nextLine());
            int v = Integer.parseInt(scanner.nextLine());
            People people = new People(imePrezime,l,p,v);
            if(people.getlKarta() == 1){
                licnaKarta.enqueue(people);
            }else if(people.getPasos() == 1){
                pasos.enqueue(people);
            }else{
                vozacka.enqueue(people);
            }
        }
        while (!licnaKarta.isEmpty()){
            People people = licnaKarta.dequeue();
            if(people.getPasos() == 1){
                pasos.enqueue(people);
            }else if(people.getVozacka() == 1){
                vozacka.enqueue(people);
            }else{
                System.out.println(people);
            }
        }
        while (!pasos.isEmpty()){
            People people = pasos.dequeue();
            if(people.getVozacka() == 1){
                vozacka.enqueue(people);
            }else{
                System.out.println(people);
            }
        }
        while (!vozacka.isEmpty()){
            System.out.println(vozacka.dequeue());
        }
    }
}
