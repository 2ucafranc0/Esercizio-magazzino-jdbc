package org.generation.italy.magazzino.model.dao;

import java.sql.Connection;

public abstract class ADao {

	protected Connection jdbcConnectionToDatabase;

	public ADao(Connection jdbcConnectionToDatabase) {
		this.jdbcConnectionToDatabase = jdbcConnectionToDatabase;
	}
}
