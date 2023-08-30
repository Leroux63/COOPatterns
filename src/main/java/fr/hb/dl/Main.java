package fr.hb.dl;

import fr.hb.dl.singleton.LoggerSingleton;

import java.sql.*;

public class Main {
    public static void main(String[] args) {



//        //Exercice pdf 1
//        System.out.println(Item.getNombreItems());
//        Livre monlivre= new Livre("Economie mondiale", 1989, "Tugan");
//        monlivre.read();
//        Magazine monMagazine = new Magazine("Turbo",2021,54);
//        monMagazine.read();
//        System.out.println("--*");
//        System.out.println(Item.getNombreItems());

        String url = "jdbc:mysql://localhost/jdbccourses?serverTimezone=UTC";
        String user = "root";
        String password = "root";

        Connection connection = null;
        LoggerSingleton logger = null;

        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Etat de la connection");
            System.out.println(connection.isClosed() ? "fermée" : "ouvert");
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Category");
            LoggerSingleton.getLoggerSingleton().logInfo("SELECT * FROM Category");
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("libelle"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

//        try {
//            LoggerSingleton.getLoggerSingleton()
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

    }

}

