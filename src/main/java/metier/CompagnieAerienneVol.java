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
@Table(name = "Flight Company")
public class CompagnieAerienneVol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	@Version
	private int version;
	@Column(name = "Flight Number")
	private String numeroVol;
	@OneToMany(mappedBy = "compagnieAerienneVol")
	private List<CompagnieAerienne> compagnies = new ArrayList<CompagnieAerienne>();
	@OneToMany(mappedBy = "compagnieAerienneVol")
	private List<Vol> vols = new ArrayList<Vol>();
	
	
	public CompagnieAerienneVol(Long id, int version, String numeroVol, List<CompagnieAerienne> compagnies,
			List<Vol> vols) {
		this.id = id;
		this.version = version;
		this.numeroVol = numeroVol;
		this.compagnies = compagnies;
		this.vols = vols;
	}
	

	public CompagnieAerienneVol( int version, String numeroVol, List<CompagnieAerienne> compagnies,
			List<Vol> vols) {
		this.version = version;
		this.numeroVol = numeroVol;
		this.compagnies = compagnies;
		this.vols = vols;
	}
	
	public CompagnieAerienneVol(String numeroVol, List<CompagnieAerienne> compagnies,
			List<Vol> vols) {
		this.numeroVol = numeroVol;
		this.compagnies = compagnies;
		this.vols = vols;
	}
	
	public CompagnieAerienneVol(){
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


	public String getNumeroVol() {
		return numeroVol;
	}


	public void setNumeroVol(String numeroVol) {
		this.numeroVol = numeroVol;
	}


	public List<CompagnieAerienne> getCompagnies() {
		return compagnies;
	}


	public void setCompagnies(List<CompagnieAerienne> compagnies) {
		this.compagnies = compagnies;
	}


	public List<Vol> getVols() {
		return vols;
	}


	public void setVols(List<Vol> vols) {
		this.vols = vols;
	}


	@Override
	public String toString() {
		return "CompagnieAerienneVol [id=" + id + ", version=" + version + ", numeroVol=" + numeroVol + ", compagnies="
				+ compagnies + ", vols=" + vols + "]";
	}



}
