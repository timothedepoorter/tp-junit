package exercices.tp1;

public class Exo1 {
    /** Méthode privée pour vérifier si un nombre est compris entre 0 inclus et 20 inclus
     * @param numbers int[]
     * @return boolean - true si les nombres sont entre 0 et 20, false sinon
     */
    private boolean verifyIfNumbersBetween0and20(int[] numbers) {
        for (int number : numbers) {
            if (number < 0 || number > 20) {
                return false;
            }
        }
        return true;
    }

    /** Méthode calculant la moyenne des valeurs d'un tableau d'entier
     * @param numbers int[]
     * @return int - la moyenne des valeurs du tableau d'entier passé en paramètre
     */
    public int calculateAverageOfNumbers(int[] numbers) {
        if (!verifyIfNumbersBetween0and20(numbers)) {
            return 0;
        }
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total / numbers.length;
    }
}
