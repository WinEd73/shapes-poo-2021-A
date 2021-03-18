package uaslp.ingenieria.labs.shapes;

import uaslp.ingenieria.labs.Shapex;

public class Circle extends Shapex {
    private int radio;

    public Circle(int radio) {
        this.radio = radio;
    }

    // Re-definir el método en una clase hija: SOBRE-ESCRITURA -> OVERWRITING
    // Sobrecarga = Overloading // polimorfismo
    // Polimorfismo: Enviar un mensaje a un objeto y que este responda de diferentes maneras
    public String getName() {
        return "Circle";
    }

    public int getRadio() {
        return radio;
    }

    public double getPerimeter() {
        return getRadio()*2*3.1416;
    }

    public double getArea() {
        return getRadio()*getRadio()*3.1416; }
}
