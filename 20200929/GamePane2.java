import java.awt.Color;
import java.awt.Graphics;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class GamePane2 extends JPanel{
 
    private static final long serialVersionUID = 1L;
    public GamePane2(){
     
    }
 
    public void display(){   
        System.out.println("GmaePane001 - display");
         
        this.repaint();
    }
 
    @Override
    protected void paintComponent(Graphics g) {
         
        System.out.println("GamePanel23 - ------------paintComponent");
         
        g.setColor(new Color(0xcfcfcf));   
    }   
     
    @Override
    public void paint(Graphics g) {
        System.out.println("GamePanel - ------------paint");
        super.paint(g);
    }
 
    @Override
    public void update(Graphics g) {
        System.out.println("GamePanel - ------------update");
        super.update(g);
    }
 
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        GamePane2 gp = new GamePane2();
        frame.add(gp);
        frame.setVisible(true);
        gp.display();
    }
}