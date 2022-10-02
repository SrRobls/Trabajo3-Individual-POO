/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciofigurageometricas;

public class EjercicioFiguraGeometricas {

    public static void main(String[] args) {
        Formulario formulario = new Formulario();
        formulario.setVisible(true); 
    }
    
    public static void abrirICirculo(){
            InterfazCirculo ICirculo = new InterfazCirculo();
            ICirculo.setVisible(true);
    }
    
    public static void abrirICuadrado(){
            InterfazCuadrado ICuadrado = new InterfazCuadrado();
            ICuadrado.setVisible(true);
    }
    
    public static void abrirIRectangulo(){
            InterfazRectangulo IRectangulo = new InterfazRectangulo();
            IRectangulo.setVisible(true);
    }
    
    public static void abrirITrianguloRectangulo(){
            InterfazTrianguloRectangulo ITrianguloRectangulo = new InterfazTrianguloRectangulo();
            ITrianguloRectangulo.setVisible(true);
    }
    
}
