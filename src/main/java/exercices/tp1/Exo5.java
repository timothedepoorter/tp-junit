package exercices.tp1;

import java.util.HashMap;

public class Exo5 {
    public final static HashMap<String, Integer> romansNumerals = new HashMap<String, Integer>() {{
        put("M", 1000);
        put("D", 500);
        put("C", 100);
        put("L", 50);
        put("X", 10);
        put("V", 5);
        put("I", 1);
    }};

    /**
     * Vérifie que la chaîne ne dépasse pas 15 caractères
     * @param romanNumber String
     * @throws IllegalArgumentException exception
     */
    private void RomanNumberLessThan15Characters(String romanNumber) throws IllegalArgumentException {
        if (romanNumber.length() > 14) {
            throw new IllegalArgumentException("Votre chiffre romain doit comporter moins de 15 caractères.");
        }
    }



    /**
     * Vérifie que le nombre ne comporte que des chiffres romains
     * @param romanNumber String
     * @throws IllegalArgumentException exception
     */
    private void isItARomanNumber(String romanNumber) throws IllegalArgumentException {
        char[] romanNumberArray = romanNumber.toCharArray();

        for (char romanChar : romanNumberArray) {
            if (romansNumerals.get(String.valueOf(romanChar)) == null) {
                throw new IllegalArgumentException("Ce n'est pas un chiffre romain.");
            }
        }
    }

    /**
     * Renvoie la chaîne de caractères en majuscule au cas où l'utilisateur l'aurait entré en minuscule
     * @param romanNumber String
     * @return String
     */
    private String capitalizeRomanNumber(String romanNumber) {
        return romanNumber.toUpperCase();
    }

    /**
     * Convertis un nombre romain en nombre arabe, ex : IX = 9
     * @param romanNumber String
     * @return int
     */
    public int convertRomanNumIntoArabicNum(String romanNumber) {
        RomanNumberLessThan15Characters(romanNumber);
        isItARomanNumber(romanNumber);
        romanNumber = capitalizeRomanNumber(romanNumber);

        int arabicNumber = 0;
        char[] romanNumberArray = romanNumber.toCharArray();
        char previous;
        int valuePrevious = 0;
        int valueCurrent;
        for (char romanChar : romanNumberArray) {
            valueCurrent = romansNumerals.get(String.valueOf(romanChar));

            if (valuePrevious < valueCurrent) { // cas particulier (IX, XC..)
                arabicNumber += valueCurrent - (valuePrevious * 2);
            } else {
                arabicNumber += valueCurrent;
            }
            previous = romanChar;
            valuePrevious = romansNumerals.get(String.valueOf(previous));
        }
        return arabicNumber;
    }
}
