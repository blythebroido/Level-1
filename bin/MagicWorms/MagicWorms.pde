void setup(){
  size (500, 500);
  background(204, 000, 119);
}

void draw(){
float x2 = random (500);
float y2 = random (500);

 for(int i = 0; i < 5; i++){
  ellipse(x2 / i, y2 / i, 100,100);
  fill(126 + x2, y2, y2);
}

  
}
float frequency = .001;
float noiseInterval = PI; 

void makeMagical() {
  fill( 0, 0, 0, 10 );rect(0, 0, width, height);noStroke();
}

float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}

