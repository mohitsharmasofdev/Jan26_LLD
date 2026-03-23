package DesignPatterns.Factory.Database.db;

import DesignPatterns.Factory.Database.databaseComponentsFactory.DatabaseComponentsFactory;

public abstract class Database {
    // connect()
    // getPool()
//    // getPoolSize()
//    public abstract Query createQuery();
//    public abstract Transaction createTransaction();
//    // public abstract Updator createUpdator();
    public abstract DatabaseComponentsFactory createDatabaseComponentsFactory();
}
