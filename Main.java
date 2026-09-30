import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GamePanel gamePanel = new GamePanel();
        frame.add(panel);
        frame.setResizable(resizable: false);
        frame.pack();
        frame.setLocationRelativeTo(c: null);
        frame.setVisible(true);
        });

    }
}
