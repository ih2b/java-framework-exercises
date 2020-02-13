package fr.esigelec.projetSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInjectionDependance7 {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext6.xml");

		// r�cup�ration du bean idEcole 
		Directeur D = (Directeur) context.getBean("Directeur1");

	}
}
