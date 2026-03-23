package DesignPatterns.Factory.Database.databaseComponentsFactory;

import DesignPatterns.Factory.Database.query.Query;
import DesignPatterns.Factory.Database.transaction.Transaction;

public interface DatabaseComponentsFactory {
    Query createQuery();
    Transaction createTransaction();
    // Updator createUpdator();
}
