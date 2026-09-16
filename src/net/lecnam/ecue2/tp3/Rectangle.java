package net.lecnam.ecue2.tp3;

public class Rectangle {

    double longeur;
    double largeur;
    Point origine ;

    public Rectangle(Point origine,double longeur, double largeur){
        this.origine = origine;
        this.longeur = longeur;
        this.largeur = largeur;
    }
    public Rectangle(double x, double y, double longeur, double largeur){
        this(new Point(x,y), longeur , largeur);
    }
}
