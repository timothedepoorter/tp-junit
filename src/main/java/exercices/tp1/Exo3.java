package exercices.tp1;

public class Exo3 {
    /**
     * Méthode privée qui vérifie qu'un nombre est positif
     * @param number int
     * @throws IllegalArgumentException exception
     */
    private void verifyIfNumberIsPositive(int number) throws IllegalArgumentException {
        if (number <= 0) {
            throw new IllegalArgumentException("Le nombre doit être positif");
        }
    }

    /**
     * Méthode privée qui vérifie qu'un nombre est composé de plus de 1 chiffre
     * @param number int
     * @throws IllegalArgumentException exception
     */
    private void verifyNumberMoreThan1Character(int number) throws IllegalArgumentException {
        if (number < 9) {
            throw new IllegalArgumentException("Le nombre doit contenir au moins deux chiffres");
        }
    }

    /**
     * Vérifie si un nombre est un palindrome
     * @param number int
     * @return - boolean - true si le nombre entré en paramètre est un palindrome, false sinon
     */
    public boolean isPalindrome(int number) {
        verifyIfNumberIsPositive(number);
        verifyNumberMoreThan1Character(number);

        int initNumber = number;
        int reversedNumber = 0;
        int numberModuloTen;

        while (number > 0) {
            numberModuloTen = number % 10;
            reversedNumber = (reversedNumber * 10) + numberModuloTen;
            number /= 10;
        }

        return reversedNumber == initNumber;
    }
}
