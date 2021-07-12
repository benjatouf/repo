package metier;

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
	
	public Entreprise(Long id, int version, String nom, String siret, String numeroTva,
			StatutJuridique statutJuridique) {
		super(id, version, nom);
		this.siret = siret;
		this.numeroTva = numeroTva;
		this.statutJuridique = statutJuridique;
	}
	
	
	public Entreprise( int version, String nom, String siret, String numeroTva,
			StatutJuridique statutJuridique) {
		super(version, nom);
		this.siret = siret;
		this.numeroTva = numeroTva;
		this.statutJuridique = statutJuridique;
	}
	
	

	public Entreprise() {
		super();
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
