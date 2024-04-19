package labJunit.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCompteBancaire {

	@Test
	void testDebiterSolde() throws Exception {
		CompteBancaire cb1 = new CompteBancaire(100);
		
		assertEquals(cb1.debiterSolde(50),50);
		assertEquals(cb1.solde,50);
		
		assertEquals(cb1.debiterSolde(70),-20);
		assertEquals(cb1.solde,-20);
	
	}
	
	
	@Test
	void testCrediterSolde() throws Exception {
		CompteBancaire cb1 = new CompteBancaire(100);
		
		assertEquals(cb1.crediterSolde(150),250);
		assertEquals(cb1.solde,250);
		
		assertEquals(cb1.crediterSolde(-50),200);
		assertEquals(cb1.solde,200);
	}

}
