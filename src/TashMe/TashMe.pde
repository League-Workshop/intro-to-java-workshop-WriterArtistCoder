PImage stache;
PImage tux;

void setup() {
  size(600, 600);
  tux = loadImage("tux.jpg");
  tux.resize(width, height);
  stache = loadImage("stache.png");
  stache.resize(50, 20);
}

void draw() {
  background(tux);
  if (mousePressed) {
    image(stache, mouseX, mouseY);
  }
}