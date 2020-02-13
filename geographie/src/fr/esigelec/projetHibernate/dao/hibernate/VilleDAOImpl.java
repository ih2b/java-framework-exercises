package fr.esigelec.projetHibernate.dao.hibernate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import fr.esigelec.projetHibernate.dao.IVilleDAO;
import fr.esigelec.projetHibernate.dto.Pays;
import fr.esigelec.projetHibernate.dto.Ville;
public class VilleDAOImpl implements IVilleDAO {

	@Override
	public void ajouter(Ville v) {
		Session session= HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(v);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Ville getVille(int id) {
		Session session= HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Ville retour=(Ville)session.get(Ville.class,id);
		session.getTransaction().commit();
		session.close();
		return retour;
	}

	@Override
	public List<Ville> getVilles() {
		Session session= HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query<Ville> q=session.createQuery("from ville");  
		List<Ville> retour=q.getResultList();
		session.getTransaction().commit();
		session.close();
		return retour;
	}

	@Override
	public void update(Ville v) {
		Session session= HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(v);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void delete(Ville v) {
		Session session= HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(v);
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public void refresh(Ville v) {
		Session session= HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.refresh(v);
		session.getTransaction().commit();
		session.close();
	}

}
