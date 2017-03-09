/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PUNTOS145;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;


/**
 *
 * @author Estudiante
 */
public class Futbol {
    private City ciudad;
    private Robot  robot;
    private Thing balon;
public Futbol(){
this.ciudad=new City();
this.robot=new Robot(ciudad,5,5,Direction.WEST);
this.balon=new Thing(ciudad,5,5);
}
public void jugar(){
for(int i=0;i<2;i++){
this.robot.pickThing();
advance();
advanceRight();
advance();
dejar();
}
this.robot.pickThing();
advance();
dejar();
this.robot.pickThing();
advance();
advanceRight();
this.robot.putThing();
this.robot.pickThing();
advance();
}






public void advance(){
this.robot.move();
this.robot.move();
}

public void advanceleft(){
this.robot.turnLeft();
}
public void Tomar(){
this.robot.pickThing();
}

public void dejar(){
this.robot.putThing();
this.robot.turnLeft();
}

public void advanceRight(){
    for (int i=0;i<3;i++){
this.robot.turnLeft();
}}



}
