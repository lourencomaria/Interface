package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexao {



    private static final String DRIVER ="com.mysql.jdbc.Driver";
    private static final  String URL = "jdbc:mysql://localhost:3306/bdtrabds";
    private static final  String USER = "root";
    private static final String PASS ="";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName(DRIVER);
        return DriverManager.getConnection(URL, USER, PASS);
    }

    public static void closeConnection(Connection con) throws SQLException {
        if(con != null){
            con.close();

        }


    }

    public static void closeConnection(Connection con, PreparedStatement stmt) throws SQLException {
        if(stmt != null){
            stmt.close();

        }


    }

}
