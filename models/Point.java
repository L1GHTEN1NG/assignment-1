package models;

public class Point {
    private double x;
    private double y;

    // constructor having both parameters
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // distance(Point dest) - distance from current point to the dest point
    public double distanceTo(Point dest) {
        return Math.sqrt(Math.pow(this.x - dest.x, 2) + Math.pow(this.y - dest.y, 2));
    }

    // toString
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
