package Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnectionService extends Exception {

    private static String url;
    private static String username;
    private static String password;

    private Connection connection;

    public static void InitSettings(String URL, String Username, String Password) {
        url = URL;
        username = Username;
        password = Password;
    }

    public Connection getConnection() {
        //"jdbc:mysql://localhost:3306/names";

        Properties dbInfo = new Properties();

        dbInfo.put("user", username); //"root");
        dbInfo.put("password", password);//"sonyericssonxperiax8");

        try {
            connection = DriverManager.getConnection(url, dbInfo);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        return connection;
    }

    public void closeConnection(){
        try {
            connection.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
