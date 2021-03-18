package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;

import static java.lang.Math.sqrt;

public class TriangleEquilatero extends Triangle {
    private int side;

    public String getName() {
        return "Triangulo Equilatero";
    }

    public TriangleEquilatero(int side) {
        this.side = side;
    }
    public int getSidesCount() {
        return 3;
    }

    public double getPerimeter() {
        return side*3;
    }

    public double getArea() { return (sqrt(3)/4)*side*side; }
}