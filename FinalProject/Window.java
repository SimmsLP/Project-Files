import javax.swing.*;
/**
 * Write a description of class proyecto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Window
{
    static JFrame frame;
    public static void main(String[] args)
    {
        frame = new JFrame();
        frame.setSize(552, 552);
        frame.setTitle("Hello");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
