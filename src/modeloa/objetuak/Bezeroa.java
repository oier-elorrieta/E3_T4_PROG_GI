package modeloa.objetuak;

import java.util.Objects;

public class Bezeroa {
	private int idBezero;
	private String NAN;
	private String izena;
	private String abizena;
	private String erabiltzailea;
	private String pasahitza;
	private int txartela;
	private String sexua;
	
	@Override
	public int hashCode() {
		return Objects.hash(NAN, abizena, erabiltzailea, idBezero, izena, pasahitza, sexua, txartela);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bezeroa other = (Bezeroa) obj;
		return Objects.equals(NAN, other.NAN) && Objects.equals(abizena, other.abizena)
				&& Objects.equals(erabiltzailea, other.erabiltzailea) && idBezero == other.idBezero
				&& Objects.equals(izena, other.izena) && Objects.equals(pasahitza, other.pasahitza)
				&& Objects.equals(sexua, other.sexua) && txartela == other.txartela;
	}

	@Override
	public String toString() {
		return "Bezeroa [idBezero=" + idBezero + ", NAN=" + NAN + ", izena=" + izena + ", abizena=" + abizena
				+ ", erabiltzailea=" + erabiltzailea + ", pasahitza=" + pasahitza + ", txartela=" + txartela
				+ ", sexua=" + sexua + "]";
	}

	public Bezeroa(String NAN, String izena, String abizena, String erabiltzailea, String pasahitza, int txartela, String sexua) {
		this.NAN = NAN;
		this.izena = izena;
		this.abizena = abizena;
		this.erabiltzailea = erabiltzailea;
		this.pasahitza = pasahitza;
		this.txartela = txartela;
		this.sexua = sexua;
	}
	
	public int getIdBezero() {
		return idBezero;
	}
	
	public void setIdBezero(int idBezero) {
		this.idBezero = idBezero;
	}
	
	public String getNAN() {
		return NAN;
	}
	
	public void setNAN(String NAN) {
		this.NAN = NAN;
	}
	
	public String getIzena() {
		return izena;
	}
	
	public void setIzena(String izena) {
		this.izena = izena;
	}
	
	public String getAbizena() {
		return abizena;
	}
	
	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}
	
	public String getErabiltzailea() {
		return erabiltzailea;
	}
	
	public void setErabiltzailea(String erabiltzailea) {
		this.erabiltzailea = erabiltzailea;
	}
	
	public String getPasahitza() {
		return pasahitza;
	}
	
	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}
	
	public int getTxartela() {
		return txartela;
	}
	
	public void setTxartela(int txartela) {
		this.txartela = txartela;
	}

	public String getSexua() {
		return sexua;
	}

	public void setSexua(String sexua) {
		this.sexua = sexua;
	}
}
