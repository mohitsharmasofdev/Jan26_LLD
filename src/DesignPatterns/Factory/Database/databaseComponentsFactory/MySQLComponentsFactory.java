package DesignPatterns.Factory.Database.databaseComponentsFactory;

import DesignPatterns.Factory.Database.query.Query;
import DesignPatterns.Factory.Database.query.SQLQuery;
import DesignPatterns.Factory.Database.transaction.RCTransaction;
import DesignPatterns.Factory.Database.transaction.Transaction;

public class MySQLComponentsFactory implements DatabaseComponentsFactory{
    @Override
    public Query createQuery() {
        return new SQLQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new RCTransaction();
    }
}
