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
public class VisiteurAffichePostfixe implements IVisiteur
{

    @Override
    public void visit(Addition addition)
    {
        addition.getOpG().accept(this);
        addition.getOpD().accept(this);
        System.out.print(addition.getOp());
    }

    @Override
    public void visit(Multiplication multiplication)
    {
        multiplication.getOpG().accept(this);
        multiplication.getOpD().accept(this);
        System.out.print(multiplication.getOp());
    }

    @Override
    public void visit(Negation negation)
    {
        negation.getOpG().accept(this);
        System.out.print(negation.getOp());
    }

    @Override
    public void visit(Constante constante)
    {
        System.out.print(constante.getValeur());
    }
    
}
