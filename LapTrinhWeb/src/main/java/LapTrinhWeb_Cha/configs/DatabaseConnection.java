package LapTrinhWeb_Cha.configs;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static final String serverName = "localhost";
	private static final String dbName = "LapTrinhWeb";
	private static final String portNumber = "1433";
	private static final String instance = "";
	private static final String USER = "sa";
	private static final String PASSWORD = "123..231";

	public static Connection getConnection() {
		Connection conn = null;
		try {
			String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + "\\" + instance + ";databaseName="
					+ dbName;

			if (instance == null || instance.trim().isEmpty())

				url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;

			conn = DriverManager.getConnection(url, USER, PASSWORD);

			if (conn != null) {

				DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
				System.out.println("Dirver name: " + dm.getDriverName());
				System.out.println("Dirver version: " + dm.getDriverVersion());
				System.out.println("Product name: " + dm.getDatabaseProductName());
				System.out.println("Product version: " + dm.getDatabaseProductVersion());

				return conn;
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return null;

	}

	public static void main(String[] args) {
		try {
			System.out.print(new DatabaseConnection().getConnection());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
