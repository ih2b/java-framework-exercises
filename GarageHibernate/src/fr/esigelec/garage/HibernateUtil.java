package fr.esigelec.garage;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
public class HibernateUtil {
private static SessionFactory sessionFactory = buildSessionFactory();
private static SessionFactory buildSessionFactory() {

final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
.configure() 
.build();
try {
sessionFactory = new MetadataSources( registry
).buildMetadata().buildSessionFactory();
}
catch (Exception e) {
e.printStackTrace();
StandardServiceRegistryBuilder.destroy( registry );
}
return sessionFactory;
}

public static SessionFactory getSessionFactory() {
return sessionFactory;
}
}