/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.devisbatiment;

/**
 *
 * @author rsow01
 */
public class Coin {
   int idCoin;
   double x;
   double y;

   
   public Coin(int idCoin, double x, double y){
       this.idCoin = idCoin;
       this.x = x;
       this.y = y;
       
       public String toString(){
           return this.idCoin +""+ this.x+""+this.y;
       }
       public static void main(){
           Coin = newCoin();
           System.out.println(Coin.toString());
       }
             public void getX (double x){
                 return x;
             }
             public void getY (double y){
                 return y;
             }
             public void setX (double x){
                 this.x = x;
             }
             public void setY (double y){
                 this.y = y;
                    
             }
             
             
   }

