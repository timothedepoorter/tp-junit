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
            if (plusProcheDeZero < 0) {
                if (Math.abs(plusProcheDeZero) == Math.abs(temperature)) {
                    plusProcheDeZero = temperature;
                }
            }
        }
        return plusProcheDeZero;
    }
}
