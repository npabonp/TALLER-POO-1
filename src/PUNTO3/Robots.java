/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hello;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author gipao
 */
public class Robots {

    private City ciudad;
    private Robot robot1;
    private Robot robot2;
    private Robot robot3;
    private Robot robot4;
    private Robot robot5;

    public Robots() {
        this.ciudad = new City();
        this.robot1 = new Robot(ciudad, 5, 1, Direction.NORTH, 20);
        this.robot2 = new Robot(ciudad, 1, 7, Direction.WEST, 20);
        this.robot3 = new Robot(ciudad, 1, 9, Direction.SOUTH, 20);
        this.robot4 = new Robot(ciudad, 1, 13, Direction.SOUTH, 20);
        this.robot5 = new Robot(ciudad, 1, 17, Direction.SOUTH, 20);
    }

    public void hola() {
        
        //primer robot
        this.advance5();
        this.u();
        this.vuelta180();
        this.advance5();
        //segundo robot
        this.ue();
        this.vuelta180e();
        this.ue();
        //tercer robot
        this.hacerL1();
        //cuarto robot
        this.hacerL2();
        //quinto robot
        this.hacerO();
    }

    private void u(){
        this.vuelta180();
        this.advance3();
        for (int i = 0; i < 2; i++) {
            this.robot1.turnLeft();
            this.advance3();
        }
        robot1.putThing();
    }

    private void advance5() {
        for (int i = 0; i < 4; i++) {
            robot1.putThing();
            this.robot1.move();
        }robot1.putThing();
    }

    private void advance3() {
        for (int i = 0; i < 2; i++) {
            robot1.putThing();
            this.robot1.move();
        }
    }

    private void vuelta180() {
        for (int i = 0; i < 2; i++) {
            this.robot1.turnLeft();
        }
    }

    private void ue() {
        this.advance3e();
        for (int i = 0; i < 2; i++) {
            this.robot2.turnLeft();
            this.advance3e();
        }
        robot2.putThing();
    }

    private void advance3e() {
        for (int i = 0; i < 2; i++) {
            robot2.putThing();
            this.robot2.move();
        }
    }

    private void vuelta180e() {
        for (int i = 0; i < 2; i++) {
            this.robot2.turnLeft();
        }
    }

    private void hacerL1() {
        for (int i = 0; i < 4; i++) {
            robot3.putThing();
            this.robot3.move();
        }
        this.robot3.turnLeft();
        for (int i = 0; i < 2; i++) {
            robot3.putThing();
            this.robot3.move();
        }
    }

    private void hacerL2() {
        for (int i = 0; i < 4; i++) {
            robot4.putThing();
            this.robot4.move();
        }
        this.robot4.turnLeft();
        for (int i = 0; i < 2; i++) {
            robot4.putThing();
            this.robot4.move();
        }
    }

    private void hacerO() {
        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < 4; i++) {
                robot5.putThing();
                this.robot5.move();
            }
            this.robot5.turnLeft();
            for (int j = 0; j < 2; j++) {
                robot5.putThing();
                this.robot5.move();
            }
            this.robot5.turnLeft();
        }
    }

}
