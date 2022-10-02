/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopropuestodecisionlogica;

public class Logica {
    public static String salario(String nombre, Double valorHora, Integer horas){
        String resultado;
        if (valorHora * horas > 450000){
            resultado = String.format("El empleado %s tiene un salario mensual de $%.2f", nombre, valorHora * horas);
        }else{
            resultado = String.format("El empleado %s recibe un salario mensual inferior  $450.000", nombre);
        }
        return resultado;
    };
}
