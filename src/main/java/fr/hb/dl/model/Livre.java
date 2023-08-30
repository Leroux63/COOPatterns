package fr.hb.dl.model;

public class Livre extends Item {
    private String author;

    public Livre(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public void read() {
        super.read();
        System.out.print(" de "+getAuthor());
    }
}
