package metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "Particulier")
public class Particulier extends Client {

	@Column(name = "prenom", length =20)
	private String prenom;
	
	

	public Particulier(Long id, int version, String nom, String prenom) {
		super(id, version, nom);
		this.prenom = prenom;
	}

	public Particulier(int version, String nom) {
		super(version, nom);
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
