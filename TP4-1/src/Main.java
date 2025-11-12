public class Main {
public static void main(String[] args) {
BoiteAuxLettres boite = new BoiteAuxLettres();
boite.ajouterCourrier(new Lettre(150, ModeExpedition.NORMAL, "Tunis", FormatLettre.A4));
boite.ajouterCourrier(new Lettre(100, ModeExpedition.EXPRESS, "Tunis", FormatLettre.A3));
boite.ajouterCourrier(new Lettre(120, ModeExpedition.NORMAL, "Tunis", FormatLettre.A4));
boite.ajouterCourrier(new Colis(2000, ModeExpedition.EXPRESS, "Djerba", 30));
boite.ajouterCourrier(new Colis(3000, ModeExpedition.NORMAL, "Djerba", 40));
boite.ajouterCourrier(new Colis(2000, ModeExpedition.NORMAL, "", 30));
boite.ajouterCourrier(new Colis(1200, ModeExpedition.EXPRESS, "", 60));
boite.ajouterCourrier(new Publicite(100, ModeExpedition.NORMAL, "Djerba"));
boite.ajouterCourrier(new Publicite(200, ModeExpedition.NORMAL, ""));
boite.ajouterCourrier(new Publicite(110, ModeExpedition.EXPRESS, "Tunis"));
System.out.println("----------Contenu de la boîte----------");
boite.afficher();
}
}