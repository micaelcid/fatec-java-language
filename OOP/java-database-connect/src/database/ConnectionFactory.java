package database;

import java.sql.*;

public class ConnectionFactory {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        String host = "ec2-174-129-253-42.compute-1.amazonaws.com";
        String database = "dd6kqdmeeka2em";
        String url = "jdbc:postgresql://" + host + "/" + database + "?sslmode=require";
        String user = "anpibshpfmlyrg";
        String password = "7c85138b7ab0abcaf6337cc73cbc249f58536e3b021b0080a3eaf1255048c00b";

        return DriverManager.getConnection(url, user, password);
    }
}
