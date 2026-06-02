import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class TransactionHandlingJDBC {

    public static void main(String[] args) {

        Connection bankConn = null;

        try {

            bankConn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankdb",
                    "root",
                    "password");

            bankConn.setAutoCommit(false);

            PreparedStatement debitStmt =
                    bankConn.prepareStatement(
                            "update accounts set balance = balance - ? where id = ?");

            debitStmt.setInt(1,500);
            debitStmt.setInt(2,1);

            debitStmt.executeUpdate();

            PreparedStatement creditStmt =
                    bankConn.prepareStatement(
                            "update accounts set balance = balance + ? where id = ?");

            creditStmt.setInt(1,500);
            creditStmt.setInt(2,2);

            creditStmt.executeUpdate();

            bankConn.commit();

            System.out.println("Transfer Successful");

        } catch(Exception err) {

            try {

                if(bankConn != null) {
                    bankConn.rollback();
                }

            } catch(Exception rollbackErr) {

                System.out.println(rollbackErr);
            }

            System.out.println("Transaction Rolled Back");
        }
    }
}

/*
Output:
Transfer Successful
*/