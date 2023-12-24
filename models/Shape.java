package models;

import java.util.ArrayList;
import java.util.List;

public class Shape {
    // container of Points (e.g. ArrayList<Point>)
    private List<Point> points;

    // addPoint(Point) - adds to the container
    public Shape() {
        this.points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    // calculatePerimeter()
    public double calculatePerimeter() {
        double perimeter = 0.0;
        int numPoints = points.size();

        for (int i = 0; i < numPoints; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % numPoints);

            perimeter += currentPoint.distanceTo(nextPoint);
        }

        return perimeter;
    }

    // getAverageSide()
    public double getAverageSide() {
        double totalDistance = calculatePerimeter();
        int numSides = points.size();
        return totalDistance / numSides;
    }

    // getLongestSide()
    public double getLongest() {
        double longest = 0.0;

        for (int i = 0; i < points.size(); i++) {
            for (int j = i + 1; j < points.size(); j++) {
                double distance = points.get(i).distanceTo(points.get(j));
                if (distance > longest) {
                    longest = distance;
                }
            }
        }

        return longest;
    }
}
