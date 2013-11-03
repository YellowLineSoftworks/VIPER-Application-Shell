
import game.clock;
import graphics.BufferedFrame;

/**
 * @author Jack
 */
public class main extends clock {
    
    public static main main;
    
    public static void main(String[] args) {
        
        main = new main();
        main.start(0, new BufferedFrame(0, 0, 500, 500, "VIPER 1.0 Alpha", new MouseListener(), new KeyListener()));
        
    }
    
    @Override
    public void init() {
        BufferedFrame.frame.enableFpsCounter(main);        
    }
    
    @Override
    public void tick() {
        
    }
    
}