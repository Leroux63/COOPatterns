package fr.hb.dl.singleton;

public class LoggerSingleton {
    private static LoggerSingleton loggerSingleton;

    private static int nbrInstances;
    public void LoggerSingleton() {

    }
    public static LoggerSingleton getLoggerSingleton(){
        if(loggerSingleton == null){
            loggerSingleton = new LoggerSingleton();
        }
        return loggerSingleton;
    }

    public void logInfo(String info){
        System.out.println(info);
        System.out.println("Il existe "+ nbrInstances +" instance");
    }

    private LoggerSingleton(){
        nbrInstances++;
    }
}
