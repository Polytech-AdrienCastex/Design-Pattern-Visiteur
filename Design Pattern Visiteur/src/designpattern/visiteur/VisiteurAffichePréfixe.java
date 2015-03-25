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
public class VisiteurAffichePréfixe implements IVisiteur
{

    @Override
    public void visit(Addition addition)
    {
        System.out.print(addition.getOp());
        addition.getOpG().accept(this);
        addition.getOpD().accept(this);
    }

    @Override
    public void visit(Multiplication multiplication)
    {
        System.out.print(multiplication.getOp());
        multiplication.getOpG().accept(this);
        multiplication.getOpD().accept(this);
    }

    @Override
    public void visit(Negation negation)
    {
        System.out.print(negation.getOp());
        negation.getOpG().accept(this);
    }

    @Override
    public void visit(Constante constante)
    {
        System.out.print(constante.getValeur());
    }
    
}
