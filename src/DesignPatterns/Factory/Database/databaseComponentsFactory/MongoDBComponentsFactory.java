package DesignPatterns.Factory.Database.databaseComponentsFactory;

import DesignPatterns.Factory.Database.query.NoSQLQuery;
import DesignPatterns.Factory.Database.query.Query;
import DesignPatterns.Factory.Database.transaction.RUTransaction;
import DesignPatterns.Factory.Database.transaction.Transaction;

public class MongoDBComponentsFactory implements DatabaseComponentsFactory{
    @Override
    public Query createQuery() {
        return new NoSQLQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new RUTransaction();
    }
}
