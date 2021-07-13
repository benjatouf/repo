package metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "Company")
public class CompagnieAerienne {
	
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
	
	public CompagnieAerienne(String code, int version, String nom, CompagnieAerienneVol compagnieAerienneVol) {
		this.code = code;
		this.version = version;
		this.nom = nom;
		this.compagnieAerienneVol = compagnieAerienneVol;
	}
	
	
	public CompagnieAerienne( int version, String nom, CompagnieAerienneVol compagnieAerienneVol) {
		
		this.version = version;
		this.nom = nom;
		this.compagnieAerienneVol = compagnieAerienneVol;
	}
	
	public CompagnieAerienne( String nom, CompagnieAerienneVol compagnieAerienneVol) {
		
		this.nom = nom;
		this.compagnieAerienneVol = compagnieAerienneVol;
	}
	
	public CompagnieAerienne() {
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


	@Override
	public String toString() {
		return "CompagnieAerienne [code=" + code + ", version=" + version + ", nom=" + nom + ", compagnieAerienneVol="
				+ compagnieAerienneVol + "]";
	}
	
	
	
}
