/**
 * Pointillism
 * by Daniel Shiffman (edited by Harman Singh). 
 * Mouse horizontal location controls size of dots. 
 * Creates a simple pointillist effect using ellipses colored
 * according to pixels in an image. 
**/
 
// The next line is needed if running in JavaScript Mode with Processing.js
/* @pjs preload="grasschopper.jpg"; */ 

PImage img;
int smallPoint, largePoint;

void setup() {
  size(500, 312);
  img = loadImage("grasschopper.jpg");
  smallPoint = 1;
  largePoint = 2;
  imageMode(CENTER);
  noStroke();
  background(255);
  frameRate(9999);
}

void draw() { 
  float pointillize = map(mouseX, 0, width, smallPoint, largePoint);
  int x = int(random(img.width));
  int y = int(random(img.height));
  color pix = img.get(x, y);
  fill(pix, 128);
  ellipse(x, y, pointillize, pointillize);
}
