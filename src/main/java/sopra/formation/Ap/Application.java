package sopra.formation.Ap;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import irepository.IBilletRepository;
import irepository.IClientRepository;
import irepository.ICompagnieAerienneVolRepository;
import irepository.IPassagerRepository;
import irepository.IReservationRepository;
import irepository.IVolRepository;
import repository.BilletRepositoryJpa;
import repository.PassagerRepositoryJpa;
import repository.ReservationRepositoryJpa;
import repository.VolRepositoryJpa;

public class Application {
	
	private static Application instance = null;
	
	private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tpt_vol");

	private final IReservationRepository reservationRepo = new ReservationRepositoryJpa();
	private final IBilletRepository billetRepo = new BilletRepositoryJpa();
	private final IPassagerRepository passagerRepo = new PassagerRepositoryJpa();
	
	private final IVolRepository volRepo = new VolRepositoryJpa();
	private final ICompagnieAerienneVolRepository compagnieAerienneRepo = new CompagnieAerienneVolRepositoryJpa();
	private final ICompagnieAerienneRepository compagnieAerienneRepo = new CompagnieAerienneRepositoryJpa();
	private final IAeroportRepository aeroportRepo = new AeroportRepositoryJpa();
	private final IVilleRepository villeRepo = new VilleRepositoryJpa();
	
	private final IClientRepository clientRepo = new ClientRepositoryJpa();
	private final IAdresseRepository adresseRepo = new AdresseRepositoryJpa();
	private final IParticulierRepository particulierRepo = new ParticulierRepositoryJpa();
	private final IEntrepriseRepository entrepriseRepo = new EntrepriseRepositoryJpa();
	
	private Application() {
	}
	
	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}
		return instance;
	}

	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public IReservationRepository getReservationRepo() {
		return reservationRepo;
	}

	public IBilletRepository getBilletRepo() {
		return billetRepo;
	}

	public IPassagerRepository getPassagerRepo() {
		return passagerRepo;
	}

	public IVolRepository getVolRepo() {
		return volRepo;
	}

	public ICompagnieAerienneVolRepository getCompagnieAerienneRepo() {
		return compagnieAerienneRepo;
	}

	public ICompagnieAerienneRepository getCompagnieAerienneRepo() {
		return compagnieAerienneRepo;
	}

	public IAeroportRepository getAeroportRepo() {
		return aeroportRepo;
	}

	public IVilleRepository getVilleRepo() {
		return villeRepo;
	}

	public IClientRepository getClientRepo() {
		return clientRepo;
	}

	public IAdresseRepository getAdresseRepo() {
		return adresseRepo;
	}

	public IParticulierRepository getParticulierRepo() {
		return particulierRepo;
	}

	public IEntrepriseRepository getEntrepriseRepo() {
		return entrepriseRepo;
	}

	
	
	
}
