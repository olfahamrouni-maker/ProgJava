enum ModeExpedition {
    NORMAL,
    EXPRESS
}

enum FormatLettre {
    A4,
    A3
}

public class Courrier {
	protected double poids; // en grammes
    protected ModeExpedition mode;
    protected String adresse;

    public Courrier(double poids, ModeExpedition mode, String adresse) {
        this.poids = poids;
        this.mode = mode;
        this.adresse = adresse;
    }

    public boolean estInvalide() {
        return adresse == null || adresse.isEmpty();
    }

    public double affranchir() {
        return 0;
    }
}
