package org.antislashn.communes.entities;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.antislashn.communes.Constantes;
import org.antislashn.communes.entities.Region;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRegionDB {
	private static EntityManagerFactory emf = null;
	@Test
	public void test() {
		EntityManager em = emf.createEntityManager();
		Region r = em.find(Region.class,"01");
		assertNotNull(r);
		em.close();
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
