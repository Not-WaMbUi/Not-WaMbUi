
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonDemo extends JFrame implements ActionListener {
    // Declare radio buttons
    JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
    ButtonGroup group;

    public RadioButtonDemo() {
        // Create the JFrame
        setTitle("RadioButtonDemo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Initialize radio buttons
        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        // Add action listeners to the buttons
        birdButton.addActionListener(this);
        catButton.addActionListener(this);
        dogButton.addActionListener(this);
        rabbitButton.addActionListener(this);
        pigButton.addActionListener(this);

        // Group the radio buttons
        group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        // Add radio buttons to the frame
        add(birdButton);
        add(catButton);
        add(dogButton);
        add(rabbitButton);
        add(pigButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Determine which button is selected and display the message
        if (e.getSource() == birdButton) {
            JOptionPane.showMessageDialog(this, "You selected: Bird");
        } else if (e.getSource() == catButton) {
            JOptionPane.showMessageDialog(this, "You selected: Cat");
        } else if (e.getSource() == dogButton) {
            JOptionPane.showMessageDialog(this, "You selected: Dog");
        } else if (e.getSource() == rabbitButton) {
            JOptionPane.showMessageDialog(this, "You selected: Rabbit");
        } else if (e.getSource() == pigButton) {
            JOptionPane.showMessageDialog(this, "You selected: Pig");
        }
    }

    public static void main(String[] args) {
        // Create an instance of the application
        new RadioButtonDemo();
    }
}
