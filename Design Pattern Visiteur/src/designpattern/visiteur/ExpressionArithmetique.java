package designpattern.visiteur;

public class ExpressionArithmetique {
    private Noeud racine;

    public ExpressionArithmetique(Noeud racine){
            this.racine = racine;
    }

    public Noeud getRacine() {
            return racine;
    }

    public void afficherPostfixe()
    {
        racine.accept((IVisiteur)new VisiteurAffichePostfixe());
    }

    public void afficherInfixe()
    {
        racine.accept((IVisiteur)new VisiteurAfficheInfixe());
    }

    public int calcule()
    {
        VisiteurCalcul vc = new VisiteurCalcul();
        racine.accept((IVisiteur)vc);
        return vc.getResult();
    }

    public int calculeHauteur()
    {
        VisiteurHauteur vh = new VisiteurHauteur();
        racine.accept((IVisiteur)vh);
        return vh.getHauteur();
    }

    void afficherPréfixe()
    {
        racine.accept((IVisiteur)new VisiteurAffichePréfixe());
    }



	
}
