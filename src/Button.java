
import graphics.BufferedDevice;
import java.awt.Image;

/**
 * @author Jack
 */
public class Button extends resources.gameobjects.Button{

    public Button(int x, int y, Image unclicked, Image clicked, String buttonType, BufferedDevice device) {
        super(x, y, unclicked, clicked, buttonType, device);
    }
    
    public Button(int x, int y, int endx, int endy, Image unclicked, Image clicked, String buttonType, BufferedDevice device) {
        super(x, y, endx, endy, unclicked, clicked, buttonType, device);
    }
    
    public Button(int x, int y, int endx, int endy, int srx1, int sry1, int srx2, int sry2, Image unclicked, Image clicked, String buttonType, BufferedDevice device) {
        super (x, y, endx, endy, srx1, sry1, srx2, sry2, unclicked, clicked, buttonType, device);
    }
    
    @Override
    public void clicked(String buttonType) {
        switch (buttonType) {
            //Insert cases for each button type here
            default:
                break;
        }
    } 

}