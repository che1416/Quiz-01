/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Che
 */
public class Calculadora {
   
    double resultado = 0.0;
 
 
    public double suma(double numero1,double numero2) 
    {
       resultado=numero1+numero2;
        return resultado;
    }
     public double resta(double numero1,double numero2)
      {
        resultado=numero1-numero2;
        return resultado;
      }
     public double dividir(double numero1,double numero2)
     {
         resultado=numero1/numero2;
       return   resultado;
     }
     public double multiplicar(double numero1,double numero2)
     {
         resultado=numero1*numero2;
         return resultado;
     }
    
}
