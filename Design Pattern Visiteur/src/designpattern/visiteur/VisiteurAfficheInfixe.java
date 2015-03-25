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
public class VisiteurAfficheInfixe implements IVisiteur
{
    
    private boolean useBracket(Noeud parent, Noeud child)
    {
        return parent.getPriorité() > child.getPriorité();
    }
    private void showBracketOpen(Noeud parent, Noeud child)
    {
        if(useBracket(parent, child))
            System.out.print("(");
    }
    private void showBracketClose(Noeud parent, Noeud child)
    {
        if(useBracket(parent, child))
            System.out.print(")");
    }

    @Override
    public void visit(Addition addition)
    {
        showBracketOpen(addition, addition.getOpG());
        addition.getOpG().accept(this);
        showBracketClose(addition, addition.getOpG());
        
        System.out.print(addition.getOp());
        
        showBracketOpen(addition, addition.getOpD());
        addition.getOpD().accept(this);
        showBracketClose(addition, addition.getOpD());
    }

    @Override
    public void visit(Multiplication multiplication)
    {
        showBracketOpen(multiplication, multiplication.getOpG());
        multiplication.getOpG().accept(this);
        showBracketClose(multiplication, multiplication.getOpG());
        
        System.out.print(multiplication.getOp());
        
        showBracketOpen(multiplication, multiplication.getOpD());
        multiplication.getOpD().accept(this);
        showBracketClose(multiplication, multiplication.getOpD());
    }

    @Override
    public void visit(Negation negation)
    {
        System.out.print(negation.getOp());
        
        showBracketOpen(negation, negation.getOpG());
        negation.getOpG().accept(this);
        showBracketClose(negation, negation.getOpG());
    }

    @Override
    public void visit(Constante constante)
    {
        System.out.print(constante.getValeur());
    }
    
}
