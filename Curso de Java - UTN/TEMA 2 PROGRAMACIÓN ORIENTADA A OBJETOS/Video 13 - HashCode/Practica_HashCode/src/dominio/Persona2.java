package dominio;

import java.util.Objects;

public class Persona2 {
	
	private String nombnre;

	public String getNombnre() {
		return nombnre;
	}

	public void setNombnre(String nombnre) {
		this.nombnre = nombnre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombnre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona2 other = (Persona2) obj;
		return Objects.equals(nombnre, other.nombnre);
	}


	
	

}
