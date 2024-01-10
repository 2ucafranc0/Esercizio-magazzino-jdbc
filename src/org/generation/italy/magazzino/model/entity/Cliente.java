package org.generation.italy.magazzino.model.entity;

import java.util.Objects;

public class Cliente {

	private String codiceFiscale,nominativo;

	public Cliente(String codiceFiscale, String nominativo) {
		super();
		this.codiceFiscale = codiceFiscale;
		this.nominativo = nominativo;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getNominativo() {
		return nominativo;
	}

	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codiceFiscale, nominativo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(codiceFiscale, other.codiceFiscale) && Objects.equals(nominativo, other.nominativo);
	}

	@Override
	public String toString() {
		return "Cliente [codiceFiscale=" + codiceFiscale + ", nominativo=" + nominativo + "]";
	}
	
}
