package produit;

public abstract class Produit {
	private String nom;
	protected Unite unite;
	
	protected Produit(String nom, Unite gramme) {
		this.nom=nom;
		this.unite=gramme;
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public abstract String getDescription();
}
