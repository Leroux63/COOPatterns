package fr.hb.dl.model;

import fr.hb.dl.interfaces.Readable;

public abstract class Item implements Readable {

    private static int nbItems = 0;
    private String title;
    private int year;

    public Item(String title,int year){
        this.title = title;
        this.year = year;
        nbItems += 1;
    }

    public static int getNbItems() {
        return nbItems;
    }

    public static void setNbItems(int nbItems) {
        Item.nbItems = nbItems;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static int getNombreItems(){
        return nbItems;
    }

    @Override
    public void read() {
        System.out.print("Je lis "+title);
    }

}
