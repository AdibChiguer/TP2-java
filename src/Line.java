import java.awt.*;

class Line extends Figure {
    private Point ext1, ext2;

    Line() {
        ext1 = new Point(0, 0);
        ext2 = new Point(0, 0);
    }

    Line(int x1, int y1, int x2, int y2) {
        ext1 = new Point(x1, y1);
        ext2 = new Point(x2, y2);
    }

    void setExtremity1(int x, int y) {
        ext1.setLocation(x, y);
    }

    void setExtremity2(int x, int y) {
        ext2.setLocation(x, y);
    }

    @Override
    String getName() {
        return "Line";
    }

    @Override
    void draw(Graphics g) {
        g.setColor(getColor());
        g.drawLine(ext1.x, ext1.y, ext2.x, ext2.y);
    }

    @Override
    boolean contains(int x, int y) {
        // For simplicity, returning false
        return false;
    }
}
