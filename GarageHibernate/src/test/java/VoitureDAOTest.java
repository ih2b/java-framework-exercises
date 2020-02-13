package test.java;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Assertions;

import fr.esigelec.garage.VoitureDAO;
import org.junit.jupiter.api.Test;

import fr.esigelec.garage.Voiture;

class VoitureDAOTest {

	@Test
	public void testRemplir() {
	Voiture V=new Voiture(5,"100fr5215","219",130);
	VoitureDAO dao=new VoitureDAO();
	dao.ajouter(V);
	Assertions.assertEquals(V.getKm(), 130);
	Assertions.assertEquals(V.getImmatriculation(), "100fr5215");
	Assertions.assertEquals(V.getModele(), "219");
	}
	/*
	@Test
	public void testgetVoiture() {
	VoitureDAO dao=new VoitureDAO();
	Voiture V=dao.getVoiture(38);
	Assertions.assertNotNull(V);
	}
	@Test
	public void testrouler() {
	
	VoitureDAO dao=new VoitureDAO();
	Voiture V=dao.getVoiture(31);
	int A = V.getKm();
	dao.rouler(V, 4);
	Assertions.assertEquals(A+4, V.getKm());
	}
	@Test
	public void testgetVoitures() {
	VoitureDAO dao=new VoitureDAO();
	List<Voiture> VS;
	VS=dao.getVoitures();
	Assertions.assertNotNull(VS);
	}
	@Test
	public void testsupprimer() {
	VoitureDAO dao=new VoitureDAO();
	Voiture V=dao.getVoiture(39);
	dao.supprimer(V);
	Assertions.assertNull(dao.getVoiture(40));
	}*/
	
	
	
	
}
