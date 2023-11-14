import java.awt.*;
abstract class Figure {
    private Color color;

    Figure() {
        color = Color.black; // Default color
    }

    void setColor(Color c) {
        color = c;
    }

    abstract String getName();

    Color getColor() {
        return color;
    }

    abstract void draw(Graphics g);

    abstract boolean contains(int x, int y);
}