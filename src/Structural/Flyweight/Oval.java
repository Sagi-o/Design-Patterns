package Structural.Flyweight;

public class Oval {

    // Intristic fields
    private boolean withBorder, withFill, withDots;

    private String ovalType;

    public Oval(OvalType type) {
        switch (type) {
            case WITH_DOTS:
                withDots = true;
                ovalType = "With Dots";
                break;
            case WITH_FILL:
                withFill = true;
                ovalType = "With Fill";
                break;
            case WITH_BORDER:
                withBorder = true;
                ovalType = "With Border";
                break;
            default:
                ovalType = "Undefined";
                break;
        }
    }

    public String getType() {
        return "Oval type is: " + ovalType;
    }
}
