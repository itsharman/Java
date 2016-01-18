/***
Harman Singh
This program is about tossing paper balls, aiming for the middle
***/


void setup()
{
  size(600,600);
  background(255,255,255);
  noCursor(); 
  frameRate(500);
}


void draw()
{
  float d1 = random(300);
  float d2 = random(300); 
  float d3 = random(300);
  float d4 = random(300);
  
  float xPos = d1 + d2;
  float yPos = d3 + d4;
  
  noStroke();
  fill(0,0,60,60);  
  ellipse(xPos,yPos,10,10);
}


