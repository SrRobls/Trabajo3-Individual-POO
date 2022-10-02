/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopropuestodecisionlogica23;

public class Logica {
    public static String hallarEcuacion(Double A, Double B, Double C){
        Double comprobar = Math.pow(B, 2) -4*A*C;
        String resultado;

        if (comprobar >= 0){
            // Para esto aplicamos la formula del estudiante XD
            Double x1 = (-B + Math.sqrt(Math.pow(B, 2) - 4*A*C)) / (2*A);
            Double x2 = (-B - Math.sqrt(Math.pow(B, 2) - 4*A*C)) / (2*A);
            resultado = String.format("X1 = %f, X2 = %f", x1, x2);
        }else{
            resultado = String.format("No se puede hacer el calculo.");
        }
        return resultado;
    };
}
