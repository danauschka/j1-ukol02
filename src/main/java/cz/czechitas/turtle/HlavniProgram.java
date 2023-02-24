package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {
        zofka.setLocation(150.0,150.0);
        drawTriangle(100, Color.BLUE);

        zofka.setLocation(300.0,150.0);
        zofka.turnLeft(90);
        drawSquare(100, Color.GREEN);

        zofka.setLocation(450, 150);
        drawRectangle(50, 100, Color.MAGENTA);

        zofka.setLocation(650, 100);
        drawCircle(10, Color.YELLOW);
    }

    public void drawTriangle(double sideLength, Color barva) {
        zofka.setPenColor(barva);
        zofka.turnLeft(30);
        for (int i = 0; i < 3; i++) {
            zofka.move(sideLength);
            zofka.turnLeft(120.0);
        }
        zofka.turnRight(120);
    }

    public void drawSquare(double sideLength, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 4; i++) {
            zofka.move(sideLength);
            zofka.turnLeft(90);
        }
    }

    public void drawRectangle(double sideLengthA, double sideLengthB, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 2; i++) {
            zofka.move(sideLengthA);
            zofka.turnLeft(90);
            zofka.move(sideLengthB);
            zofka.turnLeft(90);
        }
    }

    public void drawCircle(double moveLength, Color barva) {
        zofka.setPenColor(barva);
        for (int i = 0; i < 36; i++) {
            zofka.move(moveLength);
            zofka.turnLeft(10);
        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
