import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import java.awt.*;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class ColorMenu extends JFrame{

    private String[] colorNameArray = {"GRAY", "LIGHT GRAY", "WHITE", "BLACK"};
    private Color[] colorListArray = {Color.GRAY, Color.LIGHT_GRAY, Color.WHITE, Color.BLACK};

    JList colorList;

    ColorMenu(){
        JLabel label = new JLabel();
        label.setText("Choose Backround color: ");
        label.setFont(new Font("Times new roman", Font.BOLD, 25));
        this.add(label);

        colorList = new JList (colorNameArray);
        colorList.setFont(new Font("Times new roman", Font.BOLD, 25));
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        EventHandler handler = new EventHandler();
        colorList.addListSelectionListener(handler);
        this.add(colorList);

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

    private class EventHandler implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent event){
            GamePanel gp = new GamePanel();
            gp.gameBGcolor = colorListArray[colorList.getSelectedIndex()];

            new GameFrame();
            dispose();
        }
 
    }
    
}
