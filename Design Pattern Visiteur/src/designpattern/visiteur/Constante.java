package designpattern.visiteur;

public class Constante implements Noeud{
	private int valeur;
	public Constante(int v){
		valeur = v;
	}
	public int getValeur(){return valeur;}
	


    @Override
    public void accept(IVisiteur v)
    {
        v.visit(this);
    }

    @Override
    public int getPriorité()
    {
        return 10;
    }

}
