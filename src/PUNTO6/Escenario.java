/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PUNTO6;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author javier
 */
public class Escenario {

    City city = new City();

    public void setRobDirection(Robot r, Direction d){
        while(r.getDirection()!=d){
             r.turnLeft();
        }
    }
    
    int posicion = 0;
    int bolitas = 0;
            
            
    public void paredes() {
        for (int i = 0; i < 11; i++) {
            Wall paredvi = new Wall(city, i, 0, Direction.WEST);
            Wall paredh0 = new Wall(city, 0, i, Direction.NORTH);
            Wall paredd0 = new Wall(city, i, 10, Direction.EAST);
            Wall pareda0 = new Wall(city, 10, i, Direction.SOUTH);
        }

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j <= i; j++) {
                Thing cosa1 = new Thing(city, i, j);
            }
        }
        Robot karel = new Robot(city, 0, 0, Direction.EAST, 0);


        while (true) {
            //baja si no encuentra nada
            if (!karel.canPickThing()){
                setRobDirection(karel, Direction.SOUTH);
                if(!karel.frontIsClear()){
                    break;
                }
                karel.move();
                bolitas = 0;               
            }
            
            karel.pickThing();
            setRobDirection(karel, Direction.EAST);
            while (posicion != 10 - bolitas) {
                karel.move();
                posicion ++;
                
            }
            
            karel.putThing();
            bolitas ++;
            setRobDirection(karel, Direction.WEST);
            karel.move();
            posicion--;
            
            while (!karel.canPickThing() && karel.frontIsClear()) {
                if (karel.frontIsClear()) {
                    karel.move();
                    posicion--;
                }
            }
        }
    }
}
