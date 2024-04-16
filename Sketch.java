import processing.core.PApplet;

public class Sketch extends PApplet {

  public void run() {
  }

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // method - drawSmallCircles(height,colour)
    drawSmallCircles(1.2f,0);   // when inputting a decimal, the first parameter should be always followed by the letter 'f' other wise the program does not run. If a whole number is iinputed then no change is needed 
    drawSmallCircles(4.5f,0);
    drawSmallCircles(2,768);

    //method - drawCircleFace(top/bottom/left/right + side)
    drawFaceOnSide("topSide");
    drawFaceOnSide("bottomSide");
    drawFaceOnSide("rightSide");
    drawFaceOnSide("leftSide");
  }

    // drawSmallCircles Method
    private void drawSmallCircles(float yaxisValue, int rgbCode){

    fill(rgbCode);

    for(int i = 0; i <= 200; i++) {    // infinite for loop (draws infinite horizontal cicles at a given height)
    ellipse(Math.round(width/1.005-(i*50)), height/yaxisValue, 40, 40);
    }
   }

    // drawCircleFace Method
    private void drawFaceOnSide(String whichSide ) {
      if(whichSide.equals("leftSide")) {
        // Draw circles on the left side
     fill(245,245,245);
     ellipse(Math.round(width*1/4),Math.round(height*1/2),Math.round(width*1/3),Math.round(height*1/3));
   
     fill(204,102,0);
     ellipse(Math.round(width*4/20),Math.round(height*1/2),Math.round(width*20/300),Math.round(height*20/300));
  
     fill(204,102,0);
     ellipse(Math.round(width*6/20),Math.round(height*1/2),Math.round(width*20/300),Math.round(height*20/300));
  
     rect(Math.round(width*3/20),Math.round(height*165/300),Math.round(width*60/300),Math.round(height*10/300));
    }
   
    else if (whichSide.equals("rightSide")) {
      // Draw circles on the right side
      fill(245,245,245);
      ellipse(Math.round(width * 3/4), Math.round(height * 1/2), Math.round(width * 1/3), Math.round(height * 1/3));
  
      fill(204,102,0);
      ellipse(Math.round(width * 14/20), Math.round(height * 1/2), Math.round(width * 20/300), Math.round(height * 20/300));
  
      fill(204,102,0);
      ellipse(Math.round(width * 16/20), Math.round(height * 1/2), Math.round(width * 20/300), Math.round(height * 20/300));
  
      rect(Math.round(width * 13/20), Math.round(height * 165/300), Math.round(width * 60/300), Math.round(height * 10/300));
    }
  
    else if (whichSide.equals("topSide")) {
      // Draw circles on the top side
      fill(245,245,245);
      ellipse(Math.round(width * 2/4), Math.round(height * 0.5/2), Math.round(width * 1/3), Math.round(height * 1/3));
  
      fill(204,102,0);
      ellipse(Math.round(width * 9/20), Math.round(height * 0.5/2), Math.round(width * 20/300), Math.round(height * 20/300));
  
      fill(204,102,0);
      ellipse(Math.round(width * 11/20), Math.round(height * 0.5/2), Math.round(width * 20/300), Math.round(height * 20/300));
  
      rect(Math.round(width * 8/20), Math.round(height * 90/300), Math.round(width * 60/300), Math.round(height * 10/300));
    }

    else if (whichSide.equals("bottomSide")) {
      // Draw circles on the bottom side
      fill(245,245,245);
      ellipse(Math.round(width * 2/4), Math.round(height * 1.5/2), Math.round(width * 1/3), Math.round(height * 1/3));
  
      fill(204,102,0);
      ellipse(Math.round(width * 9/20), Math.round(height * 1.5/2), Math.round(width * 20/300), Math.round(height * 20/300));
  
      fill(204,102,0);
      ellipse(Math.round(width * 11/20), Math.round(height * 1.5/2), Math.round(width * 20/300), Math.round(height * 20/300));
  
      rect(Math.round(width * 8/20), Math.round(height * 245/300), Math.round(width * 60/300), Math.round(height * 10/300));
    }
  /**
   * Description
   * 
   * @param yaxisValue the y value for the circles to be drawn (if decimal, then include the letter 'f' at the end i.e 2.6f)
   * @param rgbCode 
   * @param whichSide draws the circle in the spcified location 
   * @return
   * @author J. Thomas 
   */
 }
}