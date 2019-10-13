package org.antislashn.communes.entities;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.antislashn.communes.Constantes;
import org.antislashn.communes.dao.CommuneDAO;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCommuneDAO {
	private static EntityManagerFactory emf = null;
	@Test
	public void testCommuneDAO() {
		CommuneDAO dao = new CommuneDAO(emf);
		assertNotNull(dao);
	}

	@Test
	public void testFindById() {
		CommuneDAO dao = new CommuneDAO(emf);
		Commune commune = dao.findById(1L);
		assertNotNull(commune);
	}
	
	@Test
	public void testGetByCodePostal() {
		CommuneDAO dao = new CommuneDAO(emf);
		List<Commune> communes = dao.getCommunesByCodePostal("354");
		assertNotNull(communes);
		assertTrue(communes.size()>0);
	}
	
	@Test
	public void testAllRegions() {
		CommuneDAO dao = new CommuneDAO(emf);
		List<String> regions = dao.getAllRegions();
		assertNotNull(regions);
		assertTrue(regions.size()==19);
	}
	
	@Test
	public void testAllDepartements() {
		CommuneDAO dao = new CommuneDAO(emf);
		List<Departement> departements = dao.getAllDepartement();
		assertNotNull(departements);
		assertTrue(departements.size()==109);
	}
	
	@Test
	public void testGetByDepartement() {
		CommuneDAO dao = new CommuneDAO(emf);
		List<Commune> communes = dao.getCommunesByDepartement("Ain");
		assertNotNull(communes);
		assertTrue(communes.size()>0);
		communes = dao.getCommunesByDepartement("ain");
		assertNotNull(communes);
		assertTrue(communes.size()>0);
	}
	
	@Test
	public void testGetByRegion() {
		CommuneDAO dao = new CommuneDAO(emf);
		List<Commune> communes = dao.getCommunesByRegion("bretagne");
		assertNotNull(communes);
		assertTrue(communes.size()>0);
		communes = dao.getCommunesByRegion("Bretagne");
		assertNotNull(communes);
		assertTrue(communes.size()>0);
	}
	@BeforeClass
	public static void before() {
		emf = Persistence.createEntityManagerFactory(Constantes.UNIT_NAME);
	}
	
	@AfterClass
	public static void after() {
		emf.close();
	}

}