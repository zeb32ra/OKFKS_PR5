import javax.swing.*;

public class SimpleGUIApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Simple GUI App");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            JLabel label = new JLabel("Hello, Docker with GUI!", SwingConstants.CENTER);
            frame.add(label);

            JButton button = new JButton("Click Me!");
            button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button clicked!"));
            frame.add(button, "South");

            frame.setVisible(true);
        });
    }
}
