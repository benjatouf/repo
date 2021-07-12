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


@Entity
@Table(name="Airport")
public class Aeroport {

	@Id
	@Column()
	private String code;
	@Column(name = "Name")
	private String nom;
	@ManyToOne
	@JoinColumn(name = "FlightCompany")
	private CompagnieAerienneVol compagnieAerienneVol;
	@ManyToMany
	@JoinTable(name = "situation", joinColumns = @JoinColumn(name = "airport_id"), inverseJoinColumns = @JoinColumn(name = "town_id"));
	private List<Aeroport> aeroports = new ArrayList<Aeroport>();
	

}
