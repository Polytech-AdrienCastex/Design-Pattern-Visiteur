package designpattern.visiteur;

public class Negation extends OperateurUnaire{
    public Negation(Noeud n) {
            super("-", n);
    }

    @Override
    public void accept(IVisiteur v)
    {
        v.visit(this);
    }

    @Override
    public int getPriorité()
    {
        return 0;
    }



}
