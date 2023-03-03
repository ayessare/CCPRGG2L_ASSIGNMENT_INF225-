import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TryAgain extends JFrame {
    TryAgain(){

        // JLabel
        JLabel imageLabel = new JLabel();
        // eyyy image downloaded from internet
        ImageIcon sadImage = new ImageIcon("sad.gif");
        imageLabel.setIcon(sadImage);

        JButton tryAgainButton = new JButton();
        JButton exitButton = new JButton();

        tryAgainButton.setText("Play Again");
        tryAgainButton.setFont(new Font("Times new roman", Font.BOLD, 25));

        // Add event to Try again button
        EventHandler handler = new EventHandler();
        tryAgainButton.addActionListener(handler);

        exitButton.setText("Exit");
        exitButton.setFont(new Font("Times new roman", Font.BOLD, 25));

        // Add event to exit button
        ExitHandler exit = new ExitHandler();
        exitButton.addActionListener(exit);
        
        this.add(imageLabel);
        this.add(tryAgainButton);
        this.add(exitButton);

    // Frame Layout
    this.setLayout(new FlowLayout());
    // Frame title
    this.setTitle("Snake Game");
    // Terminates java program on close
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    // Frame size
    this.setSize(300,320);
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
            new MainMenu();

            // Closes frame
            dispose();
        }
     }

     private class ExitHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){

            // Closes frame
            dispose();
        }
     }
        
    
}
