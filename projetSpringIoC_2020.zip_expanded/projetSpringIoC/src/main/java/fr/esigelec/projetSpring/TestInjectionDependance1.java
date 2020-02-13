package fr.esigelec.projetSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test SPRING IOC
 * 
 * @author serais s�bastien
 *
 */
public class TestInjectionDependance1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// chargement du fichier de context spring
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
		// r�cup�ration du bean e1
		Enseignant enseignant = (Enseignant) context.getBean("e1");
		System.out.println(enseignant);

		// r�cup�ration du bean e2
		Enseignant enseignant2 = (Enseignant) context.getBean("e2");
		System.out.println(enseignant2);

	}

}
