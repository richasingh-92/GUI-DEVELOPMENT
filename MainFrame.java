
// gui  test wala 
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JLabel label;
    private JTextField textField;
    private JTextArea textArea;

    public MainFrame() {
        // Set up the frame
        setTitle("Frame Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        // Create components
        label = new JLabel("Enter text:");
        textField = new JTextField(20);
        textArea = new JTextArea(10, 30);
        // Add components to the frame
        add(label);
        add(textField);
        add(textArea);
        // Display the frame
        setVisible(true);
    }

    // To handle error…
    public class ErrorDialogExample {
        public static void main(String[] args) {
            // Displaying an error dialog
            JOptionPane.showMessageDialog(null, "An error occurred!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame());
    }
}