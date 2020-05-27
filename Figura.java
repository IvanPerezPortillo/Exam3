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
public abstract class Figura {

    protected Color colorVores;

    public Figura(Color c) {
        this.colorVores = c;
    }

    public Color getColorVores() {
        return colorVores;
    }

    public void setColorVores(Color colorVores) {
        this.colorVores = colorVores;
    }

    public abstract void Dibuixar();// no se implementa en la clase padre

    public abstract double perimetre();

}