import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fr.esigelec.projetHibernate.dao.hibernate.PaysDAOImpl;
import fr.esigelec.projetHibernate.dto.Pays;

class testbidirectionnelle {

	@Test
	void test() {
		Pays p =new Pays();
		PaysDAOImpl dao=new PaysDAOImpl();
		p.setId(5);
		dao.getVilles(p);
		
	}

}
