package net.lecnam.ecue2.tp3;

public class Exec {

    public static void main(String[] args) {

        System.out.println("=== EXERCICE 1 : Tests de la classe Point ===");

        Point p1 = new Point(3, 7);
        Point p2 = new Point(5, 4);
        Point p3 = new Point(3, 7);

        System.out.println("Affichage p1 : " + p1);
        System.out.println("Affichage p2 : " + p2);

        // Test de equals
        System.out.println("p1.equals(p2) (devrait être false) : " + p1.equals(p2));
        System.out.println("p1.equals(p3) (devrait être true)  : " + p1.equals(p3));

        // Test de la distance
        double distance = p1.retourneDistance(p2);
        System.out.println("Distance entre p1 et p2 : " + distance);

        // Test de la translation
        p1.translate(2, -1);
        System.out.println("p1 après translation (+2, -1) : " + p1);


        System.out.println("\n=== EXERCICE 2 : Tests de la classe Rectangle ===");

        Rectangle r1 = new Rectangle(new Point(0, 0), 10, 5);
        Rectangle r2 = new Rectangle(0, 0, 10, 5); // 2ème constructeur
        Rectangle r3 = new Rectangle(2, 2, 4, 3);

        // Test de la surface
        System.out.println("Surface de r1 (10x5) : " + r1.retourneSurface());

        // Test de equals
        System.out.println("r1.equals(r2) (devrait être true)  : " + r1.equals(r2));
        System.out.println("r1.equals(r3) (devrait être false) : " + r1.equals(r3));

        // Test de la méthode contient(Point)
        Point pInterieur = new Point(3, 3);
        Point pExterieur = new Point(12, 8);
        System.out.println("r1 contient (3,3) (devrait être true)  : " + r1.contient(pInterieur));
        System.out.println("r1 contient (12,8) (devrait être false) : " + r1.contient(pExterieur));

        // Test de la translation d'un rectangle
        r3.translate(1, 1);
        System.out.println("r3 origine après translation (+1, +1) : " + r3.origine);

        System.out.println("\n=== EXERCICE 3 : Tests de la classe Dessin ===");

        Dessin dessin = new Dessin();

        // Remplissage du dessin (ajout de 10 rectangles)
        for (int i = 0; i < 10; i++) {
            boolean ajoutReussi = dessin.ajout(new Rectangle(i, i, 2, 2));
            System.out.println("Ajout rectangle " + (i + 1) + " : " + ajoutReussi);
        }

        // Test de dépassement de capacité (11ème rectangle)
        boolean ajoutEnTrop = dessin.ajout(new Rectangle(0, 0, 1, 1));
        System.out.println("Ajout d'un 11ème rectangle (devrait être false) : " + ajoutEnTrop);

        // Test de la surface totale (10 rectangles de 2x2 = 10 * 4 = 40)
        System.out.println("Surface totale du dessin : " + dessin.surfaceTotale());

        }
}