package server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class database {

    private static Statement stat;
    public static Connection con;
    public static void init() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver") ;
        String url="jdbc:mysql:"
                + "//127.0.0.1:3306/12306?useSSL=false&serverTimezone=UTC";
        String user="root";
        String password="123456";
        con = DriverManager.getConnection(url,user,password);
        System.out.println("CHENGG");
        stat = con.createStatement();
    }
    public static Statement getStat() throws ClassNotFoundException, SQLException{
        if(stat==null) init();
        return stat;
    }
    //public static void main(String agrsp[])
}
