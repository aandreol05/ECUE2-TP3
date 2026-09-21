package net.lecnam.ecue2.tp3;

public class Exec {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("  EXERCICES 11 & 13 : Tests de Dessin     ");
        System.out.println("==========================================");

        // Instanciation de l'objet Dessin
        Dessin dessin = new Dessin();

        // Création de quelques formes
        Rectangle r1 = new Rectangle(0, 0, 10, 5);  // Surface = 50
        Rectangle r2 = new Rectangle(2, 2, 4, 3);   // Surface = 12
        Carre c1 = new Carre(1, 1, 6);              // Surface = 36
        Carre c2 = new Carre(0, 0, 8);              // Surface = 64 (Plus grand carré)

        // Ajout des formes dans le dessin
        dessin.ajouterForme(r1);
        dessin.ajouterForme(r2);
        dessin.ajouterForme(c1);
        dessin.ajouterForme(c2);

        System.out.println("Nombre de formes dans le dessin : " + dessin.getNbFormes());
        System.out.println("Surface totale du dessin : " + dessin.surfaceTotale());

        // Affichage des plus grands rectangles et carrés
        Rectangle grandRect = dessin.retournePlusGrandRectangle();
        Carre grandCarre = dessin.retournePlusGrandCarre();

        System.out.println("\n--- Plus grand rectangle avant déplacement ---");
        if (grandRect != null) {
            System.out.println("Origine : " + grandRect.origine + " | Surface : " + grandRect.retourneSurface());
        }

        System.out.println("\n--- Plus grand carré avant déplacement ---");
        if (grandCarre != null) {
            System.out.println("Origine : " + grandCarre.origine + " | Surface : " + grandCarre.retourneSurface());
        }

        // Déplacement de l'ensemble des formes
        System.out.println("\n-> Déplacement de toutes les formes (+5, +10)...");
        dessin.translate(5, 10);

        // Affichage après déplacement
        grandRect = dessin.retournePlusGrandRectangle();
        grandCarre = dessin.retournePlusGrandCarre();

        System.out.println("\n--- Plus grand rectangle après déplacement ---");
        if (grandRect != null) {
            System.out.println("Origine : " + grandRect.origine + " | Surface : " + grandRect.retourneSurface());
        }

        System.out.println("\n--- Plus grand carré après déplacement ---");
        if (grandCarre != null) {
            System.out.println("Origine : " + grandCarre.origine + " | Surface : " + grandCarre.retourneSurface());
        }


        System.out.println("\n==========================================");
        System.out.println("  EXERCICE 14 : Rectangle.contient(Carre) ");
        System.out.println("==========================================");

        Rectangle grandRectangle = new Rectangle(0, 0, 20, 20);
        Carre petitCarreInterieur = new Carre(2, 2, 5);
        Carre carreQuiDepasse = new Carre(15, 15, 10);

        System.out.println("grandRectangle contient petitCarreInterieur ? "
                + grandRectangle.contient(petitCarreInterieur) + " (Attendu: true)");

        System.out.println("grandRectangle contient carreQuiDepasse ? "
                + grandRectangle.contient(carreQuiDepasse) + " (Attendu: false)");


        System.out.println("\n==========================================");
        System.out.println("  EXERCICE 15 : Carre.contient(Rectangle) ");
        System.out.println("==========================================");

        Carre grandCarreConteneur = new Carre(0, 0, 30);
        Rectangle petitRectInterieur = new Rectangle(5, 5, 10, 8);
        Rectangle rectQuiDepasse = new Rectangle(25, 25, 10, 10);

        System.out.println("grandCarreConteneur contient petitRectInterieur ? "
                + grandCarreConteneur.contient(petitRectInterieur) + " (Attendu: true)");

        System.out.println("grandCarreConteneur contient rectQuiDepasse ? "
                + grandCarreConteneur.contient(rectQuiDepasse) + " (Attendu: false)");
    }
}