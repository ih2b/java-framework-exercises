package fr.esigelec.projetSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test SPRING IOC avec autowiring par annotation (dans la classe Ecole4) - autodetection des beans avec les annotations
 * 
 * @author serais sébastien
 *
 */
public class TestInjectionDependance4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// chargement du fichier de context spring
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.xml");

		// récupération du bean idEcole 
		Ecole4 e = (Ecole4) context.getBean("esigelec");
		System.out.println(e.getE1());
		System.out.println(e.getE2());

	}

}
