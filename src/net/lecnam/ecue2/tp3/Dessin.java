package net.lecnam.ecue2.tp3;

public class Dessin {

    private static final int CAPACITE_MAX = 10;
    private Object[] formes;
    private int nbFormes;

    public Dessin() {
        this.formes = new Object[CAPACITE_MAX];
        this.nbFormes = 0;
    }

    public boolean ajouterForme(Object forme) {
        if (forme == null || this.nbFormes >= CAPACITE_MAX) {
            return false;
        }
        if (forme instanceof Rectangle || forme instanceof Carre) {
            this.formes[this.nbFormes] = forme;
            this.nbFormes++;
            return true;
        }
        return false;
    }

    public double surfaceTotale() {
        double total = 0.0;
        for (int i = 0; i < this.nbFormes; i++) {
            Object obj = this.formes[i];
            if (obj instanceof Rectangle) {
                total += ((Rectangle) obj).retourneSurface();
            } else if (obj instanceof Carre) {
                total += ((Carre) obj).retourneSurface();
            }
        }
        return total;
    }

    public void translate(double dx, double dy) {
        for (int i = 0; i < this.nbFormes; i++) {
            Object obj = this.formes[i];
            if (obj instanceof Rectangle) {
                ((Rectangle) obj).translate(dx, dy);
            } else if (obj instanceof Carre) {
                ((Carre) obj).translate(dx, dy);
            }
        }
    }

    public Rectangle retournePlusGrandRectangle() {
        Rectangle plusGrand = null;
        for (int i = 0; i < this.nbFormes; i++) {
            if (this.formes[i] instanceof Rectangle) {
                Rectangle r = (Rectangle) this.formes[i];
                if (plusGrand == null || r.retourneSurface() > plusGrand.retourneSurface()) {
                    plusGrand = r;
                }
            }
        }
        return plusGrand;
    }

    public Carre retournePlusGrandCarre() {
        Carre plusGrand = null;
        for (int i = 0; i < this.nbFormes; i++) {
            if (this.formes[i] instanceof Carre) {
                Carre c = (Carre) this.formes[i];
                if (plusGrand == null || c.retourneSurface() > plusGrand.retourneSurface()) {
                    plusGrand = c;
                }
            }
        }
        return plusGrand;
    }

    public Object[] getFormes() {
        return this.formes;
    }

    public int getNbFormes() {
        return this.nbFormes;
    }
}