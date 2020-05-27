/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam3;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author user
 */
public class main {
    public static void main(String[] args) {
        
        Linea l=new Linea(new Point(3, 2), new Point(0,9), Color.red);
        l.Dibuixar();
        
        Cercle c=new Cercle(new Point(4,2),20, Color.gray, Color.pink);
        c.Dibuixar();
        
        Rectangle r=new Rectangle(new Point(0,2),new Point(3, 9), Color.gray, Color.pink);
        r.Dibuixar();
        
        System.out.println("El perimetre de la linea es " + l.perimetre());
        
        System.out.println("El perimetre del rectangle es " + r.perimetre());
        System.out.println("El area del rectangle es " + r.area());
        
        System.out.println("El perimetre del cercle es " + c.perimetre());
        System.out.println("El area del cercle es " + c.area());
    }
    
}