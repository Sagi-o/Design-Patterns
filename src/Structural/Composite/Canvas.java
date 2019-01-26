package Structural.Composite;

import java.util.ArrayList;

public class Canvas implements Drawable {

    ArrayList<Shape> shapes;

    public Canvas() {
        shapes = new ArrayList<>();
    }

    public void addTriangle(String color) {
        Triangle t = new Triangle(color);
        shapes.add(t);
    }

    public void addCircle(String color) {
        Circle c = new Circle(color);
        shapes.add(c);
    }

    public void remove(Shape s) {
        shapes.remove(s);
    }

    @Override
    public void draw(String color) {
        for (Drawable s : shapes) {
            s.draw(color);
        }
        System.out.println();
    }

    public void print() {
        int c = 0;

        for (Shape s : shapes) {
            c++;
            System.out.println(c + ") Type: " + s.getType() + ", Color: " + s.getColor());
        }
    }
}
