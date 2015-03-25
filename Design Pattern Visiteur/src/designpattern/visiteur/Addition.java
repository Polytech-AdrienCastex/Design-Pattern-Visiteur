package designpattern.visiteur;

public class Addition extends OperateurBinaire{
	public Addition(Noeud ng, Noeud nd) {
		super("+", ng, nd);
	}



    @Override
    public void accept(IVisiteur v)
    {
        v.visit(this);
    }

    @Override
    public int getPriorité()
    {
        return 2;
    }

}
