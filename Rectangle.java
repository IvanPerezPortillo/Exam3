package Exam3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author user
 */
public final class Rectangle extends Figura2D {

   //public Rectangle(Point infEsq, Point supDret, Color vora, Color dins)

    private Point infEsq;
    private Point supDret;

    public Rectangle(Point infEsq, Point supDret, Color vora, Color dins) {
        super(vora, dins);
        this.infEsq = infEsq;
        this.supDret = supDret;
    }

    @Override
    public void Dibuixar() {
        System.out.println("El nom de la clase es Rectangle i te el color de les vores " + this.getColorVores() + " i te"
                + " de color de dins el " + this.getColorRelleno());
    }

    @Override
    public double perimetre() {
        //System.out.println("Perimetre de Rectangle");
        double base = supDret.getX()- infEsq.getX();
        double altura = supDret.getY()-infEsq.getY();
        return 2*(base*altura);
    }


    @Override
    public double area() {
        //System.out.println("Es l'area del Rectangle");
        double base = supDret.getX()- infEsq.getX();
        double altura = supDret.getY()-infEsq.getY();
        return  base*altura;

    }

}