public class Conversao {

    public double celsiusFahrenheit(double temperatura) {
        return (9 * temperatura / 5) + 32;
    }

    public double fahrenheitCelsius(double temperatura) {
        return (temperatura - 32) * 5 / 9;
    }

    public double celsiusKelvin(double temperatura) {
        return temperatura + 273.15;
    }

    public double kelvinCelsius(double temperatura) {
        return temperatura - 273.15;
    }

    public double celsiusReaumur(double temperatura) {
        return temperatura * 4 / 5;
    }

    public double reaumurCelsius(double temperatura) {
        return temperatura * 5 / 4;
    }

    public double kelvinRankine(double temperatura) {
        return temperatura * 1.8;
    }

    public double rankineKelvin(double temperatura) {
        return temperatura / 1.8;
    }
}
