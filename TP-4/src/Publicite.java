
public class Publicite extends Courrier {

    public Publicite(double poids, ModeExpedition mode, String adresse) {
        super(poids, mode, adresse);
    }

    @Override
    public boolean estInvalide() {
        return super.estInvalide();
    }

    @Override
    public double affranchir() {
        if (estInvalide()) 
			return 0;
        double montant = 5.0 * poids;
        if (mode == ModeExpedition.EXPRESS) 
        	montant *= 2;
        return montant;
    }

    @Override
    public String toString() {
        return "Publicité [" + mode + "] - " + 
				poids + " g - Dest: " +
                adresse +
                " - Affranchissement: " + 
				String.format("%.2f DT", affranchir()) +
                (estInvalide() ? " -> INVALIDE" : "");
    }
	
}