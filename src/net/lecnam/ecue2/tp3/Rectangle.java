package net.lecnam.ecue2.tp3;

public class Rectangle {

    double longueur;
    double largeur;
    Point origine ;

    public Rectangle(Point origine,double longueur, double largeur){
        this.origine = origine;
        this.longueur = longueur;
        this.largeur = largeur;
    }
    public Rectangle(double x, double y, double longueur, double largeur){
        this(new Point(x,y), longueur , largeur);
    }

    public double retourneSurface() {
        return this.longueur * this.largeur ;
    }

    public void translate(double dx, double dy){
        this.origine.translate(dx,dy);
    }
}
