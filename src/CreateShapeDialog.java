import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateShapeDialog extends Dialog implements ActionListener {
    private TextField shapeTypeField, xField, yField, widthField, heightField, radiusField;
    private Button createButton;

    private String shapeType;
    private int x, y, width, height, radius;

    CreateShapeDialog(Frame parent, String title, boolean modal) {
        super(parent, title, modal);
        setSize(300, 200);
        setLayout(new GridLayout(7, 2));

        // Initialize components for entering parameters
        shapeTypeField = new TextField();
        xField = new TextField();
        yField = new TextField();
        widthField = new TextField();
        heightField = new TextField();
        radiusField = new TextField();

        // Add components for entering parameters
        add(new Label("Shape Type:"));
        add(shapeTypeField);

        add(new Label("X:"));
        add(xField);

        add(new Label("Y:"));
        add(yField);

        add(new Label("Width:"));
        add(widthField);

        add(new Label("Height:"));
        add(heightField);

        add(new Label("Radius:"));
        add(radiusField);

        // Add a button to create the shape
        createButton = new Button("Create Shape");
        add(createButton);

        createButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle button click to create the shape
        shapeType = shapeTypeField.getText();
        x = Integer.parseInt(xField.getText());
        y = Integer.parseInt(yField.getText());
        width = Integer.parseInt(widthField.getText());
        height = Integer.parseInt(heightField.getText());
        radius = Integer.parseInt(radiusField.getText());

        // Create the shape based on the entered parameters
        if ("Line".equalsIgnoreCase(shapeType)) {
            // Create Line using x, y, width, height
            // Instantiate Line and add it to your DrawComponent's list of figures
        } else if ("Rectangle".equalsIgnoreCase(shapeType)) {
            // Create Rectangle using x, y, width, height
            // Instantiate Rectangle and add it to your DrawComponent's list of figures
        } else if ("Circle".equalsIgnoreCase(shapeType)) {
            // Create Circle using x, y, radius
            // Instantiate Circle and add it to your DrawComponent's list of figures
        }

        setVisible(false);
    }
}
