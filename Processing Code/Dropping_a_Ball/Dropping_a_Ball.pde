/***
Program: Dropping a ball
***/

PImage img;
int value = 0;
//field
float yAxis = 100; //storage
float XAxis = 100; //storage

void setup()
{
  size(500,500);
  frameRate(30);
  img = loadImage ("bass.jpg");
}
  
void draw()
{
  background(255);
  yAxis= yAxis * 1.01;
  xAxis= xAxis * 1.01;
  image (img, 250, yAxis);
  fill (value);
}

void mouseClicked() 
{
  yAxis=mouseY;
  xAxis=mouseX;
  
}
 
