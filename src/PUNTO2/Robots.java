/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Display;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author gipao
 */
public class Robots {

    private Robot robot;
    private City col;
    public NewMatriz nm;

    public Robots(City col, NewMatriz nm) {
        System.out.println(col);
        this.col = col;
        this.nm = nm;
        this.robot = new Robot(col, 6, 2, Direction.NORTH);
    }

    public String recorrer() {
        String nums = "";
        
        this.UnCuarto(2,1);
        nums += nm.comparar();
        this.cambiodeCuarto();
        this.UnCuarto(5,4);
        nums += nm.comparar();
        this.cambiodeCuarto();
        this.UnCuarto(8,7);
        nums += nm.comparar();
        
        System.out.println("El numero oculto es: ");
        
        return nums;
    }

    private void cambiodeCuarto() {
        this.robot.turnLeft();
        this.robot.move();
        this.robot.move();
        this.robot.move();
        this.robot.turnLeft();
    }
    
    private void UnCuarto(int j, int c){

        this.robot.move();
        for (int i = 5; i > 1; i--) {
            if (robot.canPickThing()) {
               nm.read[i-1][j-c] = 1;
            }
            this.robot.move();
        }
        if (robot.canPickThing()) {
            nm.read[0][j-c] = 1;
        }
        this.robot.turnLeft();
        this.robot.move();
        this.robot.turnLeft();
        
        int k = j;
        j = j - 1;
        for (int i = 1; i < 5; i++) {
            if (robot.canPickThing()) {
                nm.read[i-1][j-c] = 1;
            }
            this.robot.move();
        }
        if (robot.canPickThing()) {
            nm.read[5-1][j-c] = 1;
        }
        this.robot.turnLeft();
        this.robot.move();
        this.robot.move();
        this.robot.turnLeft();

        j = k + 1;
        for (int i = 5; i > 1; i--) {
            if (robot.canPickThing()) {
                nm.read[i-1][j-c] = 1;
            }
            this.robot.move();
        }
        if (robot.canPickThing()) {
            nm.read[1-1][j-c] = 1;
        }
        this.robot.turnLeft();
        this.robot.move();
        this.robot.turnLeft();

        for (int i = 0; i < 5; i++) {
            this.robot.move();
        }
    }


}
