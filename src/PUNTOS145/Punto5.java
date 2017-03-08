/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugarfutbol;
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
/**
 *
 * @author GONZALES
 */
public class Punto5 {
    private City ciudad2;
    private Robot  robot2;
    private Thing []balon2=new Thing [3];
    private Wall [] pared=new Wall[50]; 
public Punto5(){

this.ciudad2=new City();
this.robot2=new Robot(ciudad2,7,8,Direction.NORTH);
this.balon2[0]=new Thing(ciudad2,6,5);
this.balon2[0]=new Thing(ciudad2,3,8);
this.balon2[0]=new Thing(ciudad2,4,6);
for(int i=0;i<4;i++){
this.pared[i]= new Wall(ciudad2, 1, 4+i, Direction.SOUTH);
}
for(int i=0;i<2;i++){
this.pared[i]= new Wall(ciudad2, 2+i,4, Direction.WEST);
}
this.pared[0]= new Wall(ciudad2, 3,3, Direction.SOUTH);
this.pared[0]= new Wall(ciudad2, 4,3, Direction.WEST);
this.pared[0]= new Wall(ciudad2, 4,2, Direction.SOUTH);
this.pared[1]= new Wall(ciudad2, 5,2, Direction.WEST);
this.pared[1]= new Wall(ciudad2, 6,2, Direction.WEST);
this.pared[1]= new Wall(ciudad2, 6,2, Direction.SOUTH);
this.pared[1]= new Wall(ciudad2, 7,3, Direction.WEST);
this.pared[1]= new Wall(ciudad2, 7,3, Direction.SOUTH);
this.pared[1]= new Wall(ciudad2, 7,4, Direction.SOUTH);
this.pared[1]= new Wall(ciudad2, 7,5, Direction.WEST);
this.pared[1]= new Wall(ciudad2, 6,5, Direction.WEST);
this.pared[1]= new Wall(ciudad2, 5,5, Direction.SOUTH);
this.pared[1]= new Wall(ciudad2, 5,6, Direction.WEST);
this.pared[1]= new Wall(ciudad2, 4,6, Direction.WEST);
this.pared[1]= new Wall(ciudad2, 4,6, Direction.SOUTH);
this.pared[1]= new Wall(ciudad2, 2,8, Direction.SOUTH);
this.pared[1]= new Wall(ciudad2, 2,8, Direction.WEST);
this.pared[1]= new Wall(ciudad2, 3,9, Direction.SOUTH);
this.pared[1]= new Wall(ciudad2, 3,9, Direction.WEST);
for(int i=0;i<3;i++){
this.pared[i]= new Wall(ciudad2, 4+i,10, Direction.WEST);
}
this.pared[1]= new Wall(ciudad2, 6,9, Direction.SOUTH);
this.pared[1]= new Wall(ciudad2, 7,9, Direction.WEST);
this.pared[1]= new Wall(ciudad2, 7,8, Direction.SOUTH);
this.pared[1]= new Wall(ciudad2, 7,8, Direction.WEST);
this.pared[1]= new Wall(ciudad2, 6,8, Direction.WEST);
this.pared[1]= new Wall(ciudad2, 5,7, Direction.SOUTH);
this.pared[1]= new Wall(ciudad2, 5,8, Direction.SOUTH);
this.pared[1]= new Wall(ciudad2, 6,7, Direction.WEST);
this.pared[1]= new Wall(ciudad2, 6,6, Direction.SOUTH);
this.pared[1]= new Wall(ciudad2, 7,6, Direction.WEST);
this.pared[1]= new Wall(ciudad2, 6,4, Direction.WEST);
this.pared[1]= new Wall(ciudad2, 5,4, Direction.WEST);
this.pared[1]= new Wall(ciudad2, 5,3, Direction.SOUTH);
this.pared[1]= new Wall(ciudad2, 4,4, Direction.SOUTH);
this.pared[1]= new Wall(ciudad2, 4,5, Direction.WEST);
this.pared[1]= new Wall(ciudad2, 3,5, Direction.WEST);
this.pared[1]= new Wall(ciudad2, 2,5, Direction.SOUTH);
this.pared[1]= new Wall(ciudad2, 2,6, Direction.SOUTH);
this.pared[1]= new Wall(ciudad2, 3,7, Direction.WEST);
this.pared[1]= new Wall(ciudad2, 3,7, Direction.SOUTH);
this.pared[1]= new Wall(ciudad2, 4,8, Direction.WEST);
this.pared[1]= new Wall(ciudad2, 4,8, Direction.SOUTH);
}


public void funcion(){
primerp();
Devolverse();
tercerap();}


public void primerp(){
vuelta();
this.robot2.turnLeft();
avanzar();
this.robot2.turnLeft();
vuelta();
this.robot2.pickThing();
}

public void Devolverse(){
       giro();
       giro2();
       vuelta();
       girarizquierda();
       avanzar();
       girarizquierda();
       giro2();
       this.robot2.move();
       this.robot2.pickThing();
}


public void tercerap(){
  giro();
  for (int i=0;i<2;i++){
  this.robot2.move();
  girarizquierda();}
  giro2();
  vuelta();
  this.robot2.pickThing();
  this.robot2.turnLeft();
  avanzar();
  
}

public void girarizquierda(){
    for (int i=0;i<3;i++){
this.robot2.turnLeft();
}}

public void vuelta(){
this.robot2.move();
girarizquierda();
this.robot2.move();}

public void avanzar(){
this.robot2.move();
this.robot2.move();}

public void giro(){
for (int i=0;i<2;i++){
this.robot2.turnLeft();
}
}

public void giro2(){
this.robot2.move();
this.robot2.turnLeft();}
}
