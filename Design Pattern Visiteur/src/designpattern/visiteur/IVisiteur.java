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
public interface IVisiteur
{
    void visit(Addition addition);
    void visit(Multiplication multiplication);
    void visit(Negation negation);
    void visit(Constante constante);
}
