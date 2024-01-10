package org.generetion.italy.magazzino.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcConnection {

	private String databaseName;
	private String dbmsUserName;
	private String dbmsPassword;
	String jdbcUrl;
		
  public jdbcConnection(String databaseName, String dbmsUserName, String dbmsPassword) {
		super();
		this.databaseName = databaseName;
		this.dbmsUserName = dbmsUserName;
		this.dbmsPassword = dbmsPassword;
		this.jdbcUrl = "jdbc:mariadb://localhost:3306/" + databaseName;  
		try {

			Connection jdbcConnectionToDatabase = DriverManager.getConnection(jdbcUrl, dbmsUserName, dbmsPassword);

			System.out.println("Connessione al database "+ databaseName + " riuscita!");
        } catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
  }
}



