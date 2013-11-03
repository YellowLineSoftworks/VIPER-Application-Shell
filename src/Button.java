
import resources.Sprite;

/**
 * @author Jack
 */
public class Button extends resources.gameobjects.Button{

    public Button(int x, int y, Sprite unclicked, Sprite clicked, String buttonType) {
        super(x, y, unclicked, clicked, buttonType);
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