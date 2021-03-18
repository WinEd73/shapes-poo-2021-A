package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.shapes.*;
import uaslp.ingenieria.labs.shapes.triangles.IsoscelesTriangle;
import uaslp.ingenieria.labs.shapes.triangles.ScaleneTriangle;
import uaslp.ingenieria.labs.shapes.triangles.TriangleEquilatero;


import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Shapex> shapexes = new LinkedList<>();

        //shapexes.add(new Shapex());

        shapexes.add(new Circle(5));
        shapexes.add(new Rectangle(8, 3));
        shapexes.add(new Rectangle(14, 10));
        shapexes.add(new Square(10));
        shapexes.add(new TriangleEquilatero(6));
        shapexes.add(new IsoscelesTriangle(3,5,4));
        shapexes.add(new ScaleneTriangle(4,5,6));

        for (Shapex shapex : shapexes) {
            System.out.println("Name: " + shapex.getName());
            System.out.println("Sides count: " + shapex.getSidesCount());
            System.out.println("Perimeter: " + shapex.getPerimeter());
            System.out.println("Area: " + shapex.getArea());
            System.out.println("-----------------------------------------------");
        }


    }
}


