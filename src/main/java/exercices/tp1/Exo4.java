package exercices.tp1;

import java.util.HashMap;

public class Exo4 {
    /**
     * Vérifie qu'un tableau d'entier ne contienne pas de doublon
     * @param numbers int[]
     * @return boolean - true s'il y a  un doublon, false sinon
     */
    public boolean checkIfDoublon(int[] numbers) {
        HashMap<Integer, Integer> NumbersHashMap = new HashMap<>();
        for (int number : numbers) {
            if (NumbersHashMap.containsKey(number)) {
                NumbersHashMap.put(number, 0);
            } else {
                NumbersHashMap.put(number, 1);
            }
        }
        return NumbersHashMap.containsValue(0);
    }
}
