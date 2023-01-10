/*
 * Caleb Eng
 * 1/9/2023
 * Gui object settings for use
 */

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI{

    public GUI(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        //default size of the panel
        frame.setSize(1080, 720);


        //setup for the GUI panel
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);
        
        frame.setTitle("BlackJack-Frame-Test");
        
    }   
}


