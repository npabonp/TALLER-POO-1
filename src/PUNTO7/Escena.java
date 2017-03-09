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

    Robot karel = new Robot(city, 10, 4, Direction.NORTH, 0);

    public void setRobDirection(Robot r, Direction d) {
        while (r.getDirection() != d) {
            r.turnLeft();
        }
    }

    public void avanzar() {
        for (int i = 0; i < 4; i++) {
            karel.move();
        }
    }

    public void paredes() {

        for (int i = 1; i < 5; i++) {
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

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                Thing cosa1 = new Thing(city, i, j);
                Thing cosa3 = new Thing(city, i, (j + 5));
                Thing cosa4 = new Thing(city, (j + 5), i);
                Thing cosa5 = new Thing(city, (i + 5), (j + 5));
            }
        }

    }

    public void Recoger() {
        karel.move();
        cuadros();
        Cuadro2();
        cuadros();
        Cuadro3();
        cuadros();
        Cuadro4();
        cuadros();
  
    }

    public void cuadros() {

        for (int i = 9; i > 5; i--) {
            for (int j = 4; j > 0; j--) {
                karel.pickThing();
                if (karel.frontIsClear() && (j > 1)) {
                    karel.move();
                }
            }
            setRobDirection(karel, Direction.WEST);
            if (karel.frontIsClear()){
                karel.move();
            }
            
            if (i % 2 == 1) {
                setRobDirection(karel, Direction.SOUTH);
            } else {
                setRobDirection(karel, Direction.NORTH);
            }
        }
    }

    public void Cuadro2() {
        
        avanzar();
        karel.move();
        setRobDirection(karel, Direction.EAST);
        avanzar();
        setRobDirection(karel, Direction.NORTH);
    }

    public void Cuadro3() {
        avanzar();
        setRobDirection(karel, Direction.EAST);
        for (int i = 0; i < 2; i++) {
            avanzar();
        }
        karel.move();
        setRobDirection(karel, Direction.SOUTH);
        avanzar();
        setRobDirection(karel, Direction.NORTH);
    }

    public void Cuadro4() {
        
        setRobDirection(karel, Direction.EAST);
        avanzar();
        setRobDirection(karel, Direction.SOUTH);
        avanzar();
        karel.move();
        setRobDirection(karel, Direction.WEST);
        karel.move();
        setRobDirection(karel, Direction.NORTH);
        
    }
}
