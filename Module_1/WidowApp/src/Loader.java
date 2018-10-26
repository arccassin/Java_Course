import javax.swing.*;
import java.awt.*;

/**
 * Created by Emessar on Окт., 2018
 */
public class Loader
{
    public static void main(String[] args) {
        int frameSizeWidth = 800;
        int frameSizeHeight = 600;
        JFrame frame = new JFrame();
        frame.setSize(frameSizeWidth, frameSizeHeight);
        // открытие в центре экрана
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Our first window application");
        frame.setVisible(true);
    }
}
