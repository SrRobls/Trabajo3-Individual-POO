/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iuejemplo3;

public class Triangulo {
    public static Double calcular_perimetro(Double lado){
        Double resultado = lado*3;
        return resultado;
    }
    
    public static Double calcular_area(Double lado){
        Double resultado = (lado*Math.sqrt(3))/2;
        return resultado;
    }
    
    public static Double calcular_altura(Double lado){
        Double resultado = (Math.pow(lado, 2)*Math.sqrt(3))/4;
        return resultado;
    }
}
