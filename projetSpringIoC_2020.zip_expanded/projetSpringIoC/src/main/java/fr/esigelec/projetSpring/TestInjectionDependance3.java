package fr.esigelec.projetSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test SPRING IOC avec autowiring par annotation (dans la classe Ecole3)
 * 
 * @author serais sébastien
 *
 */
public class TestInjectionDependance3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// chargement du fichier de context spring
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

		// récupération du bean idEcole
		Ecole3 e = (Ecole3) context.getBean("esigelec");
		System.out.println(e.getE1());
		System.out.println(e.getE2());
				
		System.out.println(e);
		
		//récupération du même bean, car singleton !
		Ecole3 e2 = (Ecole3) context.getBean("esigelec");
		System.out.println(e2);

	}

}
