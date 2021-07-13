package metier;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;


@Entity
@Table(name="Airport")
public class Aeroport {

	@Id
	@Column()
	private String code;
	@Version
	private int version;
	@Column(name = "Name")
	private String nom;
	@ManyToOne
	@JoinColumn(name = "FlightCompany")
	private CompagnieAerienneVol compagnieAerienneVol;
	@ManyToMany
	@JoinTable(name = "situation", joinColumns = @JoinColumn(name = "airport_id"), inverseJoinColumns = @JoinColumn(name = "town_id"))
	private List<Aeroport> aeroports = new ArrayList<Aeroport>();

	
	
	public Aeroport(String code, int version, String nom, CompagnieAerienneVol compagnieAerienneVol,
			List<Aeroport> aeroports) {
		this.code = code;
		this.version = version;
		this.nom = nom;
		this.compagnieAerienneVol = compagnieAerienneVol;
		this.aeroports = aeroports;
	}

	public Aeroport(String code, String nom, CompagnieAerienneVol compagnieAerienneVol, List<Aeroport> aeroports) {
		this.code = code;
		this.nom = nom;
		this.compagnieAerienneVol = compagnieAerienneVol;
		this.aeroports = aeroports;
	}
	
	public Aeroport(String nom, CompagnieAerienneVol compagnieAerienneVol, List<Aeroport> aeroports) {
		this.nom = nom;
		this.compagnieAerienneVol = compagnieAerienneVol;
		this.aeroports = aeroports;
	}
	
	public Aeroport() {
		
	}
	
	public Aeroport(int version, String nom, CompagnieAerienneVol compagnieAerienneVol,
			List<Aeroport> aeroports) {
		this.version = version;
		this.nom = nom;
		this.compagnieAerienneVol = compagnieAerienneVol;
		this.aeroports = aeroports;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public CompagnieAerienneVol getCompagnieAerienneVol() {
		return compagnieAerienneVol;
	}

	public void setCompagnieAerienneVol(CompagnieAerienneVol compagnieAerienneVol) {
		this.compagnieAerienneVol = compagnieAerienneVol;
	}

	public List<Aeroport> getAeroports() {
		return aeroports;
	}

	public void setAeroports(List<Aeroport> aeroports) {
		this.aeroports = aeroports;
	}

	@Override
	public String toString() {
		return "Aeroport [code=" + code + ", version=" + version + ", nom=" + nom + ", compagnieAerienneVol="
				+ compagnieAerienneVol + ", aeroports=" + aeroports + "]";
	}
	
	
}



