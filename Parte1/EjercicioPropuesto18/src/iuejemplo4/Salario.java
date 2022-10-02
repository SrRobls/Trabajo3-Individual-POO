
package iuejemplo4;
public class Salario {
    public static double calcular_salarioBruto(double horas, double vhoras){
        Double salario_bruto;
        salario_bruto =  horas * vhoras;
        return salario_bruto;
    }
    
    public static double calcular_retenciomFuente(double horas, double vhoras, double porcentaje){
        Double dinero_retenido;
        dinero_retenido =  ((horas * vhoras)*porcentaje)/100;
        return dinero_retenido;
    }
    
    public static double calcular_salarioneto(double horas, double vhoras, double porcentaje){
        Double salario_neto;
        salario_neto =  (calcular_salarioBruto(horas, vhoras) - calcular_retenciomFuente(horas, vhoras, porcentaje));
        return salario_neto;
    }
}
