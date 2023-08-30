package fr.hb.dl.utils;

public class Connection {
    private static Connection instance= null;
    private static int counter = 0;

    private Connection(){
        counter++;
    }

    public static Connection getInstance(){
        if(instance == null){
            instance = new Connection();
        }
        return instance;

    }

    public void description(){
        System.out.println("Connection...");
        System.out.println("Nombre de connections"+ instance);
    }
}
