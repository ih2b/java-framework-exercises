import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import fr.esigelec.projetHibernate.dao.jdbc.PaysDAOJDBCImpl;
import fr.esigelec.projetHibernate.dto.Pays;
import fr.esigelec.projetHibernate.dto.Ville;

class testjdbc {

	@Test
	void testjdbc() {
		Pays p=new Pays();
		p.setId(5);
		PaysDAOJDBCImpl dao =new PaysDAOJDBCImpl();
		List<Ville> Vs = dao.getVilles(p);
		assertNull(Vs);
	}

}
