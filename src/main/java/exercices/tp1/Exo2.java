package exercices.tp1;

public class Exo2 {
    public static final float TVA = 20;

    /**
     * Méthode privée qui vérifie si un nombre est positif
     * @param number float
     * @throws IllegalArgumentException exception
     */
    private void verifyIfNumberIsPositive(float number) throws IllegalArgumentException {
        if (number <= 0) {
            throw new IllegalArgumentException("Le nombre doit être positif");
        }
    }

    /**
     * Calcule le prix TTC
     * @param number float
     * @return float - le prix TTC d'un paramètre number
     */
    public float calculateTtcPrice(float number) {
        verifyIfNumberIsPositive(number);

        return number*(1+(TVA/100));
    }
}
