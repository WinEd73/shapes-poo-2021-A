package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;
import static java.lang.Math.sqrt;

public class ScaleneTriangle extends Triangle {

    private int side2;
    private int side3;
    private int side;

    public ScaleneTriangle(int side2, int side3, int side) {
        this.side2 = side2;
        this.side3 = side3;
        this.side = side;
    }


    public String getName() {
        return "Triangulo scalene";
    }

    public ScaleneTriangle(int side) {
        this.side2 = side2;
        this.side3 = side3;
    }
    public int getSidesCount() {
        return 3;
    }

    public double getPerimeter() {
        return getSide()+ getSide2()+getSide3();
    }

    public double getArea() { return sqrt(getPerimeter()/2*(getPerimeter()-getSide())*(getPerimeter()/2-getSide2())*(getPerimeter()/2-getSide3())); }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
