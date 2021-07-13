package metier;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pathway")
public class Entreprise extends Client {
	
	@Column(name = "siret")
	private String siret;
	@Column(name = "numeroTva")
	private String numeroTva;
	@Column(name = "statutJuridique")
	private StatutJuridique statutJuridique;
	
	


	public Entreprise() {
		super();
	}

	public Entreprise(int version, String nom, List<Adresse> adresse, List<Adresse> adresses) {
		super(version, nom, adresse, adresses);
	}

	public Entreprise(Long id, int version, String nom, List<Adresse> adresse, List<Adresse> adresses) {
		super(id, version, nom, adresse, adresses);
	}


	public String getSiret() {
		return siret;
	}


	public void setSiret(String siret) {
		this.siret = siret;
	}


	public String getNumeroTva() {
		return numeroTva;
	}


	public void setNumeroTva(String numeroTva) {
		this.numeroTva = numeroTva;
	}


	public StatutJuridique getStatutJuridique() {
		return statutJuridique;
	}


	public void setStatutJuridique(StatutJuridique statutJuridique) {
		this.statutJuridique = statutJuridique;
	}

	@Override
	public String toString() {
		return "Entreprise [siret=" + siret + ", numeroTva=" + numeroTva + ", statutJuridique=" + statutJuridique + "]";
	}


	
}
