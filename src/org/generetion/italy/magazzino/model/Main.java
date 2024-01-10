package org.generetion.italy.magazzino.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.generation.italy.magazzino.model.dao.ClienteDao;
import org.generation.italy.magazzino.model.entity.Cliente;

public class Main {

	public static void main(String[] args) throws MagazzinoModelException {
		// TODO Auto-generated method stub

		String databaseName = "magazzino";										
		String dbmsUserName = "root";								
		String dbmsPassword = "";												
		String jdbcUrl = "jdbc:mariadb://localhost:3306/" + databaseName;
		
		try {

			Connection jdbcConnectionToDatabase = DriverManager.getConnection(jdbcUrl, dbmsUserName, dbmsPassword);

			System.out.println("Connessione al database magazzino riuscita!");
			
	    
		Cliente clienteInserito = new Cliente("GVNNVR1234567890","Giovanni verga");
		
		ClienteDao clientedao= new ClienteDao(jdbcConnectionToDatabase);
	
	    clientedao.addCliente(clienteInserito);
	    
	    System.out.println("Cliente inserito=> " + clienteInserito.toString());	
	    
		
	} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
	

	}
}

