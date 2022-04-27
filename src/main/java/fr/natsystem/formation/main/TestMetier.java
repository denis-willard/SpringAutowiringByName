package fr.natsystem.formation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.natsystem.formation.bean.Metier;

public class TestMetier {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Metier metier = context.getBean("metier", Metier.class);
		metier.presenterMetier();
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
