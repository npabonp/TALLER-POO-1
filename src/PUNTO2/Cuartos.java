/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Display;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author gipao
 */
public class Cuartos {

    private City col;
    
    public Cuartos( )
    {
        col = new City( );
    }

    public City getCity() {
        return col;
    }

    public void escenario() {

        for (int i = 5; i > 0; i--) {
            for (int j = 1; j < 10; j= j+3) {
            Wall n = new Wall(col, i, j, Direction.WEST); 
            }
        }

        for (int j = 9; j > 0; j--) {
            Wall n = new Wall(col, 1, j, Direction.NORTH);
        }

        for (int j = 1; j < 10; j= j+3) {
            Wall n = new Wall(col, 5, j, Direction.SOUTH);
            Wall n1 = new Wall(col, 5, (j+2), Direction.SOUTH);
        }

        for (int i = 5; i > 0; i--) {
            Wall n = new Wall(col, i, 9, Direction.EAST);
        }
        
        //Numero oculto

        for (int i = 5; i > 0; i--) {
            for (int j = 1; j < 4; j = j + 2) {
                Thing parcel = new Thing(col, i, j);
            }
        }
        Thing parcel = new Thing(col, 5, 2);
        parcel = new Thing(col, 1, 2);

        for (int i = 1; i < 6; i = i + 2) {
            for (int j = 4; j < 7; j++) {
                parcel = new Thing(col, i, j);
            }
        }
        parcel = new Thing(col, 2, 4);
        parcel = new Thing(col, 4, 6);

        for (int i = 5; i > 0; i--) {
            for (int j = 7; j < 10; j = j + 2) {
               parcel = new Thing(col, i, j);
            }
        } parcel = new Thing(col, 5, 8);
        parcel = new Thing(col, 1, 8);

    }
}
