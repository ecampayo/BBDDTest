import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BBDDTest {
    public static void main(String[] args) throws SQLException {
        Connection dbConnection=null;
        try{
            dbConnection= DriverManager.getConnection("jdbc:mysql://localhost:3306/","root", "estefania");
            System.out.println("Conexión ha sido establecida");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
