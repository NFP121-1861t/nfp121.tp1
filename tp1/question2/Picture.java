package question2;

import question1.Circle;
import question1.Square;
import question1.Triangle;

/**
 * This class represents a simple picture. You can draw the picture using the
 * draw method. But wait, there's more: being an electronic picture, it can be
 * changed. You can set it to black-and-white display and back to colors (only
 * after it's been drawn, of course).
 * 
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 1.1 (24 May 2001)
 */
public class Picture {
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun1;
    private Circle sun2;
    private boolean terreEstFixe =true;

    /**
     * Constructor for objects of class Picture
     */
    public Picture() {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw() {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun1 = new Circle();
        sun1.changeColor("blue");
        sun1.moveHorizontal(180);
        sun1.moveVertical(-10);
        sun1.changeSize(60);
        sun1.makeVisible();
        
        sun2 = new Circle();
        sun2.changeColor("yellow");
        sun2.moveHorizontal(5);
        sun2.moveVertical(-15);
        sun2.changeSize(60);
        sun2.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite() {
        if (wall != null) // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun1.changeColor("black");
            sun2.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor() {
        if (wall != null) // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun1.changeColor("blue");
            sun2.changeColor("yellow");
        }
    }
     /**
     * Permer au soleil bleu de se coucher
     */
    
    public void coucherSoleil(){
        if(terreEstFixe)
        {
            sun1.slowMoveVertical(250);
        }
         
        }
}
