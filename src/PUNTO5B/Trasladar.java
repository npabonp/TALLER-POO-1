/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PUNTO5B;

/**
 *
 * @author USER
 */
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author TOSHIBA
 */
public class Trasladar {

    private City ciudad;
    private Robot robot;
    private Thing bloque[];
    private Wall muros[];

    public Trasladar(City ciudad) {
        this.ciudad = ciudad;
        this.robot = new Robot(ciudad, 10, 1, Direction.NORTH);
    }

    public Trasladar() {
        this.ciudad = new City();
        this.robot = new Robot(ciudad, 10, 1, Direction.NORTH);
        this.bloque = new Thing[8];
        this.bloque[0] = new Thing(ciudad, 8, 1);
        this.bloque[1] = new Thing(ciudad, 6, 1);
        this.bloque[2] = new Thing(ciudad, 5, 2);
        this.bloque[3] = new Thing(ciudad, 5, 4);
        this.bloque[4] = new Thing(ciudad, 6, 5);
        this.bloque[5] = new Thing(ciudad, 8, 5);
        this.bloque[6] = new Thing(ciudad, 9, 4);
        this.bloque[7] = new Thing(ciudad, 9, 2);
        this.muros = new Wall[38];
        this.muros[0] = new Wall(ciudad, 9, 1, Direction.WEST);
        this.muros[1] = new Wall(ciudad, 8, 1, Direction.WEST);
        this.muros[2] = new Wall(ciudad, 7, 1, Direction.WEST);
        this.muros[3] = new Wall(ciudad, 6, 1, Direction.WEST);
        this.muros[4] = new Wall(ciudad, 5, 1, Direction.WEST);
        this.muros[5] = new Wall(ciudad, 5, 1, Direction.NORTH);
        this.muros[6] = new Wall(ciudad, 5, 2, Direction.NORTH);
        this.muros[7] = new Wall(ciudad, 5, 3, Direction.NORTH);
        this.muros[8] = new Wall(ciudad, 5, 4, Direction.NORTH);
        this.muros[9] = new Wall(ciudad, 5, 5, Direction.NORTH);
        this.muros[10] = new Wall(ciudad, 5, 5, Direction.EAST);
        this.muros[11] = new Wall(ciudad, 6, 5, Direction.EAST);
        this.muros[12] = new Wall(ciudad, 7, 5, Direction.EAST);
        this.muros[13] = new Wall(ciudad, 8, 5, Direction.EAST);
        this.muros[14] = new Wall(ciudad, 9, 5, Direction.EAST);
        this.muros[15] = new Wall(ciudad, 9, 5, Direction.SOUTH);
        this.muros[16] = new Wall(ciudad, 9, 4, Direction.SOUTH);
        this.muros[17] = new Wall(ciudad, 9, 3, Direction.SOUTH);
        this.muros[18] = new Wall(ciudad, 9, 2, Direction.SOUTH);
        this.muros[19] = new Wall(ciudad, 6, 7, Direction.WEST);
        this.muros[20] = new Wall(ciudad, 5, 7, Direction.WEST);
        this.muros[21] = new Wall(ciudad, 4, 7, Direction.WEST);
        this.muros[22] = new Wall(ciudad, 3, 7, Direction.WEST);
        this.muros[23] = new Wall(ciudad, 2, 7, Direction.WEST);
        this.muros[24] = new Wall(ciudad, 2, 7, Direction.NORTH);
        this.muros[25] = new Wall(ciudad, 2, 8, Direction.NORTH);
        this.muros[26] = new Wall(ciudad, 2, 9, Direction.NORTH);
        this.muros[27] = new Wall(ciudad, 2, 10, Direction.NORTH);
        this.muros[28] = new Wall(ciudad, 2, 11, Direction.NORTH);
        this.muros[29] = new Wall(ciudad, 2, 11, Direction.EAST);
        this.muros[30] = new Wall(ciudad, 3, 11, Direction.EAST);
        this.muros[31] = new Wall(ciudad, 4, 11, Direction.EAST);
        this.muros[32] = new Wall(ciudad, 5, 11, Direction.EAST);
        this.muros[33] = new Wall(ciudad, 6, 11, Direction.EAST);
        this.muros[34] = new Wall(ciudad, 6, 11, Direction.SOUTH);
        this.muros[35] = new Wall(ciudad, 6, 10, Direction.SOUTH);
        this.muros[36] = new Wall(ciudad, 6, 9, Direction.SOUTH);
        this.muros[37] = new Wall(ciudad, 6, 8, Direction.SOUTH);
    }
    public int matriz[][] = {{0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0}};

    public void recorrer() {
        int fila = 10;
        for (int i = 0; i < 5; i++) {
            this.robot.move();
            fila--;
            if (robot.canPickThing() == true) {
                this.robot.pickThing();
                this.matriz[fila - 5][0] = 1;
            }
        }
        this.advanceRight();
        this.robot.move();
        if (robot.canPickThing() == true) {
            this.matriz[fila - 5][1] = 1;
            this.robot.pickThing();
        }
        this.advanceRight();
        for (int i = 0; i < 4; i++) {
            this.robot.move();
            fila++;
            if (robot.canPickThing() == true) {
                this.matriz[fila - 5][1] = 1;
                this.robot.pickThing();
            }
        }
        this.robot.turnLeft();
        this.robot.move();
        if (robot.canPickThing() == true) {
            this.matriz[fila - 5][2] = 1;
            this.robot.pickThing();
        }
        this.robot.turnLeft();
        for (int i = 0; i < 4; i++) {
            this.robot.move();
            fila--;
            if (robot.canPickThing() == true) {
                this.matriz[fila - 5][2] = 1;
                this.robot.pickThing();
            }
        }
        this.advanceRight();
        this.robot.move();
        if (robot.canPickThing() == true) {
            this.matriz[fila - 5][3] = 1;
            this.robot.pickThing();
        }
        this.advanceRight();
        for (int i = 0; i < 4; i++) {
            robot.move();
            fila++;
            if (robot.canPickThing() == true) {
                this.matriz[fila - 5][3] = 1;
                this.robot.pickThing();
            }
        }
        this.robot.turnLeft();
        this.robot.move();
        if (robot.canPickThing() == true) {
            this.matriz[fila - 5][4] = 1;
            this.robot.pickThing();
        }
        robot.turnLeft();
        for (int i = 0; i < 4; i++) {
            this.robot.move();
            fila--;
            if (robot.canPickThing() == true) {
                this.matriz[fila - 5][4] = 1;
                this.robot.pickThing();
            }
        }
        robot.turnLeft();
        for (int i = 0; i < 4; i++) {
            robot.move();
        }
        robot.turnLeft();
        for (int i = 0; i < 5; i++) {
            robot.move();
        }
        robot.turnLeft();
        for (int i = 0; i < 6; i++) {
            robot.move();
        }
        robot.turnLeft();
        for (int i = 0; i < 3; i++) {
            robot.move();
        }
        for (int j = 4; j >= 0; j--) {
            this.robot.move();
            if (this.matriz[j][0] == 1) {
                robot.putThing();
            }
        }
        this.advanceRight();
        this.robot.move();

        if (this.matriz[0][1] == 1) {
            this.robot.putThing();
        }
        this.advanceRight();

        for (int j = 1; j < 5; j++) {
            this.robot.move();
            if (this.matriz[j][1] == 1) {
                this.robot.putThing();
            }
        }
        this.robot.turnLeft();
        this.robot.move();
        if (this.matriz[4][2] == 1) {
            this.robot.putThing();
        }
        this.robot.turnLeft();
        for (int j = 3; j >= 0; j--) {
            this.robot.move();
            if (this.matriz[j][2] == 1) {
                this.robot.putThing();
            }
        }
        this.advanceRight();
        this.robot.move();
        if (this.matriz[0][3] == 1) {
            robot.putThing();
        }
        this.advanceRight();
        for (int j = 1; j < 5; j++) {
            robot.move();
            if (this.matriz[j][3] == 1) {
                this.robot.putThing();
            }
        }
        this.robot.turnLeft();
        this.robot.move();
        if (this.matriz[4][4] == 1) {
            robot.putThing();
        }
        robot.turnLeft();
        for (int j = 3; j >= 0; j--) {
            this.robot.move();
            if (this.matriz[j][4] == 1) {
                robot.putThing();
            }
        }
    }

    private void advanceRight() {
        for (int i = 0; i < 3; i++) {
            this.robot.turnLeft();
        }
    }
}
