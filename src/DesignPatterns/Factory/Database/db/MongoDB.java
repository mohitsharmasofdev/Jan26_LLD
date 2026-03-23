package DesignPatterns.Factory.Database.db;

import DesignPatterns.Factory.Database.databaseComponentsFactory.DatabaseComponentsFactory;
import DesignPatterns.Factory.Database.databaseComponentsFactory.MongoDBComponentsFactory;

public class MongoDB extends Database {
    @Override
    public DatabaseComponentsFactory createDatabaseComponentsFactory() {
        return new MongoDBComponentsFactory();
    }
}
