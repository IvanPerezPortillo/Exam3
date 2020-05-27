/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam3;

import java.awt.Color;

/**
 *
 * @author user
 */
public abstract class Figura2D extends Figura {
    
    protected Color colorRelleno;

    public Figura2D(Color dins, Color c) {
        super(c);
        this.colorRelleno = dins;
    }



    public Color getColorRelleno() {
        return colorRelleno;
    }

    public void setColorDins(Color dins) {
        this.colorRelleno = dins;
    }
    
    @Override
    public abstract void Dibuixar();
    
    public abstract double area();
    
}