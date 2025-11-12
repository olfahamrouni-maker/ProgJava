
public class Colis extends Courrier {
    private double volume; // en litres

    public Colis(double poids, ModeExpedition mode, String adresse, double volume) {
        super(poids, mode, adresse);
        this.volume = volume;
    }

    @Override
    public boolean estInvalide() {
        return super.estInvalide() || volume > 50;
    }

    @Override
    public double affranchir() {
        if (estInvalide()) return 0;
        double montant = 0.25 * volume + poids;
        if (mode == ModeExpedition.EXPRESS) 
        	montant *= 2;
        return montant;
    }

    @Override
    public String toString() {
        return "Colis (" + volume + " L) [" + mode + "] - " + poids + " g - Dest: " +
        		adresse +
                " - Affranchissement: " + String.format("%.2f DT", affranchir()) +
                (estInvalide() ? " -> INVALIDE" : "");
    }
}