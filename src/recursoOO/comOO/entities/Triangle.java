package recursoOO.comOO.entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateArea() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static String maxTriangle(double areaX, double areaY) {
        if (areaX > areaY) {
            return "Larger area: X";
        } else {
            return "Larger area: Y";
        }
    }

}
