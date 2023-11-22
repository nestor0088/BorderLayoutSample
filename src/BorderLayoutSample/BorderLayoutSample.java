package BorderLayoutSample;
import java.awt.*;
import javax.swing.*;

public class BorderLayoutSample {
    static JFrame fr;
    static JPanel p1;
    static JPanel p2;
    static JButton b1;
    static JButton b2;
    static JButton b3;
    static JButton b4;
    static JButton b5;
    static JButton btnl;
    static JButton btn2;

    public static void main(String[] args) {
        fr=new JFrame();
        fr.setTitle("GUI");
        p1=new JPanel(new BorderLayout());
        p2=new JPanel(new FlowLayout());
        b1=new JButton("Button 1");
        b2=new JButton("Button 2");
        b3=new JButton("Button 3");
        b4=new JButton("Button 4");
        b5=new JButton("Button 5");
        
        btnl=new JButton("Panel 2 Button 1");
        btn2=new JButton("Panel 2 Button 2");
        p1.add(b1,BorderLayout.NORTH);
        p1.add(b2,BorderLayout.WEST);
        p1.add(b3,BorderLayout.CENTER);
        p1.add(b4, BorderLayout.EAST);
        p1.add(b5, BorderLayout.SOUTH);
        fr.add(p1);
        fr.setSize(300, 350);
        fr.setLocation(300,350);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
