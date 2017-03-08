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
public class Punto4 {
    private City ciudad1;
    private Robot  robot1;
    private Thing balon1;
    
   

public Punto4(){
this.ciudad1=new City();
this.robot1=new Robot(ciudad1,1,1,Direction.SOUTH);

for (int i =0;i<3;i++){
this.balon1=new Thing(ciudad1,1,1);}

for (int i =0;i<2;i++){
this.balon1=new Thing(ciudad1,2,1);}

for (int i =0;i<4;i++){
this.balon1=new Thing(ciudad1,3,1);}

for (int i =0;i<5;i++){
this.balon1=new Thing(ciudad1,4,1);}

for (int i =0;i<7;i++){
this.balon1=new Thing(ciudad1,5,1);}
}


public void moverse(){
while(this.robot1.canPickThing()){
Tomarobjeto();
dejarobjeto();
Devolverse();
}
}

public void Devolverse(){
    girocompleto();
   this.robot1.move(); 
    girocompleto();
   while(this.robot1.canPickThing()==false){
     this.robot1.move(); 
    }
    while(this.robot1.canPickThing()==true){
      this.robot1.turnLeft();
      moverse();
    }
        }

public void Tomarobjeto(){
    while(this.robot1.canPickThing()){
    this.robot1.pickThing();}
    }

public void dejarobjeto(){
this.robot1.turnLeft();
while(this.robot1.countThingsInBackpack()>=1){
this.robot1.putThing();
this.robot1.move();
}}

public void girarizquierda(){
    for (int i=0;i<2;i++){
this.robot1.turnLeft();
}}

public void girocompleto(){
girarizquierda();
this.robot1.turnLeft();
}

}
