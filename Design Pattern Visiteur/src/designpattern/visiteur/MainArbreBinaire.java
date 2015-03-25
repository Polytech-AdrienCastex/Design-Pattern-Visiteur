package designpattern.visiteur;

public class MainArbreBinaire {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//faire 1+2*3+-4=3
		/*Addition racine = new Addition(new Addition(new Constante(1),
					new Multiplication(new Constante(2),new Constante(3))),
					new Negation(new Constante(4)));
		Multiplication racine = new Multiplication(new Addition(new Constante(1),
					new Addition(new Constante(2),new Constante(3))),
					new Negation(new Constante(4)));*/
		Multiplication racine = new Multiplication(new Constante(7), new Addition(new Constante(2), new Constante(50)));
		ExpressionArithmetique exp = new ExpressionArithmetique(racine);
		System.out.println("\n infixe:");
		exp.afficherInfixe();
	
		System.out.println("\n postfixe:");
		exp.afficherPostfixe();
		System.out.println("\n calcul: " + exp.calcule());
		System.out.println("\n calculH: " + exp.calculeHauteur());
		
		

	}

}
