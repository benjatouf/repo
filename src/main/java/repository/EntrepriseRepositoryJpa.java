package repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import irepository.IEntrepriseRepository;
import metier.Entreprise;
import sopra.formation.Ap.Application;

public class EntrepriseRepositoryJpa implements IEntrepriseRepository {

	public List<Entreprise> findAll() {
		List<Entreprise> entreprises = new ArrayList<Entreprise>();

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEntityManagerFactory().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			TypedQuery<Entreprise> query = em.createQuery("select f from Entreprise f", Entreprise.class);

			entreprises = query.getResultList();

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

		return entreprises;
	}


	public Entreprise findById(Long id) {
		Entreprise entreprise = null;

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEntityManagerFactory().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			entreprise = em.find(Entreprise.class, id);

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

		return entreprise;
	}

	public Entreprise save(Entreprise obj) {
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEntityManagerFactory().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			obj = em.merge(obj);

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

		return obj;
	}


	public void delete(Entreprise obj) {
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEntityManagerFactory().createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			em.remove(em.merge(obj));

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
	}

}
