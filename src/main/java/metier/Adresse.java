package metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "Adresse")
public class Adresse {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Version
	private int version;
	@Column(name = "rue", length = 50)
	private String rue;
	@Column(name = "complement", length = 100)
	private String complement;
	@Column(name = "codePostal", length = 6)
	private String codePostal;
	@Column(name = "ville", length = 50)
	private String ville;
	@Column(name = "pays", length = 25)
	private String pays;
	
	
	public Adresse(Long id, int version, String rue, String complement, String codePostal, String ville, String pays) {
		this.id = id;
		this.version = version;
		this.rue = rue;
		this.complement = complement;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}

	public Adresse(int version, String rue, String complement, String codePostal, String ville, String pays) {
		this.version = version;
		this.rue = rue;
		this.complement = complement;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}

	public Adresse() {
		super();
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

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	@Override
	public String toString() {
		return "Adresse [id=" + id + ", version=" + version + ", rue=" + rue + ", complement=" + complement
				+ ", codePostal=" + codePostal + ", ville=" + ville + ", pays=" + pays + "]";
	}
	
	
	
	
	
	
	

}
