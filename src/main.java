
import game.Clock;
import graphics.BufferedDevice;
import graphics.awt.BufferedCanvas;
import graphics.awt.BufferedFrame;
import graphics.swing.BufferedJFrame;
import graphics.swing.BufferedJPanel;
import graphics.awt.BufferedFrame;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import javax.imageio.ImageIO;
import resources.gameobjects.Button;

/**
 * @author Jack
 */
public class main extends Clock {
    
    public static main main;
    public static BufferedCanvas canvas1;
    public static BufferedJPanel panel1;
    public static BufferedJFrame jframe;
    public static BufferedFrame frame;
    
    public static void main(String[] args) {
        
        main = new main();
        
        //AWT Standard frame code:
        //frame = new BufferedFrame(0, 0, 500, 500, "VIPER 1.3 Alpha", new MouseListener(), new KeyListener());
        //main.start(60, frame);   
        
        //Swing Standard frame code:
        //jframe = new BufferedJFrame(0, 0, 500, 500, "VIPER 1.3 Alpha", new MouseListener(), new KeyListener());
        //main.start(60, jframe);
        
        //AWT Custom frame code:
        //AWTGUI awtgui = new AWTGUI();
        //canvas1 = awtgui.bufferedCanvas1;
        //main.start(60, new BufferedDevice[]{canvas1});
        
        //Swing Custom frame code:
        //SwingGUI swinggui = new SwingGUI();
        //panel1 = swinggui.bufferedJPanel1;
        //main.start(60, new BufferedDevice[]{panel1});
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
        //panel1.enableFpsCounter(main);
        
        //Example button creation code
        //try{
        //    Method method = this.getClass().getDeclaredMethod("button1", String.class);
        //    Button button = new Button(0,0, ImageIO.read(new File("button1.png")), ImageIO.read(new File("button2.png")), 
        //        method, this, new Object[]{"test"}, main.bufferedDevices[0]);
        //}catch(NoSuchMethodException e) {
        //    System.err.println("No such method!");
        //}catch (SecurityException | IOException e){System.err.println(e.getMessage());}
    }
    
    public void button1(String exampleParameter) {
        //Insert button code here - sample code is for a fullscreen toggle button
        
        ///Swing:
        //if (frame.isFullscreen()) {
        //    frame.disableFullscreenMode();
        //} else {
        //    try {frame.enableFullscreenMode();} catch(Exception e){
        //    System.err.println(e.getMessage());
        //}
        //}
        
        //AWT:
        //if (frame.isFullscreen()) {
        //    frame.disableFullscreenMode();
        //} else {
        //    try {frame.enableFullscreenMode();} catch(Exception e){
        //        System.err.println(e.getMessage());
        //    }
        //}
    }
    
    @Override
    public void tick() {
        
    }
    
}