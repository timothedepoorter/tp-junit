package exercices.tp2;

public abstract class Salarie {
    private Salaire salaire;
    private Identite identite;

    public Salarie(Salaire salaire, Identite identite) {
        this.salaire = salaire;
        this.identite = identite;
    }

    public Salaire getSalaire() {
        return salaire;
    }

    public void setSalaire(Salaire salaire) {
        this.salaire = salaire;
    }

    public Identite getIdentite() {
        return identite;
    }

    public void setIdentite(Identite identite) {
        this.identite = identite;
    }

    /**
     * Méthode permettant de modifier l'adresse du salarié
     * @param newAdresse Adresse
     */
    public void demenager(Adresse newAdresse) {
        this.identite.setAdresse(newAdresse);
    }

    /**
     * Méthode affichant en console une description du salaire du salarié selon son temps de travail passé en paramètre.
     * @param heures int
     */
    public void travailler(int heures) {
        String phraseNom = "Le salarié " + this.identite.getPrenom() + " " + this.identite.getNom() + " ";
        String phraseHeuresTravail = heures + " heures ";
        String phraseSalaire = "et a perçu " + this.salaire.payer(heures) + " euros.";
        System.out.println(phraseNom + phraseHeuresTravail + phraseSalaire);
    }

    /**
     * Surcharge de la méthode travailler(int heures) sans aucun paramètre.
     * Sans paramètre, la méthode s'exécute avec comme valeur par défaut pour heures : 151.
     */
    public void travailler() {
        this.travailler(151);
    }

    /**
     * Méthode permettant d'augmenter le salaire du salarié selon un pourcentage passé en paramètre.
     * @param pourcentage double
     */
    public void augmenter(double pourcentage) {
        this.salaire.setTauxHoraire(this.salaire.getTauxHoraire() * (1 + (pourcentage/100.0)));
    }
}
