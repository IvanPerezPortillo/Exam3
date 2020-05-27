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
public class Linea extends Figura {

    private Point x;
    private Point y;

    public Linea(Point x, Point y, Color c) {
        super(c);
        this.x = x;
        this.y = y;
    }

    public Point getX() {
        return x;
    }

    public Point getY() {
        return y;
    }

    @Override
    public void Dibuixar() {
        System.out.println("El nom de la clase es Linea i te el color de les vores " + this.getColorVores() + ".");
    }

    @Override
    public double perimetre() {
     //System.out.println("El perimetro de la linea"); 
     return Math.sqrt(Math.pow((getX().x- getY().x),2)+Math.pow((getX().y- getY().y),2));
    }

}