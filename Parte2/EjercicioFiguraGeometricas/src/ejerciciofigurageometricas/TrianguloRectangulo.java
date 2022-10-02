package ejerciciofigurageometricas;

public class TrianguloRectangulo {

    public Double calcularAreas(Double base,  Double altura) {
        return ((base * altura) / 2);
    }

    public Double calcularPerimetro(Double base,  Double altura) {
        return (base + altura + calcularHipotenusa(base, altura));
    }

    public Double calcularHipotenusa(Double base,  Double altura) {
        return Math.sqrt(base*base + altura*altura);
    }

    public String determinarTipoTriangulo(Double base,  Double altura) {
        Double hipo = calcularHipotenusa(base, altura);
        if ((base == altura) && (base == hipo) && (altura == calcularHipotenusa(base, altura))) 
            return "Es un triángulo equilatero";
        else if ((base != altura) && (base != calcularHipotenusa(base, altura)) && (altura != calcularHipotenusa(base, altura)))
            return "Es un triangulo escaleno";
        else
            return "Es un triangulo isósceles";
        }
}
