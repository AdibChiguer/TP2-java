import java.awt.*;

class Rectangle extends Figure {
    private Point position;
    private int width, height;

    Rectangle() {
        position = new Point(0, 0);
        width = 0;
        height = 0;
    }

    Rectangle(Point pos, int w, int h) {
        position = pos;
        width = w;
        height = h;
    }

    void setLocation(int x, int y) {
        position.setLocation(x, y);
    }

    void setDimension(int w, int h) {
        width = w;
        height = h;
    }

    Point getLocation() {
        return position;
    }

    int getWidth() {
        return width;
    }

    int getHeight() {
        return height;
    }

    @Override
    String getName() {
        return "Rectangle";
    }

    @Override
    void draw(Graphics g) {
        g.setColor(getColor());
        g.drawRect(position.x, position.y, width, height);
    }

    @Override
    boolean contains(int x, int y) {
        // Implementing circle containment logic for simplicity
        return Math.pow(x - (position.x + width / 2), 2) + Math.pow(y - (position.y + height / 2), 2)
                <= Math.pow(Math.min(width, height) / 2, 2);
    }
}
