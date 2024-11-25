

# Java GUI Tutorial for Students

## Introduction
This tutorial is designed to help you create a simple Java GUI application using IntelliJ IDEA. By the end of this guide, you will have a working program with a graphical user interface (GUI) that includes buttons, text fields, and action listeners.

---

## Prerequisites
1. **IntelliJ IDEA** installed on your computer.
2. **Java Development Kit (JDK)** installed and configured.

---
```
project-folder/
│
├── src/
│   └── Main.java  # The main file containing the GUI logic
│
└── README.md      # Instructions for building and running the project
```

---

## Main Workflow
Follow these steps to build your Java GUI application:

1. **Set Up the Project**:
   - Open IntelliJ IDEA and create a new **Java** project.
   - Ensure the JDK is properly set up.

2. **Create the Main Class**:
   - Right-click on the `src` folder.
   - Select **New → Java Class** and name it `Main`.

3. **Write the GUI Code**:
   - Copy the provided code into `Main.java`.
   -Copy the following code into your `Main.java` file:
		```java
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

		```

4. **Run the Program**:
   - Click the **Run** button in IntelliJ IDEA to launch your GUI application.


---


## Next Steps
- Experiment with additional components such as:
  - **`JCheckBox`** for checkboxes.
  - **`JRadioButton`** for radio buttons.
  - **`JComboBox`** for dropdown menus.
- Explore layouts like:
  - **`FlowLayout`**: Simple left-to-right arrangement.
  - **`GridLayout`**: Grid-based arrangement.

---

## Example Workflow
1. User enters text in the input field.
2. User clicks the "Click Me" button.
3. The application displays a dialog box with the entered text.

Good luck, and happy coding!
