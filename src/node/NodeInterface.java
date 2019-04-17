package node;

public interface NodeInterface {
	
	// Cette méthode vérifie le type localement au Node
	// Par exemple NodeAssign vérifie que le type de la valeur
	// corresponde bien à la variable
	boolean checksType();
	
	// Cette méthode, non encore implémentée produit le code intermédiaire Exp ou Stm
	void generateIntermediateCode();
	
	// Crée un fichier <file>.dot
	// usage: dot -Tpng -o <file>.png <file>.dot
	public void toDot(String file);
	
	// Affiche sous forme parenthésée ce Node
	@Override
	String toString();
	
}
