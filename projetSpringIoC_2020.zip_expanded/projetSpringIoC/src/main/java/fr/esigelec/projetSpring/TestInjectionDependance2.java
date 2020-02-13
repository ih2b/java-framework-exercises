package fr.esigelec.projetSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test SPRING IOC - avec autowiring dans le fichier XML
 * 
 * @author serais sébastien
 *
 */
public class TestInjectionDependance2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// chargement du fichier de context spring
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

		// récupération du bean idEcole
		Ecole2 e = (Ecole2) context.getBean("esigelec");
		// affichage des 2 enseignants de l'ecole
		System.out.println(e.getE1());
		System.out.println(e.getE2());

	}

}
