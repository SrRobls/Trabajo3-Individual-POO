/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioresueltodecisionlogica10;

public class Logica {
    public static Double PagoMatricula(Double patrimonio, Integer estrato){
        Double pago = 50000.0;
        if (patrimonio > 2000000 & estrato > 3){
            pago += (patrimonio*3)/100;
        }
        
        return pago;
    }
}
