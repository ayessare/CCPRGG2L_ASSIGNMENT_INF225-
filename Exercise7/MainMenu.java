import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {
    MainMenu(){
        // JLabel
        JLabel imageLabel = new JLabel();
        // eyyy image downloaded from internet
        ImageIcon eyyImage = new ImageIcon("eyy.gif");
        imageLabel.setIcon(eyyImage);

        // JButton
        JButton startButton = new JButton();
        startButton.setText("START GAME");
        startButton.setFont(new Font("Times new roman", Font.BOLD, 25));

        // Add event to start button
        EventHandler handler = new EventHandler();
        startButton.addActionListener(handler);

        this.add(imageLabel);
        this.add(startButton);

        // Frame Layout
        this.setLayout(new FlowLayout());
        // Frame title
        this.setTitle("Snake Game");
        // Terminates java program on close
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Frame size
        this.setSize(300,300);
        // Puts frame in the middle
        this.setLocationRelativeTo(null);
        // Make frame appear
        this.setVisible(true);
        // set bg color
        this.getContentPane().setBackground(Color.WHITE);

    }

    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            // Goes to game frame
            new ColorMenu();

            // Closes frame
            dispose();
        }
 
    }
}
