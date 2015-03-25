/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package designpattern.visiteur;

/**
 *
 * @author p1002239
 */
public class VisiteurHauteur implements IVisiteur
{
    private int hauteur;
    public int getHauteur()
    {
        return hauteur;
    }

    @Override
    public void visit(Addition addition)
    {
        addition.getOpG().accept(this);
        int hg = hauteur;
        addition.getOpD().accept(this);
        
        hauteur = 1 + Math.max(hg, hauteur);
    }

    @Override
    public void visit(Multiplication multiplication)
    {
        multiplication.getOpG().accept(this);
        int hg = hauteur;
        multiplication.getOpD().accept(this);
        
        hauteur = 1 + Math.max(hg, hauteur);
    }

    @Override
    public void visit(Negation negation)
    {
        negation.getOpG().accept(this);
        
        hauteur += 1;
    }

    @Override
    public void visit(Constante constante)
    {
        hauteur = 1;
    }
    
}
