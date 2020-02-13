package fr.esigelec.projetSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestInjectionDependance5 {
	@SuppressWarnings("resource")
		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext5.xml");
			Salle salle1 = (Salle) context.getBean("salle1");
			System.out.println(salle1);


		}

	}

