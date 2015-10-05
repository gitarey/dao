package id.ac.uad.plankton;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.sql.*;

/**
 * Created by gov on 29/09/15.
 */

/*public class mainAplication {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Register Class Succes");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/planktondb", "root", "8");

            System.out.println("Connection is now" + (connection.isClosed() ? "Closed" : "Open"));

           PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO id.ac.uad.plankton.student (id,name,address )VALUES (?,?,?)");
            preparedStatement.setInt(1, 3);
            preparedStatement.setString(2, "Gita Reynaldi");
            preparedStatement.setString(3, "Jalan Batikan");
            int affectedRow = preparedStatement.executeUpdate();
            System.out.println("succes added " + affectedRow);

            PreparedStatement preparedStatement1 = connection.prepareStatement("UPDATE KELAS SET nama_kelas ='Ruang 202' WHERE id_kelas ='234' ");
            int affectedRow1 = preparedStatement1.executeUpdate();
            System.out.println("berhasil update " + affectedRow1);

           PreparedStatement preparedStatement2 = connection.prepareStatement("INSERT INTO KRS (id,id_kelas,nilai)VALUES (?,?,?)");
            preparedStatement2.setInt(1, 2);
            preparedStatement2.setInt(2, 234);
            preparedStatement2.setInt(3, 90);
            int affectedRow2 = preparedStatement2.executeUpdate();
            System.out.println("i did it "+affectedRow2);



            System.out.println("Succes Execute Update, Row Affected : " + affectedRow);
        } catch (ClassNotFoundException e) {
            System.err.println("Register Failed : " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Connection Failed :" + e.getMessage() + "" +e.getMessage());
        } catch (Exception e){
            System.err.println("Unknow Exeption : "+ e.getMessage());
        }


    }
}
*/