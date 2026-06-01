import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class StudentDAO {

    Connection openConnection() throws Exception {

        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "password");
    }

    void insertStudent(int idValue,String studentName)
            throws Exception {

        Connection dbObj = openConnection();

        PreparedStatement saveRow =
                dbObj.prepareStatement(
                        "insert into students values(?,?)");

        saveRow.setInt(1,idValue);
        saveRow.setString(2,studentName);

        saveRow.executeUpdate();

        dbObj.close();
    }

    void updateStudent(int idValue,String studentName)
            throws Exception {

        Connection dbObj = openConnection();

        PreparedStatement updateRow =
                dbObj.prepareStatement(
                        "update students set name=? where id=?");

        updateRow.setString(1,studentName);
        updateRow.setInt(2,idValue);

        updateRow.executeUpdate();

        dbObj.close();
    }
}

class InsertUpdateJDBC {

    public static void main(String[] args)
            throws Exception {

        StudentDAO helperObj =
                new StudentDAO();

        helperObj.insertStudent(101,"Ram");

        helperObj.updateStudent(101,"Ramesh");

        System.out.println("Done");
    }
}

/*
Output:
Done
*/