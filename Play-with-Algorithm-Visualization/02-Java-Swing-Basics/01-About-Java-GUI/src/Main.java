import javax.swing.*;
import java.awt.*;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-01-08 3:35 PM
 */
public class Main {

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame("Welcome");
            frame.setSize(500, 500);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}