package Services;

import java.sql.*;

public class DBStatementService extends Exception {

    Statement statement = null;
    ResultSet result = null;

    public int executeUpdate(String sql) {
        int executeUpdate = 0;
        try {
            statement.getConnection().createStatement();
            result = statement.executeQuery(sql);

        } catch (Exception e) {
            e.printStackTrace();


        }
        return executeUpdate;
    }

    public void closeExecuteUpdate() {
        try {
            statement.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            result.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}