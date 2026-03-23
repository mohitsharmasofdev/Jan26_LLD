package DesignPatterns.Factory.Database.db;

import DesignPatterns.Factory.Database.databaseComponentsFactory.DatabaseComponentsFactory;
import DesignPatterns.Factory.Database.databaseComponentsFactory.MySQLComponentsFactory;

public class MySQL extends Database {
    @Override
    public DatabaseComponentsFactory createDatabaseComponentsFactory() {
        return new MySQLComponentsFactory();
    }
}
