package fr.esigelec.projetHibernate.daoFactory;

import fr.esigelec.projetHibernate.dao.IPaysDAO;
import fr.esigelec.projetHibernate.daoFactory.impDaoFactory.payDaoJdbc;


public class DAOFactory {
    public static IPaysDAO createPaysDao () {
        return new payDaoJdbc (DB.openConnection());
    }

}
