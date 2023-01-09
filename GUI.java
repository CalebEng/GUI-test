/*
 * Caleb Eng
 * 1/9/2023
 * Gui object settings for use
 */





import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI{

    public GUI(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        //default size of the panel
        panel.setBorder(BorderFactory.createEmptyBorder(720, 1080, 100, 100));
        panel.setLayout(new GridLayout(0, 1));


        //setup for the GUI panel
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("BlackJack-Frame-Test");
        frame.pack();
        frame.setVisible(true);
    }   
}


