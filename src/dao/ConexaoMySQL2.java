package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL2 {
	private static Status status;
	private static Connection connection;
	private static String serverAddress;
	private static String database;
	private static int port;
	private static String url;
	private static String username;
	private static String password;

	public static Connection getConnection() {
		return connection;
	}
	
	/**
	 * 
	 * @param serverAddress
	 * @param database
	 * @param username
	 * @param password
	 * @param port
	 */
	public static void configConnection(String serverAddress, String database, String username, String password,
			int port) {
		ConexaoMySQL2.serverAddress = serverAddress;
		ConexaoMySQL2.database = database;
		ConexaoMySQL2.username = username;
		ConexaoMySQL2.password = password;
		ConexaoMySQL2.port = port;
		ConexaoMySQL2.url = "jdbc:mysql://" + serverAddress + ":" + port + "/" + database;
		ConexaoMySQL2.status = Status.NOT_INITIALIZED;
	}

	public static Connection abrirConexaoMySQL() {
		try {
		  
				
			 
			connection = DriverManager.getConnection(url, username, password);
			if(connection == null) {
				throw new SQLException("Conexao Nula");
			}
			status = Status.SUCCESS;
			
			return connection;

		} catch (SQLException e) {
			e.printStackTrace();
			status = Status.FAIL;
			return null;
		}

	}

	public static Status getStatus() {
		System.out.println("Status: "+status);
		return status;
	}

	public static boolean fecharConexao() {
		status = Status.CLOSED;
		try {

			connection.close();

			return true;
		} catch (SQLException e) {
			return false;
		}

	}

	public static Connection ReiniciarConexao() {
		fecharConexao();
		return ConexaoMySQL2.abrirConexaoMySQL();
	}

}