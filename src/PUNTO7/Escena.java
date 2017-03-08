/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PUNTO7;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

public class Escena {

    City city = new City();

    Robot karel = new Robot(city, 10, 5, Direction.NORTH, 0);

    public void setRobDirection(Robot r, Direction d) {
        while (r.getDirection() != d) {
            r.turnLeft();
        }
    }

    public void paredes() {
        for (int i = 0; i < 11; i++) {
            Wall pared = new Wall(city, i, 0, Direction.WEST);
            Wall pared1 = new Wall(city, 0, i, Direction.NORTH);
            Wall pared2 = new Wall(city, i, 10, Direction.EAST);
            Wall pared3 = new Wall(city, 10, i, Direction.SOUTH);
        }
        for (int i = 0; i < 4; i++) {
            Wall paredh0 = new Wall(city, 4, i, Direction.SOUTH);
            Wall paredh1 = new Wall(city, 6, i, Direction.NORTH);
            Wall paredh2 = new Wall(city, i, 4, Direction.EAST);
            Wall paredh3 = new Wall(city, i, 6, Direction.WEST);
        }
        for (int i = 6; i < 10; i++) {
            Wall paredh2 = new Wall(city, 4, i, Direction.SOUTH);
            Wall paredh3 = new Wall(city, 6, i, Direction.NORTH);
            Wall paredh4 = new Wall(city, i, 4, Direction.EAST);
            Wall paredh5 = new Wall(city, i, 6, Direction.WEST);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                Thing cosa1 = new Thing(city, i, j);
                Thing cosa2 = new Thing(city, j, i);
            }
        }
        for (int i = 6; i < 11; i++) {
            for (int j = 6; j < 11; j++) {
                Thing cosa1 = new Thing(city, i, j);
                Thing cosa2 = new Thing(city, j, i);
            }

        }
        for (int i = 6; i < 11; i++) {
            for (int j = 0; j < 5; j++) {
                Thing cosa1 = new Thing(city, i, j);
                Thing cosa2 = new Thing(city, j, i);
            }
        }

    }

    public void Recoger() {

        while (true) {

            setRobDirection(karel, Direction.WEST);
            while (karel.frontIsClear()) {
                if (karel.frontIsClear()) {
                    karel.move();
                    karel.pickThing();
                }
            }

            if (!karel.canPickThing()) {
                setRobDirection(karel, Direction.NORTH);
                karel.move();

                setRobDirection(karel, Direction.EAST);
                while (karel.frontIsClear()) {
                    if (karel.frontIsClear()) {
                        karel.pickThing();
                        karel.move();

                    }
                }
               if (!karel.canPickThing()) {
                setRobDirection(karel, Direction.NORTH);
                karel.move(); 
            }}
        }
    }
}
