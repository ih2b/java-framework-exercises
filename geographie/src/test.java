import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import fr.esigelec.projetHibernate.dao.hibernate.PaysDAOImpl;
import fr.esigelec.projetHibernate.dao.hibernate.VilleDAOImpl;
import fr.esigelec.projetHibernate.dto.Pays;
import fr.esigelec.projetHibernate.dto.Ville;



class test {

	@Test
	void test() {
		Pays V=new Pays("frr",600000);
		V.setId(1);
		Ville vv = new Ville(1,"rouenn",10000);
		vv.setPays(V);
		vv.getNbHabitants();
		PaysDAOImpl dao=new PaysDAOImpl();
		VilleDAOImpl dao1=new VilleDAOImpl();
		dao.ajouter(V);
		dao1.ajouter(vv);
		V.setNom("fr");
		V.setSuperficie(500000);
		dao.update(V);
		vv.setNom("rouen");
		dao1.update(vv);
		Pays V1=new Pays("frr",600000);
		V1.setId(1);
		Ville vv1 = new Ville(1,"rouenn",10000);
		vv1.setPays(V1);
		dao.ajouter(V1);
		dao1.ajouter(vv1);
		V1.setId(1);
		vv1.setId(1);
		dao.delete(V1);
		dao1.delete(vv1);
	}

}
