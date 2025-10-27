package br.com.alura.screenmatch.desafio;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    private double celsius;
    private double fahrenheit;
    public ConversorTemperaturaPadrao(double celsius, double fahrenheit){
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    @Override
    public void celsiusParaFahrenheit() {
        double celsiusemFahrenheit = (celsius * 9/5) + 32;
        System.out.println(String.format("%.1f°C em °F: %.1f°C", celsius, celsiusemFahrenheit));
    }

    @Override
    public void fahrenheitParaCelsius() {
        double fahrenheitemCelsius = (fahrenheit - 32) / 1.8;
        System.out.println(String.format("%.1f°F em °C é: %.1f°F", fahrenheit, fahrenheitemCelsius));
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
}
