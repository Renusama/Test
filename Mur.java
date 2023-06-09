/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.devisbatiment;
import java.lang.Math;
/**
 *
 * @author rsow01
 */
public class Mur {
    int idMur;
    Coin debut;
    Coin C2;
    double hsp;

    public Mur(int idMur, Coin C1, Coin fin) {
        this.idMur = idMur;
        this.C1 = C1;
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "Mur{" + "idMur=" + idMur + ", C1=" + C1 + ", fin=" + fin + '}';
    }

    public Coin getC1() {
        return C1;
    }

    public Coin getfin() {
        return fin;
    }

    public void setC1(Coin C1) {
        this.C1 = C1;
    }

    public void setfin(Coin fin) {
        this.fin = fin;
    }
     public double longueur(Coin debut, Coin fin){
        return Math.sqrt(Math.pow((debut.getX()-fin.getX()),2)+Math.pow((debut.getY()-fin.getY(),2));
    }
     public double surface(Mur m){
         return hsp*m.longueur(debut,fin);
         
     }

    

    
    }
    
    

