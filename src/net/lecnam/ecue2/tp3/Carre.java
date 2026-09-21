package net.lecnam.ecue2.tp3;

public class Carre {
    double cote;
    Point origine ;

    public Carre(Point origine,double cote){
        this.origine = origine;
        this.cote = cote;
    }

    public Carre(double x, double y, double cote){
        this(new Point(x,y), cote);
    }
}
