import javax.swing.*; // Import the Swing library for GUI components
import java.awt.event.ActionEvent; // Import the ActionEvent class for handling events
import java.awt.event.ActionListener; // Import the ActionListener interface for event listening

public class Main {
    public static void main(String[] args) {
        // Create a JFrame (main window)
        JFrame frame = new JFrame("Simple GUI Application"); // Initialize the JFrame with a title
        frame.setSize(400, 300); // Set the size of the window to 400x300 pixels
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the close operation to exit the application

        // Create a JPanel to hold components
        JPanel panel = new JPanel(); // Initialize the JPanel
        frame.add(panel); // Add the panel to the frame
        placeComponents(panel); // Call a method to place components on the panel

        // Set the frame to be visible
        frame.setVisible(true); // Make the window visible
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null); // Use absolute positioning for components

        // Create a label
        JLabel label = new JLabel("Enter text:"); // Create a label with the text "Enter text:"
        label.setBounds(10, 20, 80, 25); // Set the position and size of the label
        panel.add(label); // Add the label to the panel

        // Create a text field
        JTextField textField = new JTextField(20); // Create a text field with a width of 20 columns
        textField.setBounds(100, 20, 165, 25); // Set the position and size of the text field
        panel.add(textField); // Add the text field to the panel

        // Create a button
        JButton button = new JButton("Click Me"); // Create a button with the label "Click Me"
        button.setBounds(10, 80, 100, 25); // Set the position and size of the button
        panel.add(button); // Add the button to the panel

        // Create an action listener for the button
        button.addActionListener(new ActionListener() { // Add an ActionListener to the button
            @Override
            public void actionPerformed(ActionEvent e) { // Define what happens when the button is clicked
                // Display a message dialog
                String input = textField.getText(); // Get the text entered in the text field
                JOptionPane.showMessageDialog(panel, "You entered: " + input); // Show the entered text in a popup dialog
            }
        });
    }
}
