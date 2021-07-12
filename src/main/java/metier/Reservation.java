package metier;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;


@Entity
@Table(name = "Reservation")
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Version
	private int version;
	private Integer numero;
	private Date dtReservation;
	private StatutReservation confirme;
	
	
	
	public Reservation() {
	}


	public Reservation(int version, Integer numero, Date dtReservation, boolean confirme) {
		this.version = version;
		this.numero = numero;
		this.dtReservation = dtReservation;
	}


	public Reservation(Long id, int version, Integer numero, Date dtReservation, boolean confirme) {
		this.id = id;
		this.version = version;
		this.numero = numero;
		this.dtReservation = dtReservation;
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
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Date getDtReservation() {
		return dtReservation;
	}
	public void setDtReservation(Date dtReservation) {
		this.dtReservation = dtReservation;
	}


	@Override
	public String toString() {
		return "Reservation [id=" + id + ", version=" + version + ", numero=" + numero + ", dtReservation="
				+ dtReservation + ", confirme=" + confirme + "]";
	}

	
	
}
