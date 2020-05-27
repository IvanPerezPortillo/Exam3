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
public final class Cercle extends Figura2D {


    private Point centre;
    private int radi;

    public Cercle(Point centre, int radi, Color vora, Color dins) {
        super(vora, dins);
        this.centre = centre;
        this.radi = radi;
    }

    public Point getCentre() {
        return centre;
    }

    public int getRadi() {
        return radi;
    }


    @Override
    public void Dibuixar() {
        System.out.println("El nom de la clase es Cercle i te el color de les vores " + this.getColorVores() + " i te"
                + " de color de dins el " + this.getColorRelleno());
    }

    @Override
     public  double perimetre(){
         return 2*Math.PI*getRadi();
     }

    @Override
     public double area(){
         //System.out.println("Es l'area del Cercle");
         return Math.PI*Math.pow(getRadi(),2);
}
}