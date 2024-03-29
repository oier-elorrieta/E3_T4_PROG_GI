package modeloa.objetuak;

import java.util.ArrayList;
import java.util.Objects;

public class Zinema {

	private String izena;
	private String helbidea;
	private ArrayList<Aretoa> aretoList;
	private ArrayList<Saioa> saioList;

	// --------------------Konstruktorea--------------------//
	public Zinema(String izena, String helbidea, ArrayList<Aretoa> aretoList, ArrayList<Saioa> saioList) {
		this.izena = izena;
		this.helbidea = helbidea;
		this.aretoList = aretoList;
		this.saioList = saioList;
	}
	// --------------------Konstruktorea--------------------//

	// --------------------Set--------------------//
	public void setIzena(String izena) {
		this.izena = izena;
	}

	public void setHelbidea(String helbidea) {
		this.helbidea = helbidea;
	}

	public void setAretoList(ArrayList<Aretoa> aretoList) {
		this.aretoList = aretoList;
	}

	public void setSaioList(ArrayList<Saioa> saioList) {
		this.saioList = saioList;
	}


	// --------------------Set--------------------//

	// --------------------Get--------------------//
	public String getIzena() {
		return izena;
	}

	public String getHelbidea() {
		return helbidea;
	}

	public ArrayList<Aretoa> getAretoList() {
		return aretoList;
	}

	public ArrayList<Saioa> getSaioList() {
		return saioList;
	}

	// --------------------Get--------------------//

	// --------------------toString--------------------//

@Override
	public String toString() {
		return "Zinema [izena=" + izena + ", helbidea=" + helbidea + ", aretoList=" + aretoList + ", saioList="
				+ saioList + "]";
	}

	// --------------------toString--------------------//

	// --------------------Equals--------------------//

@Override
public int hashCode() {
	return Objects.hash(aretoList, helbidea, izena, saioList);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Zinema other = (Zinema) obj;
	return Objects.equals(aretoList, other.aretoList) && Objects.equals(helbidea, other.helbidea)
			&& Objects.equals(izena, other.izena) && Objects.equals(saioList, other.saioList);
}


	// --------------------Equals--------------------//

}
