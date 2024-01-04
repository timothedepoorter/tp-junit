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

    public void demenager(Adresse newAdresse) {
        this.identite.setAdresse(newAdresse);
    }

    public void travailler(int heures) {
        String phraseNom = "Le salarié " + this.identite.getPrenom() + " " + this.identite.getNom() + " ";
        String phraseHeuresTravail = heures + " heures ";
        String phraseSalaire = "et a perçu " + this.salaire.payer(heures) + " euros.";
        System.out.println(phraseNom + phraseHeuresTravail + phraseSalaire);
    }

    public void travailler() {
        this.travailler(151);
    }

    public void augmenter(double pourcentage) {
        this.salaire.setTauxHoraire(this.salaire.getTauxHoraire() * (1 + (pourcentage/100.0)));
    }
}
