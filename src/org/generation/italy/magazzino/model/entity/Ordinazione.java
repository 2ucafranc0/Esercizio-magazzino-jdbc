package org.generation.italy.magazzino.model.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Ordinazione {

	private String codiceFiscale,codiceProdotto;
	private int quantitaOrdine;
	private float prezzoAcquisto;
	private LocalDate dataOrdine;
	
	public Ordinazione(String codiceFiscale, String codiceProdotto, int quantitaOrdine, float prezzoAcquisto) {
		super();
		this.codiceFiscale = codiceFiscale;
		this.codiceProdotto = codiceProdotto;
		this.quantitaOrdine = quantitaOrdine;
		this.prezzoAcquisto = prezzoAcquisto;
		this.dataOrdine.now();
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getCodiceProdotto() {
		return codiceProdotto;
	}

	public void setCodiceProdotto(String codiceProdotto) {
		this.codiceProdotto = codiceProdotto;
	}

	public int getQuantitaOrdine() {
		return quantitaOrdine;
	}

	public void setQuantitaOrdine(int quantitaOrdine) {
		this.quantitaOrdine = quantitaOrdine;
	}

	public float getPrezzoAcquisto() {
		return prezzoAcquisto;
	}

	public void setPrezzoAcquisto(float prezzoAcquisto) {
		this.prezzoAcquisto = prezzoAcquisto;
	}

	public LocalDate getDataOrdine() {
		return dataOrdine;
	}

	public void setDataOrdine(LocalDate dataOrdine) {
		this.dataOrdine = dataOrdine;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codiceFiscale, codiceProdotto, dataOrdine, prezzoAcquisto, quantitaOrdine);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ordinazione other = (Ordinazione) obj;
		return Objects.equals(codiceFiscale, other.codiceFiscale)
				&& Objects.equals(codiceProdotto, other.codiceProdotto) && Objects.equals(dataOrdine, other.dataOrdine)
				&& Float.floatToIntBits(prezzoAcquisto) == Float.floatToIntBits(other.prezzoAcquisto)
				&& quantitaOrdine == other.quantitaOrdine;
	}

	@Override
	public String toString() {
		return "Ordinazione [codiceFiscale=" + codiceFiscale + ", codiceProdotto=" + codiceProdotto
				+ ", quantitaOrdine=" + quantitaOrdine + ", prezzoAcquisto=" + prezzoAcquisto + ", dataOrdine="
				+ dataOrdine + "]";
	}
	
	
}
