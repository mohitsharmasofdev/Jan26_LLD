package Exception;

import java.sql.SQLException;

public class Client {
    public static void main(String[] args) throws SQLException{
        try {
            doSomething();
        } catch (SQLException exception){
            System.out.println("Mitigated SQL Exception");
//            throw new SQLException();
        }


    }

    public static void doSomething() throws SQLException{
        ExceptionDemo exceptionDemo = new ExceptionDemo();
        exceptionDemo.find(10);
        exceptionDemo.find(9);
        exceptionDemo.find(2);
    }
}
