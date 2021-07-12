package metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "Billet")
public class Billet {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Version
	private int version;
	private String numeroPlace;
	private String classe;
	private float prix;
	
	
	
	public Billet() {
	}


	public Billet(int version, String numeroPlace, String classe, float prix) {
		this.version = version;
		this.numeroPlace = numeroPlace;
		this.classe = classe;
		this.prix = prix;
	}



	public Billet(Long id, int version, String numeroPlace, String classe, float prix) {
		this.id = id;
		this.version = version;
		this.numeroPlace = numeroPlace;
		this.classe = classe;
		this.prix = prix;
	}


	@Override
	public String toString() {
		return "Billet [id=" + id + ", version=" + version + ", numeroPlace=" + numeroPlace + ", classe=" + classe
				+ ", prix=" + prix + "]";
	}
	
	
}
