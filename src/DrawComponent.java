import java.awt.*;
import java.util.LinkedList;

class DrawComponent extends Component {
    private LinkedList<Figure> figures;

    DrawComponent() {
        figures = new LinkedList<>();
        // Add circles and rectangle as specified
        figures.add(new Circle(200, 200, 100));
        figures.add(new Circle(160, 150, 20));
        figures.add(new Circle(240, 150, 20));
        figures.add(new Rectangle(new Point(150, 220), 100, 40));
    }

    public LinkedList<Figure> getFigures() {
        return figures;
    }

    @Override
    public void paint(Graphics g) {
        for (Figure figure : figures) {
            figure.draw(g);
        }
    }
}
