int number;
int maximum = 100;

void setup() {
  number = 0;
}

void draw() {
  if (number < maximum) {
    number = number + 1;
    println (number + "...");
  } 
}


