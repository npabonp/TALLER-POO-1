/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugarfutbol;
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
/**
 *
 * @author GONZALES
 */
public class Punto5b {
    private City ciudad4;
    private Robot  robot4;
    private Thing []balon4=new Thing [8];
    private Wall [] pared2=new Wall[48];     
public Punto5b(){

this.ciudad4=new City();
this.robot4=new Robot(ciudad4,7,4,Direction.NORTH);

for(int i=0;i<5;i++){
this.pared2[i]= new Wall(ciudad4, 1, 4+i, Direction.SOUTH);
}
for(int i=0;i<5;i++){
this.pared2[i]= new Wall(ciudad4, 2+i, 9, Direction.WEST);
}
for(int i=0;i<4;i++){
this.pared2[i]= new Wall(ciudad4, 6,5+i , Direction.SOUTH);
}
for(int i=0;i<5;i++){
this.pared2[i]= new Wall(ciudad4, 2+i, 4, Direction.WEST);
}

for(int i=0;i<5;i++){
this.pared2[i]= new Wall(ciudad4, -2, 10+i, Direction.SOUTH);
}
for(int i=0;i<5;i++){
this.pared2[i]= new Wall(ciudad4, -1+i,15 , Direction.WEST);
}
for(int i=0;i<4;i++){
this.pared2[i]= new Wall(ciudad4, 3,11+i , Direction.SOUTH);
}
for(int i=0;i<5;i++){
this.pared2[i]= new Wall(ciudad4, -1+i,10 , Direction.WEST);
}

this.balon4[0]=new Thing(ciudad4,6,5);
this.balon4[0]=new Thing(ciudad4,5,4);
this.balon4[0]=new Thing(ciudad4,6,7);
this.balon4[0]=new Thing(ciudad4,5,8);
this.balon4[0]=new Thing(ciudad4,3,4);
this.balon4[0]=new Thing(ciudad4,2,5);
this.balon4[0]=new Thing(ciudad4,2,7);
this.balon4[0]=new Thing(ciudad4,3,8);

}



 public void copiar(){
tomart();
avanzar();
tomart_();
terminar();
}
 
public void tomart(){
    for (int i=0;i<4;i++){
while(this.robot4.frontIsClear()){
if(this.robot4.canPickThing()){
this.robot4.pickThing();
this.robot4.getDirection();
this.robot4.move();}
else{
this.robot4.move();
}}
girarizquierda();
    }
}

public void avanzar(){
this.robot4.turnLeft();
this.robot4.turnLeft();
this.robot4.move();
this.robot4.turnLeft();
for (int i=0;i<6;i++){
this.robot4.move();
}
this.robot4.turnLeft();
for (int i=0;i<4;i++){
this.robot4.move();
}
}

public void tomart_(){
  while(this.robot4.countThingsInBackpack()!=0){
  for (int i=0;i<4;i++){
while(this.robot4.frontIsClear()){
this.robot4.move();
this.robot4.putThing();
this.robot4.move();}
}
girarizquierda();
    }
  }  


public void girarizquierda(){
    for (int i=0;i<3;i++){
this.robot4.turnLeft();
}}

public void terminar(){
this.robot4.turnLeft();
this.robot4.turnLeft();
this.robot4.move();
this.robot4.turnLeft();
this.robot4.move();}

}
