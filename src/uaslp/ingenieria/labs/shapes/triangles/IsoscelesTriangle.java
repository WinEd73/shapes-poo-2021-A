package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.shapes.Triangle;


public class IsoscelesTriangle extends Triangle {

    private int base;
    private int height;
    private int side;

    public IsoscelesTriangle(int base, int height, int side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }


    public String getName() {
        return "Triangulo Isosceles";
    }

    public IsoscelesTriangle(int side) {
        this.base = base;
        this.height = height;
    }
    public int getSidesCount() {
        return 3;
    }

    public double getPerimeter() {
        return 2*getSide()+getBase();
    }

    public double getArea() { return (getBase()*getHeight())/2; }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
