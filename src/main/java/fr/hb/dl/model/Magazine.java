package fr.hb.dl.model;

public class Magazine extends Item {

    private int numeroMagazine;

    public Magazine(String title, int year, int numeroMagazine) {
        super(title, year);
        this.numeroMagazine = numeroMagazine;
    }

    public int getNumeroMagazine() {
        return numeroMagazine;
    }

    public void setNumeroMagazine(int numeroMagazine) {
        this.numeroMagazine = numeroMagazine;
    }


    public void read() {
        super.read();
        System.out.print(" numero " + numeroMagazine);
    }



}
