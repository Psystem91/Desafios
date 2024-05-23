public class Main {
    public static void main(String[] args) {
        //int gradosCelsius = 23;
        double gradosCelsius = 24;
        //double gradosFahrenheit = (int) (gradosCelsius * 1.8) + 32;
        double gradosFahrenheit = (gradosCelsius * 1.8) + 32;

        String mensaje = String.format("La temperatura de %.1f Celsius equivale a %.1f Fahrenheit", gradosCelsius, gradosFahrenheit);
        System.out.println(mensaje);
    }
}