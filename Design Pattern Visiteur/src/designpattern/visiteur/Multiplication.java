package designpattern.visiteur;

public class Multiplication extends OperateurBinaire{

	public Multiplication( Noeud ng, Noeud nd) {
		super("*", ng, nd);
	}


    @Override
    public void accept(IVisiteur v)
    {
        v.visit(this);
    }

    @Override
    public int getPriorité()
    {
        return 5;
    }

}
