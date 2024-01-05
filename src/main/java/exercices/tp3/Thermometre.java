package exercices.tp3;

public class Thermometre {

    private void siTropDeTemperatures(int[] temperatures) throws IllegalArgumentException {
        if (temperatures.length > 10000) {
            throw new IllegalArgumentException("Vous ne pouvez pas entrer plus de 10 000 températures.");
        }
    }

    public int donneTemperature(int[] temperatures) {
        siTropDeTemperatures(temperatures);
        int plusProcheDeZero;
        if (temperatures.length == 0) {
            plusProcheDeZero = 0;
        } else {
            plusProcheDeZero = temperatures[0];
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
        }
        return plusProcheDeZero;
    }
}
