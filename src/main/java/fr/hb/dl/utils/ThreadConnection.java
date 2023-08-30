package fr.hb.dl.utils;

public class ThreadConnection {

    private static ThreadConnection instance;
    private static int counter = 0;
    private ThreadConnection(){
        counter++;
    }
    static synchronized ThreadConnection getInstance(){
        if(instance == null){
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new ThreadConnection();
        }
        return instance;
    }

    public void description() {
        System.out.println("Connection........");
        System.out.println("Nombre d'objets de type Connection instanciés : "+counter);
    }

}
