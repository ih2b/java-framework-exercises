package fr.esigelec.garage;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class VoitureDAO {
    private static final Logger log = LogManager.getLogger(VoitureDAO.class.getName());
	
	public void ajouter(Voiture V){
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(V);
		session.getTransaction().commit();
		session.close();
		  log.debug("ajouter voiture");
		}

		public void supprimer(Voiture V){
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(V);
		session.getTransaction().commit();
		session.close();
		log.debug("supprimer voiture");
		}
	
		public Voiture getVoiture(int id){
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Voiture retour=(Voiture)session.get(Voiture.class, id);
		session.getTransaction().commit();
		session.close();
		log.debug("get voiture");
		return retour;
		}
		public void rouler(Voiture V, int distance) {
			V.setKm(V.getKm()+distance);
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.update(V);
			session.getTransaction().commit();
			session.close();
			log.debug("rouler voiture");
		}
		public List<Voiture> getVoitures(){
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			Query<Voiture> q=session.createQuery("from Voiture");
			List<Voiture> retour=q.getResultList();
			session.getTransaction().commit();
			session.close();
			log.debug("get les voitures");
			return retour;
			}

	
	
	
}