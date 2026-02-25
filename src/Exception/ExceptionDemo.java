package Exception;

import java.sql.SQLException;

public class ExceptionDemo {
    public void find(Integer input) throws SQLException{
        if(input % 5 == 0){
            throw new NullPointerException();
        } else if (input % 3 == 0){
            throw new InsufficientBalanceException("The balance is not sufficient");
        } else if (input % 2 == 0){
//             must be caught or declared to be thrown
            throw new SQLException();
        }
    }
}
