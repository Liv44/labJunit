package labJunit.app;

public class CompteBancaire {

	double solde;
	
	public CompteBancaire(double s) {
		solde = s;
	}
	
	public double debiterSolde(double montant) {
		solde = solde - montant;
		return solde;
	}
	
	public double crediterSolde (double montant)  {
		solde = solde + montant;
		return solde;
	}
	
}
