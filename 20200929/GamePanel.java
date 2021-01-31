import java.awt.Graphics;
import javax.swing.JPanel;


public class GamePanel extends JPanel{

private static final long serialVersionUID = 1L;


public void display(){
        //  System.out.println("display");
          this.repaint();
         // System.out.println("repaint()");
    }

    @Override
    protected void paintComponent(Graphics g) {
        System.out.println("paintComponent");
    }


    public static void main(String[] args){
        GamePanel gamePanel = new GamePanel();
        gamePanel.display();
    }
}