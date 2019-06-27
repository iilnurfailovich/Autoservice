package Services;

import java.sql.*;

public class DBStatementService extends Exception {

    private Statement statement = null;
    private ResultSet result = null;

    DBConnectionService db = new DBConnectionService();

    public int executeUpdate(String sql) {
        int rofUpdate = 0;
        try {
            statement = db.getConnection().createStatement();
            rofUpdate = statement.executeUpdate(sql);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                closeExecuteUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return rofUpdate;
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