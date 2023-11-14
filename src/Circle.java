import java.awt.*;
class Circle extends Figure {
    private Point center;
    private int radius;

    Circle() {
        center = new Point(0, 0);
        radius = 0;
    }

    Circle(int x, int y, int r) {
        center = new Point(x, y);
        radius = r;
    }

    void setLocation(int x, int y) {
        center.setLocation(x, y);
    }

    void setRadius(int r) {
        radius = r;
    }

    Point getLocation() {
        return center;
    }

    int getRadius() {
        return radius;
    }

    @Override
    String getName() {
        return "Circle";
    }

    @Override
    void draw(Graphics g) {
        g.setColor(getColor());
        g.drawOval(center.x - radius, center.y - radius, radius * 2, radius * 2);
    }

    @Override
    boolean contains(int x, int y) {
        return Math.pow(x - center.x, 2) + Math.pow(y - center.y, 2) <= Math.pow(radius, 2);
    }
}