
import game.Clock;
import graphics.BufferedDevice;
import graphics.awt.BufferedCanvas;
import graphics.awt.BufferedFrame;
import graphics.swing.BufferedJFrame;
import graphics.swing.BufferedJPanel;

/**
 * @author Jack
 */
public class main extends Clock {
    
    public static main main;
    public static BufferedCanvas canvas1;
    public static BufferedJPanel panel1;
    
    public static void main(String[] args) {
        
        main = new main();
        
        //AWT Standard frame code:
        //main.start(60, new BufferedFrame(0, 0, 500, 500, "VIPER 1.2 Alpha", new MouseListener(), new KeyListener()));   
        
        //Swing Standard frame code:
        //main.start(60, new BufferedJFrame(0, 0, 500, 500, "VIPER 1.2 Alpha", new MouseListener(), new KeyListener()));
        
        //AWT Custom frame code:
        //AWTGUI awtgui = new AWTGUI();
        //canvas1 = awtgui.bufferedCanvas1;
        //main.start(60, new BufferedDevice[]{canvas1});
        
        //Swing Custom frame code:
        SwingGUI swinggui = new SwingGUI();
        panel1 = swinggui.bufferedJPanel1;
        main.start(60, new BufferedDevice[]{panel1});
        
    }
    
    @Override
    public void init() {
        //AWT Standard frame code:
        //BufferedFrame.frame.enableFpsCounter(main);
        
        //Swing Standard frame code:
        //BufferedJFrame.frame.enableFpsCounter(main);
        
        //AWT Custom frame code:
        //canvas1.enableFpsCounter(main);
        
        //Swing Custom frame code:
        panel1.enableFpsCounter(main);
        
    }
    
    @Override
    public void tick() {
        
    }
    
}