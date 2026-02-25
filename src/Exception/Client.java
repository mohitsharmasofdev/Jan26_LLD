package Exception;

import java.sql.SQLException;

public class Client {
    public static void main(String[] args) throws SQLException{
        try {
            doSomething();
        } catch (SQLException exception){
            System.out.println("Mitigated SQL Exception");
//            throw new SQLException();
        } catch (Exception exception){
            System.out.println("Mitigated an Exeception : " + exception.getMessage());
//            throw new SQLException();
        } finally {
            System.out.println("Printing something from finally!");
        }

        System.out.println("executing after try catch!");
        // Issue : exception java.sql.SQLException has already been caught
//        try {
//            doSomething();
//        } catch (Exception exception){
//            System.out.println("Mitigated SQL Exception");
////            throw new SQLException();
//        } catch (SQLException exception){
//            System.out.println("Mitigated an Exeception : " + exception.getMessage());
//        }
//        int counter = 3;
//        for(int i = 1; i <= counter; i++){
//            try {
//                connect();
//                break;
//            } catch (Exception exception){
//                if(i == counter){
//                    throw new RuntimeException("Connection failed even after " + counter + " retries!");
//                }
//                System.out.println("Connection failed , will retry!");
//            }
//        }

        recur();


    }
    public static void recur(){
        recur();
    }
    public static void connect() {
        System.out.println("Connecting to Database");
        throw new RuntimeException();
    }

    public static void doSomething() throws SQLException{
        ExceptionDemo exceptionDemo = new ExceptionDemo();
        exceptionDemo.find(9);
        exceptionDemo.find(11);
        exceptionDemo.find(11);
    }
}
