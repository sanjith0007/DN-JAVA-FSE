import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class TransactionHandlingJDBC {

    public static void main(String[] args) {

        try {

            Connection bankLink =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/bankdb",
                            "root",
                            "password");

            bankLink.setAutoCommit(false);

            PreparedStatement debitQuery =
                    bankLink.prepareStatement(
                            "update accounts set balance=balance-? where id=?");

            debitQuery.setInt(1,500);
            debitQuery.setInt(2,1);

            debitQuery.executeUpdate();

            PreparedStatement creditQuery =
                    bankLink.prepareStatement(
                            "update accounts set balance=balance+? where id=?");

            creditQuery.setInt(1,500);
            creditQuery.setInt(2,2);

            creditQuery.executeUpdate();

            bankLink.commit();

            System.out.println("Transfer Successful");

        } catch(Exception err) {

            System.out.println("Transfer Failed");
        }
    }
}

/*
Output:
Transfer Successful
*/