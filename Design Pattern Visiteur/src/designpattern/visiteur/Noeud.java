package designpattern.visiteur;

public interface Noeud {
    
    int getPriorité();
    void accept(IVisiteur v);
    
}
