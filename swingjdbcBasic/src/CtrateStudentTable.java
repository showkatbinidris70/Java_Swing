
import connection.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class CtrateStudentTable {

    static Connection con = DbConnection.getDblConnection();

    static public void createStudentTable() {
        String sql = "create table student (id int (11) primary key auto_increment, name varchar(50) not null)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println("Student Table Created");

        } catch (SQLException ex) {
            Logger.getLogger(CtrateStudentTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        createStudentTable();
    }
}
