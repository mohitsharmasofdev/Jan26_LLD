package DesignPatterns.Factory.Database;

import DesignPatterns.Factory.Database.db.Database;
import DesignPatterns.Factory.Database.db.MongoDB;
import DesignPatterns.Factory.Database.db.MySQL;

public class DatabaseFactory {
    public static Database createDatabaseByName(String databaseName){
        Database d = null;
        if(databaseName.equals("mysql")){
            d = new MySQL();
        } else if(databaseName.equals("mongodb")){
            d = new MongoDB();
        }
        return d;
    }
}
