
public class Lettre extends Courrier {
    private FormatLettre format;

    public Lettre(double poids, ModeExpedition mode, String adresse, 
    		FormatLettre format) {
        super(poids, mode, adresse);
        this.format = format;
    }

    @Override
    public boolean estInvalide() {
        return super.estInvalide();
    }

    @Override
    public double affranchir() {
        if (estInvalide()) return 0;
        double tarifBase = format == FormatLettre.A4 ? 2.5 : 3.5;
        double montant = tarifBase + poids;
        if (mode == ModeExpedition.EXPRESS) 
        	montant *= 2;
        return montant;
    }

    @Override
    public String toString() {
        return "Lettre (" + format + ") [" + mode + "] - " + poids + " g - Dest: " +
                adresse + " - Affranchissement: " + String.format("%.2f DT", affranchir()) +
                (estInvalide() ? " -> INVALIDE" : "");
    }
}