package Structural.Composite;

public class Shape implements Drawable {

    String color;
    String type;

    Shape(String color) {
        this.color = color;
    }

    @Override
    public void draw(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}
