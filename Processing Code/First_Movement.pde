/***
Harman Singh
This program creates movement
Stars needed, at least 1
Start end w/ stars and /
***/

//happens once in the beginning
void setup()
{
//this changes size in pixels
size(400,400);
//one color - grayscale (0-255)
//0 is black, 255 is white
//255,0,0 is bright red (RGB)
background(255, 0, 255);
}



//happens over and over, etc.
void draw()
{
//top-left of the program is 0,0 and bottom-right is 400,400
ellipse(mouseX,mouseY,20,20);
//this fills up the circles
fill(mouseX);
//this makes no stroke
noStroke();
}


