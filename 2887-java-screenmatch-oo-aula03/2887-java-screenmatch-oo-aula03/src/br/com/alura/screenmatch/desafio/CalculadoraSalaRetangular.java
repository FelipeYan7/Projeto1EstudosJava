package br.com.alura.screenmatch.desafio;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    private double area;
    private double perimetro;
    @Override
    public void calcularArea(double altura, double largura){
        setArea(altura * largura);
        System.out.println(String.format("A area é de: %.2fcm²", area));
    }
    @Override
    public void calcularPerimetro(double altura, double largura){
        perimetro = 2 * (altura + largura);
        System.out.println(String.format("O perímetro da figura é de: %.2fcm", perimetro));
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
