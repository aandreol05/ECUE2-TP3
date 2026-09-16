package net.lecnam.ecue2.tp3;

public class Point {
    double x;
    double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    };

    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj ;
        return Double.compare(point.x, x ) == 0 && Double.compare(point.y, y ) == 0 ;
    }

    @Override
    public String toString() {
        return "Point {x=" + x + ",y=" + y + "}";
    }

    public double retourneDistance(Point p){
        double x2MoinX1 = p.x - x;
        double y2MoinY1 = p.y - y;

        return Math.sqrt(x2MoinX1 * x2MoinX1 + y2MoinY1 * y2MoinY1);
    }
}
