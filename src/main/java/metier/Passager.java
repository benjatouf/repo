package metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "Passager")
public class Passager {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Version
	private int version;
	private String nom;
	private String prenom;
	private TypeIdentite typeIdentite;
	@OneToOne(mappedBy = "passager")
	private Reservation reservation;
	
	public Passager() {
	}
	
	public Passager(int version, String nom, String prenom) {
		this.version = version;
		this.nom = nom;
		this.prenom = prenom;
	}
	public Passager(Long id, int version, String nom, String prenom) {
		this.id = id;
		this.version = version;
		this.nom = nom;
		this.prenom = prenom;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Passager [id=" + id + ", version=" + version + ", nom=" + nom + ", prenom=" + prenom + ", typeIdentite="
				+ typeIdentite + "]";
	}
	
	
	
}
