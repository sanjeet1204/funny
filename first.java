import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class first {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Developer Sanjeet - Happy New Year 🎉");
        frame.setSize(600, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JTextField nameField = new JTextField(20);
        JTextField emailField = new JTextField(20);
        JPasswordField passField = new JPasswordField(20);

        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel passLabel = new JLabel("Password:");

        JButton submitButton = new JButton("Create Account");
        submitButton.setBackground(new Color(0, 100, 0));
        submitButton.setForeground(Color.WHITE);
        submitButton.setFont(new Font("Arial", Font.BOLD, 16));

        gbc.gridx = 0; gbc.gridy = 0; panel.add(nameLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 0; panel.add(nameField, gbc);

        gbc.gridx = 0; gbc.gridy = 1; panel.add(emailLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 1; panel.add(emailField, gbc);

        gbc.gridx = 0; gbc.gridy = 2; panel.add(passLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 2; panel.add(passField, gbc);

        gbc.gridx = 1; gbc.gridy = 3; panel.add(submitButton, gbc);

        frame.add(panel);
        frame.setVisible(true);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();

                // Hack-style green screen
                JFrame hackFrame = new JFrame("System Access");
                hackFrame.setSize(600, 400);
                hackFrame.setLocationRelativeTo(null);

                JTextArea hackArea = new JTextArea();
                hackArea.setBackground(Color.BLACK);
                hackArea.setForeground(Color.GREEN);
                hackArea.setFont(new Font("Monospaced", Font.BOLD, 16));
                hackArea.setEditable(false);

                hackFrame.add(new JScrollPane(hackArea));
                hackFrame.setVisible(true);

                // Fake hacking messages with delay
                new Thread(() -> {
                    try {
                        String[] messages = {
                                "Initializing secure connection...",
                                "Accessing Sanjeet Developer System...",
                                "Encrypting user data...",
                                "Bypassing firewalls...",
                                "Loading festive modules...",
                                "System override successful!"
                        };
                        for (String msg : messages) {
                            hackArea.append(msg + "\n");
                            Thread.sleep(1000); // 1 second delay
                        }

                        // After delay, show wishes panel
                        SwingUtilities.invokeLater(() -> {
                            JPanel wishesPanel = new JPanel();
                            wishesPanel.setLayout(new BoxLayout(wishesPanel, BoxLayout.Y_AXIS));
                            wishesPanel.setBackground(new Color(25, 25, 25));
                            wishesPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

                            JLabel heading = new JLabel("🎆 Happy New Year 2026 🎆");
                            heading.setFont(new Font("Serif", Font.BOLD, 30));
                            heading.setForeground(Color.ORANGE);
                            heading.setAlignmentX(Component.CENTER_ALIGNMENT);

                            JLabel subHeading = new JLabel("🌸 Radhe Radhe " + name + "! 🌸");
                            subHeading.setFont(new Font("SansSerif", Font.BOLD, 22));
                            subHeading.setForeground(Color.CYAN);
                            subHeading.setAlignmentX(Component.CENTER_ALIGNMENT);

                            JLabel blessing = new JLabel("<html><center>Premanand Ji Maharaj says:<br>"
                                    + "✨ May your 2026 be filled with laughter like kirtan,<br>"
                                    + "💖 joy like prasad, and blessings like the holy Ganga! ✨</center></html>");
                            blessing.setFont(new Font("Monospaced", Font.PLAIN, 16));
                            blessing.setForeground(Color.GREEN);
                            blessing.setAlignmentX(Component.CENTER_ALIGNMENT);

                            wishesPanel.add(Box.createVerticalStrut(20));
                            wishesPanel.add(heading);
                            wishesPanel.add(Box.createVerticalStrut(15));
                            wishesPanel.add(subHeading);
                            wishesPanel.add(Box.createVerticalStrut(15));
                            wishesPanel.add(blessing);

                            JOptionPane.showMessageDialog(hackFrame, wishesPanel,
                                    "Best Wishes 2026", JOptionPane.PLAIN_MESSAGE);
                        });

                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }).start();
            }
        });
    }
}