int[] buildingHeights = new int[12];
int[] starXValues = new int[200];
int[] starYValues = new int[200];

void setup(){
 size(600,450);
 background(0);
}
void draw(){}
void drawAll(){
  fill(255);
  stroke(255);
  drawSky();
  drawBuildings();
}
void drawSky(){
  stroke(255);
  strokeWeight(1);
  ellipse(500,-20,150,150);
  for(int i = 0; i<starXValues.length; i++)
  point(starXValues[i],starYValues[i]);
}
void drawBuildings(){
  stroke(0);
  for(int i = 0; i<buildingHeights.length;i++){
    drawBuilding(i*50,height-buildingHeights[i]*50);
  }
}
void drawBuilding(int x, int y){
  fill(100);
  rect(x,height,50,-y);
  for(int i = 1; i < 7; i++){
    for(int j = 1; j < height/y; j++){
       int lights = (int)random(2);
       if(lights==1)
       fill(#ECFF27);
       else
       fill(255);
       rect(x*i,y*i,5,10);
    }
  }
}
void randomize(){
  for (int n = 0; n < starXValues.length; n++ ) 
    starXValues[n] = (int)random(width);  
  for (int n = 0; n < starYValues.length; n++ ) 
    starYValues[n] = (int)random(width);   
  for (int n = 0; n < buildingHeights.length; n++ ) 
    buildingHeights[n] = (int)random(8); 
    
}
void mousePressed(){
  background(0);
  randomize();
  drawAll();
}