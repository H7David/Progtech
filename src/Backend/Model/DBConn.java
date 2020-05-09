package Backend.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Backend.Model.Builder.Kpversenyzo;
import java.sql.PreparedStatement;
import java.util.logging.Logger;

public class DBConn {

private static final Logger LOG = Logger.getLogger(DBConn.class.getName());
Connection conn = null;
 Statement statement = null;


/**
     * visszaadja a legutoljára létrehozott kpversenyző példányát.
     *
     * @return Versenyzo
     */
public Kpversenyzo Select() {
        Kpversenyzo temp = new Kpversenyzo();
        Connect();
        try {

            String sql = "SELECT name, kerekpargyarto, kptipus FROM versenyzo WHERE id = (SELECT MAX(id) FROM versenyzo)";
             statement  = conn.createStatement();           
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                temp.setNev(rs.getString("name"));
                temp.setKerekpargyarto(rs.getString("kerekpargyarto"));
                temp.setKptipus(rs.getString("kptipus"));
            }
            conn.close();
            LOG.info("Versenyző lekérdezése sikeres,az adatbázis szétkapcsolva.");

        } catch (Exception e) {
            e.printStackTrace();
            LOG.info(e.getMessage());
        }
        return temp;
    }








    /**
     * Egy versenyzőt tudunk az adatbázishoz adni.
     *
     * @param versenyzo egy kpversenyzőt az adatbázisban tárol el
     */
    public void Insert(Kpversenyzo versenyzo) {
        Connect();
        try {
            String sql = "INSERT INTO versenyzo (name, kerekpargyarto, kptipus)"
                    + "VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, versenyzo.getNev());
            preparedStatement.setString(2, versenyzo.getKerekpar());
            preparedStatement.setString(3, versenyzo.getKptipus());
            preparedStatement.executeUpdate();
            conn.close();
            LOG.info("Insert sikeres, az adatbázis szétkapcsolva.");
        } catch (Exception e) {
            e.printStackTrace();
            LOG.info(e.getMessage());
        }

    }








public void Connect(){
try {

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/progt","root","");
            LOG.info("Database connection established");
        } catch (Exception e) {
            LOG.info(e.getMessage());
            e.printStackTrace();

        }


}

 
}
