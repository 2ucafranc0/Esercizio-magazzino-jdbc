package org.generation.italy.magazzino.model.entity;

import java.util.Objects;

public class Prodotto {

private String codiceProdotto,descrizione;
private int quantitaDisponibile;
private float prezzo;

public Prodotto(String codiceProdotto, String descrizione, int quantitaDisponibile, float prezzo) {
	super();
	this.codiceProdotto = codiceProdotto;
	this.descrizione = descrizione;
	this.quantitaDisponibile = quantitaDisponibile;
	this.prezzo = prezzo;
}

public String getCodiceProdotto() {
	return codiceProdotto;
}

public void setCodiceProdotto(String codiceProdotto) {
	this.codiceProdotto = codiceProdotto;
}

public String getDescrizione() {
	return descrizione;
}

public void setDescrizione(String descrizione) {
	this.descrizione = descrizione;
}

public int getQuantitaDisponibile() {
	return quantitaDisponibile;
}

public void setQuantitaDisponibile(int quantitaDisponibile) {
	this.quantitaDisponibile = quantitaDisponibile;
}

public float getPrezzo() {
	return prezzo;
}

public void setPrezzo(float prezzo) {
	this.prezzo = prezzo;
}

@Override
public int hashCode() {
	return Objects.hash(codiceProdotto, descrizione, prezzo, quantitaDisponibile);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Prodotto other = (Prodotto) obj;
	return Objects.equals(codiceProdotto, other.codiceProdotto) && Objects.equals(descrizione, other.descrizione)
			&& Float.floatToIntBits(prezzo) == Float.floatToIntBits(other.prezzo)
			&& quantitaDisponibile == other.quantitaDisponibile;
}

@Override
public String toString() {
	return "Prodotto [codiceProdotto=" + codiceProdotto + ", descrizione=" + descrizione + ", quantitaDisponibile="
			+ quantitaDisponibile + ", prezzo=" + prezzo + "]";
}
	
}
