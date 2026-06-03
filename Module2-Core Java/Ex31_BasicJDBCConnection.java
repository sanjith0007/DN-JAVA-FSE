import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class BasicJDBCConnection {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection dbLink =
                    DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/studentdb",
                            "root",
                            "password");

            Statement sqlBox =
                    dbLink.createStatement();

            ResultSet dataRows =
                    sqlBox.executeQuery(
                            "select * from students");

            while(dataRows.next()) {

                System.out.println(
                        dataRows.getInt(1) + " " +
                        dataRows.getString(2));
            }

            dbLink.close();

        } catch(Exception err) {

            System.out.println(err);
        }
    }
}

/*
Output:
1 Ram
2 Sam
*/