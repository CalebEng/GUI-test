/*
 * Caleb Eng
 * 1/9/2023
 * Gui object settings for use
 */

import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants; 


public class GUI{

    private JPanel top_panel;
    private JPanel ls_panel;
    private JPanel rs_panel;
    private JPanel bot_panel;
    private JPanel mid;
    private String path;
    private JFrame b_frame;

    private ImageIcon ico;
    public GUI(){

        //frames
        b_frame = new JFrame();

        //getting the new icon for the frame
        path = new File("res\\Icon.png").getAbsolutePath() + "\\";
        try {
            b_frame.setIconImage(ImageIO.read(new File(path)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //panels
        top_panel = new JPanel();
        bot_panel = new JPanel();
        mid = new JPanel();
        ls_panel = new JPanel();
        rs_panel = new JPanel();
      //  SpringLayout layout = new SpringLayout();

        //default panel
        b_frame.setMinimumSize(new Dimension(1080,720));
        b_frame.setSize(1080, 720);
        b_frame.setTitle("BlackJack-Frame-Test");
        b_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        b_frame.setVisible(true);
     

        //setup for the GUI panel
       

        //border layout experiment
        b_frame.setLayout(new BorderLayout());

        //top
        top_panel.setBackground(Color.gray);
        top_panel.setPreferredSize(new Dimension(1,50));

        //bot
        bot_panel.setBackground(Color.GRAY);
        bot_panel.setPreferredSize(new Dimension(1,75));
        
        //mid
        mid.setBackground(new Color(0, 107, 73));
        mid.setPreferredSize(new Dimension(100,100));

        //adding panels
        b_frame.add(top_panel, BorderLayout.NORTH);
        b_frame.add(bot_panel,BorderLayout.SOUTH);
        b_frame.add(mid, BorderLayout.CENTER);
        
        

        //trying grid layout
        
       // JLabel name = new JLabel("Player name:", SwingConstants.CENTER);
        
      //  panel.add(name);
        
    }   
}


