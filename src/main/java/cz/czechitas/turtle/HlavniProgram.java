package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {
        zofka.setLocation(150.0, 150.0);
        drawTriangle(100, Color.BLUE);

        zofka.setLocation(300.0, 150.0);
        zofka.turnLeft(90);
        drawSquare(100, Color.GREEN);

        zofka.setLocation(450, 150);
        drawRectangle(50, 100, Color.MAGENTA);

        zofka.setLocation(650, 100);
        drawCircle(10, Color.YELLOW);

        drawIceCream(10, 100, Color.RED);

        drawSnowman(6, 10, 3, 3, 15, Color.BLUE);

        drawTrain(250, 150, 140, 250, 13, 6, 6, 100, Color.DARK_GRAY);
    }

    public void drawTriangle(double sideLength, Color color) {
        zofka.setPenColor(color);
        zofka.turnLeft(30);
        for (int i = 0; i < 3; i++) {
            zofka.move(sideLength);
            zofka.turnLeft(120.0);
        }
        zofka.turnRight(120);
    }

    public void drawSquare(double sideLength, Color color) {
        zofka.setPenColor(color);
        for (int i = 0; i < 4; i++) {
            zofka.move(sideLength);
            zofka.turnLeft(90);
        }
    }

    public void drawRectangle(double sideLengthA, double sideLengthB, Color color) {
        zofka.setPenColor(color);
        for (int i = 0; i < 2; i++) {
            zofka.move(sideLengthA);
            zofka.turnLeft(90);
            zofka.move(sideLengthB);
            zofka.turnLeft(90);
        }
    }

    public void drawCircle(double moveLength, Color color) {
        zofka.setPenColor(color);
        for (int i = 0; i < 36; i++) {
            zofka.move(moveLength);
            zofka.turnLeft(10);
        }
    }

    public void drawIceCream(double moveLength, double sideLengthA, Color color) {
        zofka.setLocation(200.0, 350.0);
        drawCircle(moveLength, color);
        zofka.setLocation(190.0, 370.0);
        zofka.turnLeft(60);
        drawTriangle(sideLengthA, color);
        zofka.turnLeft(30);
    }

    public void drawSnowman(double circle1, double circle2, double circle3, double circle4, double circle5, Color color) {
        zofka.setLocation(500.0, 300.0);
        drawCircle(circle1, color);
        zofka.setLocation(525.0, 400.0);
        drawCircle(circle2, color);
        zofka.setLocation(560.0, 400.0);
        drawCircle(circle3, color);
        zofka.setLocation(410.0, 400.0);
        drawCircle(circle4, color);
        zofka.setLocation(550.0, 550.0);
        drawCircle(circle5, color);
    }

    public void drawIsoscelesTriangle(double sideLength) {
        var hypotenuse = Math.sqrt(2 * Math.pow(sideLength, 2));
        zofka.turnLeft(45);
        zofka.move(sideLength);
        zofka.turnLeft(90);
        zofka.move(sideLength);
        zofka.turnLeft(135);
        zofka.move(hypotenuse);
    }

    public void drawTrain(double sideLengthA1, double sideLengthB1, double sideLengthA2, double sideLengthB2, double circle1, double circle2, double circle3, double sideLength, Color color) {
        zofka.setLocation(1400.0, 500.0);
        drawRectangle(sideLengthA1, sideLengthB1, color);
        zofka.setLocation(1250.0, 500.0);
        drawRectangle(sideLengthA2, sideLengthB2, color);
        zofka.setLocation(1400.0, 500.0);
        drawCircle(circle1, color);
        zofka.setLocation(1200.0, 540.0);
        drawCircle(circle2, color);
        zofka.setLocation(1100.0, 540.0);
        drawCircle(circle3, color);
        zofka.setLocation(900.0, 540.0);
        zofka.turnRight(135);
        drawIsoscelesTriangle(sideLength);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
