package repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import irepository.IReservationRepository;
import metier.Reservation;
import sopra.formation.Application;

public class ReservationRepositoryJpa implements IReservationRepository{

	@Override
	public List<Reservation> findAll() {
		
		List<Reservation> reservations = new ArrayList<Reservation>();

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEntityManagerFactory().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			TypedQuery<Reservation> query = em.createQuery("select r from Reservation r", Reservation.class);

			reservations = query.getResultList();

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}

		} finally {
			if (em != null) {
				em.close();
			}
		}

		return reservations;
		
		
		
		
		
		return null;
	}

	@Override
	public Reservation findById(Long id) {
		return null;
	}

	@Override
	public Reservation save(Reservation obj) {
		return null;
	}

	@Override
	public void delete(Reservation obj) {
	
	}

}
