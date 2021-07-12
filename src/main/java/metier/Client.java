package metier;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "Client")
public abstract class Client  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Version
	private int version;
	@Column(name = "nom", length = 20)
	private String nom;
	@OneToMany(mappedBy = "client")
	private List<Adresse> adresse = new ArrayList<Adresse>();
	@OneToMany(mappedBy = "client")
	private List<Adresse> adresses = new ArrayList<Adresse>();
	
	
	public Client(Long id, int version, String nom) {
		this.id = id;
		this.version = version;
		this.nom = nom;
	}

	public Client() {
		super();
	}
	
	public Client( int version, String nom) {
		this.version = version;
		this.nom = nom;
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
		return "Client [id=" + id + ", version=" + version + ", nom=" + nom + "]";
	}
	
	
	
	

	
	
}
