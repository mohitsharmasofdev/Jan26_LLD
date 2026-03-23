package DesignPatterns.Factory.Database;

import DesignPatterns.Factory.Database.databaseComponentsFactory.DatabaseComponentsFactory;
import DesignPatterns.Factory.Database.db.Database;
import DesignPatterns.Factory.Database.query.Query;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String databaseName = scanner.nextLine();
        Database db = DatabaseFactory.createDatabaseByName(databaseName);

//        Query q = null;
//        if(databaseName.equals("mysql")){
//            q = new SQLQuery();
//        } else if (databaseName.equals("mongodb")){
//            q = new NoSQLQuery();
//        }
//        Query q = db.createQuery();
        DatabaseComponentsFactory databaseComponentsFactory = db.createDatabaseComponentsFactory();
        Query q = databaseComponentsFactory.createQuery();
    }
}
