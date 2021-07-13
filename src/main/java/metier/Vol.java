package metier;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name = "Flight")
public class Vol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Version
	private int version;
	@Column(name = "dtDeparture")
	@Temporal(TemporalType.DATE)
	private Date dtDepart;
	@Column(name = "dtArrival")
	private String dtArrivee;
<<<<<<< HEAD
	@Column(name = "Flight Status")
=======
	@Column(name = "Flight Statut")
>>>>>>> Xavier
	private StatutVol statut;
	@Column(name = "Available seats")
	private int nbPlaceDispo;
	@ManyToOne
	@JoinColumn(name = "FlightCompany")
	private CompagnieAerienneVol compagnieAerienneVol;
	@ManyToOne
	@JoinColumn(name = "Ticket")
	private Billet billet;
	@Column(name="arrival")
	private Aeroport arrivee;
	@Column(name="departure")
	private Aeroport depart;
	
	public Vol(Long id, int version, Date dtDepart, String dtArrivee, StatutVol statut, int nbPlaceDispo,
			CompagnieAerienneVol compagnieAerienneVol, Billet billet) {
		this.id = id;
		this.version = version;
		this.dtDepart = dtDepart;
		this.dtArrivee = dtArrivee;
		this.statut = statut;
		this.nbPlaceDispo = nbPlaceDispo;
		this.compagnieAerienneVol = compagnieAerienneVol;
		this.billet = billet;
	}

	public Vol(int version, Date dtDepart, String dtArrivee, StatutVol statut, int nbPlaceDispo,
			CompagnieAerienneVol compagnieAerienneVol, Billet billet) {
		this.version = version;
		this.dtDepart = dtDepart;
		this.dtArrivee = dtArrivee;
		this.statut = statut;
		this.nbPlaceDispo = nbPlaceDispo;
		this.compagnieAerienneVol = compagnieAerienneVol;
		this.billet = billet;
	}

	
	public Vol() {
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


	public Date getDtDepart() {
		return dtDepart;
	}


	public void setDtDepart(Date dtDepart) {
		this.dtDepart = dtDepart;
	}


	public String getDtArrivee() {
		return dtArrivee;
	}


	public void setDtArrivee(String dtArrivee) {
		this.dtArrivee = dtArrivee;
	}


	public StatutVol getStatut() {
		return statut;
	}


	public void setStatut(StatutVol statut) {
		this.statut = statut;
	}


	public int getNbPlaceDispo() {
		return nbPlaceDispo;
	}


	public void setNbPlaceDispo(int nbPlaceDispo) {
		this.nbPlaceDispo = nbPlaceDispo;
	}

	public CompagnieAerienneVol getCompagnieAerienneVol() {
		return compagnieAerienneVol;
	}

	public void setCompagnieAerienneVol(CompagnieAerienneVol compagnieAerienneVol) {
		this.compagnieAerienneVol = compagnieAerienneVol;
	}

	public Billet getBillet() {
		return billet;
	}

	public void setBillet(Billet billet) {
		this.billet = billet;
	}

	@Override
	public String toString() {
		return "Vol [id=" + id + ", version=" + version + ", dtDepart=" + dtDepart + ", dtArrivee=" + dtArrivee
				+ ", nbPlaceDispo=" + nbPlaceDispo + ", compagnieAerienneVol=" + compagnieAerienneVol + "]";
	}
	


	
	
	
}
