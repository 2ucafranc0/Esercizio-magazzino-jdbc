package org.generation.italy.magazzino.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.generation.italy.magazzino.model.entity.Cliente;
import org.generetion.italy.magazzino.model.MagazzinoModelException;
import org.generetion.italy.magazzino.model.jdbcConnection;

public class ClienteDao extends ADao {


	public ClienteDao(Connection jdbcConnectionToDatabase) {
		super(jdbcConnectionToDatabase);
		// TODO Auto-generated constructor stub
	}

	

	public void addCliente(Cliente clienteDaInserire) throws MagazzinoModelException {
		
		try {
			

			PreparedStatement preparedStatementInsertCliente = 
					this.jdbcConnectionToDatabase.prepareStatement(QueryCatalog.addCliente);
			
			preparedStatementInsertCliente.setString(1,clienteDaInserire.getCodiceFiscale());
			preparedStatementInsertCliente.setString(2,clienteDaInserire.getNominativo());
			
			preparedStatementInsertCliente.executeUpdate();
			
			
		}catch(SQLException sqlException) {
			
		
		 throw new MagazzinoModelException("ClienteDao -> addCliente -> " + sqlException.getMessage());
		}
	}
	
	
	
	
	
	
	
	
}
