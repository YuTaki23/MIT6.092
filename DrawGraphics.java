import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    BouncingBox box;
    BouncingBox box1, box2, box3;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(200, 50, Color.RED);
        box.setMovementVector(0, -2);

        box1 = new BouncingBox(100, 25, Color.BLUE);
        box1.setMovementVector(1, 0);
        box2 = new BouncingBox(400, 400, Color.CYAN);
        box2.setMovementVector(5,0);
        box3 = new BouncingBox(300, 500, Color.green);
        box3.setMovementVector(3,3);
/**
        boxes = new ArrayList<BouncingBox>();
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
 */
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface){
        surface.drawLine(50, 50, 250, 250);
        box.draw(surface);
        surface.drawOval(20, 20, 100, 100);
        surface.drawArc(100, 100, 200, 200, 0, 180);
        surface.fill3DRect(80, 80, 100, 100, false);
    }
}