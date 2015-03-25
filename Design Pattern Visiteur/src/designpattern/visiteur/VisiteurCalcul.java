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
public class VisiteurCalcul implements IVisiteur
{
    private int valeur;
    public int getResult()
    {
        return valeur;
    }

    @Override
    public void visit(Addition addition)
    {
        addition.getOpG().accept(this);
        int vg = valeur;
        addition.getOpD().accept(this);
        
        valeur += vg;
    }

    @Override
    public void visit(Multiplication multiplication)
    {
        multiplication.getOpG().accept(this);
        int vg = valeur;
        multiplication.getOpD().accept(this);
        
        valeur *= vg;
    }

    @Override
    public void visit(Negation negation)
    {
        negation.getOpG().accept(this);
        valeur *= -1;
    }

    @Override
    public void visit(Constante constante)
    {
        valeur = constante.getValeur();
    }
    
}
