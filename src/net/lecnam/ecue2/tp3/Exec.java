package net.lecnam.ecue2.tp3;

public class Exec {

    public static void main(String[] args) {

        // 1. Instancier un objet Dessin
        Dessin dessin = new Dessin();

        // 2. Ajouter plusieurs rectangles
        dessin.ajout(new Rectangle(0, 0, 10, 5));
        dessin.ajout(new Rectangle(2, 3, 4, 4));
        dessin.ajout(new Rectangle(1, 1, 12, 6));

        // 3. Afficher la surface totale des rectangles
        System.out.println("Surface totale des rectangles : " + dessin.surfaceTotale());

        // 4. Afficher les informations du plus grand rectangle
        Rectangle plusGrand = dessin.retournePlusGrandRectangle();
        System.out.println("\n--- Plus grand rectangle avant déplacement ---");
        if (plusGrand != null) {
            System.out.println("Origine  : " + plusGrand.origine);
            System.out.println("Longueur : " + plusGrand.longueur);
            System.out.println("Largeur  : " + plusGrand.largeur);
            System.out.println("Surface  : " + plusGrand.retourneSurface());
        }

        // 5. Déplacer les rectangles
        dessin.translate(5, 10);
        System.out.println("\n-> Déplacement de tous les rectangles de (+5, +10)...");

        // 6. Afficher les informations du plus grand rectangle après déplacement
        plusGrand = dessin.retournePlusGrandRectangle();
        System.out.println("\n--- Plus grand rectangle après déplacement ---");
        if (plusGrand != null) {
            System.out.println("Origine  : " + plusGrand.origine);
            System.out.println("Longueur : " + plusGrand.longueur);
            System.out.println("Largeur  : " + plusGrand.largeur);
            System.out.println("Surface  : " + plusGrand.retourneSurface());
        }
    }
}