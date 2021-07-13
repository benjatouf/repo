package metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "Ville")
public class Ville {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Version
	private int version;
	@Column(name = "Name")
	private String nom;
	
	
	public Ville(Long id, int version, String nom) {
		this.id = id;
		this.version = version;
		this.nom = nom;
	}

	public Ville( int version, String nom) {
		this.version = version;
		this.nom = nom;
	}

	
	public Ville(Long id, String nom) {
		this.id = id;
		this.nom = nom;
	}
	
	public Ville(String nom) {
		this.nom = nom;
	}
	
	public Ville() {
		
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

	@Override
	public String toString() {
		return "Ville [id=" + id + ", version=" + version + ", nom=" + nom + "]";
	}
	
	
	
	
}
