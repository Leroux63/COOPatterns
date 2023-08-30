package fr.hb.dl.utils;
public class ImpThread extends Thread {
    @Override
    public void run(){
        ThreadConnection.getInstance().description();
    }
}
