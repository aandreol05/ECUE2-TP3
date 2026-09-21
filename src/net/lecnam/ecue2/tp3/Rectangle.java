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

    public boolean contient(Point p3){
        double xMin = this.origine.x;
        double xMax = this.origine.x + this.longueur;
        double yMin = this.origine.y;
        double yMax = this.origine.y + this.largeur;

        return (p3.x >= xMin && p3.x <= xMax) && (p3.y >= yMin && p3.y <= yMax);
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle rectangle = (Rectangle) obj ;
        return (Double.compare(rectangle.longueur, longueur) == 0 &&
                Double.compare(rectangle.largeur, largeur) == 0 &&
                rectangle.origine.equals(this.origine));
    }

    public boolean contient(Carre c) {
        if (c == null) return false;

        double xMinRect = this.origine.x;
        double xMaxRect = this.origine.x + this.longueur;
        double yMinRect = this.origine.y;
        double yMaxRect = this.origine.y + this.largeur;

        double xMinCarre = c.origine.x;
        double xMaxCarre = c.origine.x + c.cote;
        double yMinCarre = c.origine.y;
        double yMaxCarre = c.origine.y + c.cote;

        return (xMinCarre >= xMinRect && xMaxCarre <= xMaxRect) &&
                (yMinCarre >= yMinRect && yMaxCarre <= yMaxRect);
    }
}
