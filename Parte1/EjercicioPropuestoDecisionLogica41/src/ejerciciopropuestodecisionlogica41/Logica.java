/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopropuestodecisionlogica41;
import java.util.List;

public class Logica {
    public static Double hallarMayor(List<Double> lista){
        Double mayor = lista.get(0);
        for (Double num : lista){
            if (num > mayor){
                mayor = num;
            }
        }
        return mayor;
    }
}
