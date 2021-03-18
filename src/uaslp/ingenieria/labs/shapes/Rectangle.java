package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shapex;

public class Rectangle extends Shapex {

    private int base;
    private int height;


    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public String getName() {
        return "Rectangle";
    }

    public int getSidesCount() {
        return 4;
    }

    public double getPerimeter() {
        return getBase()*2+getHeight()*2;
    }

    public double getArea() {
        return getBase()*getHeight();
    }

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
}
