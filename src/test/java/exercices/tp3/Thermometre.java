package exercices.tp3;

public class Thermometre {
    public int donneTemperature(int[] temperatures) {
        if (temperatures.length == 0) {
            return 0;
        }
        int plusProcheDeZero = temperatures[0];
        for (int temperature : temperatures) {
            if (Math.abs(temperature) < Math.abs(plusProcheDeZero)) {
                plusProcheDeZero = temperature;
            }
        }
        return plusProcheDeZero;
    }
}
