package exercices.tp2;

public class Salaire {
    private double tauxHoraire;

    public Salaire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    /**
     * Méthode calculant le salaire mensuel d'un salarié selon son nombre d'heures travaillées et son taux horaire
     * Cette méthode prend également en compte les heures supplémentaires à partir de 151h (taux horaire +25%)
     * @param heures int
     * @return double - salaire mensuel
     */
    public double payer(int heures) {
        double salaireMensuel;
        if (heures > 151) {
            int heuresSupp = heures - 151;
            salaireMensuel = ((heuresSupp * (tauxHoraire * 1.25)) + (151 * tauxHoraire));
        } else {
            salaireMensuel = heures * tauxHoraire;
        }
        return Math.round(salaireMensuel * 100.0) / 100.0;
    }
}
