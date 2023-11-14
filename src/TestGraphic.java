import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class TestGraphic extends Frame {

    private DrawComponent drawComponent;

    TestGraphic() {
        drawComponent = new DrawComponent();
        add(drawComponent); // Adding the DrawComponent to the TestGraphic frame
        setSize(400, 400);
        setVisible(true);

        // Exercise 5: Add a button to create shapes
        Button createShapeButton = new Button("Create Shape");
        createShapeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CreateShapeDialog dialog = new CreateShapeDialog(TestGraphic.this, "Create Shape", true);
                dialog.setVisible(true);
            }
        });
        add(createShapeButton, BorderLayout.SOUTH);
    }

    // Exercise 4
    void changeColor(Figure figure) {
        LinkedList<Color> colors = new LinkedList<>();
        colors.add(Color.black);
        colors.add(Color.blue);
        colors.add(Color.cyan);
        colors.add(Color.red);
        colors.add(Color.green);
        colors.add(Color.magenta);
        colors.add(Color.orange);
        colors.add(Color.yellow);

        int currentIndex = colors.indexOf(figure.getColor());
        int nextIndex = (currentIndex + 1) % colors.size();
        figure.setColor(colors.get(nextIndex));
        repaint();  // Add this line to update the display
    }

    public static void main(String[] args) {
        TestGraphic testGraphic = new TestGraphic();

        // Exercise 6
//        testGraphic.drawComponent.addMouseListener(new MouseAdapter() {
//
//            public void mouseClicked(MouseEvent e) {
//                for (Figure figure : testGraphic.drawComponent.getFigures()) {
//                    if (figure.contains(e.getX(), e.getY())) {
//                        testGraphic.changeColor(figure);
//                        break;
//                    }
//                }
//            }
//        });
    }
}
