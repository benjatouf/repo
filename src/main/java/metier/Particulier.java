package metier;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "Particulier")
public class Particulier extends Client {

	@Column(name = "prenom", length =20)
	private String prenom;
	
	

	
	
	public Particulier(int version, String nom, List<Adresse> adresse, List<Adresse> adresses) {
		super(version, nom, adresse, adresses);
	}

	public Particulier(Long id, int version, String nom, List<Adresse> adresse, List<Adresse> adresses) {
		super(id, version, nom, adresse, adresses);
	}

	public Particulier() {
		super();
		
	}

	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Particulier [prenom=" + prenom + "]";
	}
	
}
