/*
 * Caleb Eng
 * 1/9/2023
 * Gui object settings for use
 */

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SpringLayout;

public class GUI{

    public GUI(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();

        //default size of the panel
        frame.setMinimumSize(new Dimension(1080,720));
        frame.setSize(1080, 720);


        //setup for the GUI panel
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(panel);

        panel.setLayout(null);
        
        frame.setTitle("BlackJack-Frame-Test");

        JLabel name = new JLabel("Player name:", SwingConstants.CENTER);
        panel.add(name);
        frame.setVisible(true);
    }   
}


