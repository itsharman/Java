/***
Harman Singh
This program is going to be really beautiful.
***/


void setup()
{
  size(500,500);
  background(100,100,255);
  noCursor(); 
  //Usually, the framerate is 30
  //frameRate(30);
}


void draw()
{
  //background(random(255));
  //println(random(5));
  
  //DIMENSIONS VARIABLES
  float myHeight = random(100); 
  float myWidth = random(100);
  
  //COLOR VARIABLES
  float red = random(255);
  float green = random(255);
  float blue = random(255);
  
  //POSITION VARIABLES
  float x = random(500);
  float y = random(500);
  
  //SEEDS
  fill(red,green,blue);
  
  //OBJECT & POSITION
  ellipse(x,y,myHeight,myWidth);
}


