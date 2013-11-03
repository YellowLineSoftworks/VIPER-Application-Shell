
import game.Clock;
import graphics.BufferedDevice;
import graphics.awt.BufferedCanvas;
import graphics.awt.BufferedFrame;

/**
 * @author Jack
 */
public class main extends Clock {
    
    public static main main;
    public static BufferedCanvas canvas1;
    
    public static void main(String[] args) {
        
        main = new main();
        //Standard frame code:
        //main.start(60, new BufferedFrame(0, 0, 500, 500, "VIPER 1.2 Alpha", new MouseListener(), new KeyListener()));
        //Custom frame code:
        GUI gui = new GUI();
        canvas1 = gui.bufferedCanvas1;
        main.start(60, new BufferedDevice[]{canvas1});
        
    }
    
    @Override
    public void init() {
        //Standard frame code:
        //BufferedFrame.frame.enableFpsCounter(main);
        //Custome frame code:
        canvas1.enableFpsCounter(main);
        
    }
    
    @Override
    public void tick() {
        
    }
    
}