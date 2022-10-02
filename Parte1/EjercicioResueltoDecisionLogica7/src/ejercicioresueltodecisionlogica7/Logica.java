/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioresueltodecisionlogica7;

public class Logica {
    public static String valorMayor(Double A, Double B){
        
        String resultado;
        if (A>B){
            resultado = "El valor Mayor es A = " + A.toString();
        }else{
            if(B>A){
                resultado = "El valor Mayor es B = " + B.toString();
            }else{
                resultado = "Los Valores Son Iguales";
            }
        }
        
        return resultado;
    }
}
