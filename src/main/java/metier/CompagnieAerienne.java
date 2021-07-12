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
	
}
