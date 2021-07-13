package app;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import irepository.IBilletRepository;
import irepository.IPassagerRepository;
import irepository.IReservationRepository;
import repository.BilletRepositoryJpa;
import repository.PassagerRepositoryJpa;
import repository.ReservationRepositoryJpa;

public class Application {
	
	private static Application instance = null;
	
	private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tpt_vol");

	private final IReservationRepository reservationRepo = new ReservationRepositoryJpa();
	private final IBilletRepository billetRepo = new BilletRepositoryJpa();
	private final IPassagerRepository passagerRepo = new PassagerRepositoryJpa();
	
	
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

	
	
	
}
