package org.generation.italy.magazzino.model.dao;

public class QueryCatalog {


	public static final String selectClientiConLetteraScelta =
			"SELECT cliente"
			+ "FROM cliente"
			+ "WHERE cliente.nominativo like %?%";
	
	public static final String addCliente =
			"INSERT INTO cliente (codice_fiscale, nominativo) VALUES (?, ?)";
			
}
