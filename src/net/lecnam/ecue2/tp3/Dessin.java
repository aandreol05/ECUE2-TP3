package net.lecnam.ecue2.tp3;

public class Dessin {

    private static final int CAPACITE_MAX = 10;
    private Rectangle[] rectangles;
    private int nbRectangles;

    public Dessin() {
        this.rectangles = new Rectangle[CAPACITE_MAX];
        this.nbRectangles = 0;
    }

    public boolean ajout(Rectangle r){
        if (r == null || this.nbRectangles >= CAPACITE_MAX){
            return false;
        }
        this.rectangles[this.nbRectangles] = r;
        this.nbRectangles ++;
        return true ;
    }
}