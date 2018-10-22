package drawServices;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    BouncingBox blueBox;
    BouncingBox redBox;
    BouncingBox yellowBox;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        //ArrayList with boxes in it
        ArrayList<BouncingBox> boxes = new ArrayList<BouncingBox>();

        boxes.add(blueBox = new BouncingBox(200, 50, Color.BLUE ));
        boxes.add(redBox = new BouncingBox(100, 20, Color.RED));
        boxes.add(yellowBox = new BouncingBox(300, 300, Color.YELLOW));
        System.out.println(boxes.size());


        for(int i=0; i<boxes.size(); i++){
            boxes.get(i).setMovementVector((0+i),(1+i));
        }
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        surface.drawOval(100, 100, 50,50);
        surface.drawRect(12, 12, 150, 100);
        blueBox.draw(surface);
        yellowBox.draw(surface);
        redBox.draw(surface);
    }
}