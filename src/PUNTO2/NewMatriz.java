/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Display;

import becker.robots.City;

/**
 *
 * @author gipao
 */
public class NewMatriz {

    int zero[][] = {{1, 1, 1},
    {1, 0, 1},
    {1, 0, 1},
    {1, 0, 1},
    {1, 1, 1}};

    int Uno[][] = {{0, 0, 1},
    {0, 0, 1},
    {0, 0, 1},
    {0, 0, 1},
    {0, 0, 1}};

    int Dos[][] = {{1, 1, 1},
    {0, 0, 1},
    {1, 1, 1},
    {1, 0, 0},
    {1, 1, 1}};

    int Tres[][] = {{1, 1, 1},
    {0, 0, 1},
    {1, 1, 1},
    {0, 0, 1},
    {1, 1, 1}};

    int Cuatro[][] = {{1, 0, 1},
    {1, 0, 1},
    {1, 1, 1},
    {0, 0, 1},
    {0, 0, 1}};

    int Cinco[][] = {{1, 1, 1},
    {1, 0, 0},
    {1, 1, 1},
    {0, 0, 1},
    {1, 1, 1}};

    int Seis[][] = {{1, 1, 1},
    {1, 0, 0},
    {1, 1, 1},
    {1, 0, 1},
    {1, 1, 1}};

    int Siete[][] = {{1, 1, 1},
    {0, 0, 1},
    {0, 0, 1},
    {0, 0, 1},
    {0, 0, 1}};

    int Ocho[][] = {{1, 1, 1},
    {1, 0, 1},
    {1, 1, 1},
    {1, 0, 1},
    {1, 1, 1}};

    int Nueve[][] = {{1, 1, 1},
    {1, 0, 1},
    {1, 1, 1},
    {0, 0, 1},
    {1, 1, 1}};

    int read[][] = {{0, 0, 0},
    {0, 0, 0},
    {0, 0, 0},
    {0, 0, 0},
    {0, 0, 0}};

    public int comparar() {

        int n = -1;

        boolean igual = true;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (read[i][j] != zero[i][j]) {
                    igual = false;
                }
            }
        }

        if (igual) {
            n = 0;
        }

        igual = true;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (read[i][j] != Uno[i][j]) {
                    igual = false;
                }
            }
        }

        if (igual) {
            n = 1;
        }

        igual = true;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (read[i][j] != Dos[i][j]) {
                    igual = false;
                }
            }
        }
        if (igual) {
            n = 2;
        }
        igual = true;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (read[i][j] != Tres[i][j]) {
                    igual = false;
                }
            }
        }

        if (igual) {
            n = 3;
        }
        igual = true;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (read[i][j] != Cuatro[i][j]) {
                    igual = false;
                }
            }
        }

        if (igual) {
            n = 4;
        }
        igual = true;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (read[i][j] != Cinco[i][j]) {
                    igual = false;
                }
            }
        }

        if (igual) {
            n = 5;
        }
        igual = true;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (read[i][j] != Seis[i][j]) {
                    igual = false;
                }
            }
        }

        if (igual) {
            n = 6;
        }
        igual = true;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (read[i][j] != Siete[i][j]) {
                    igual = false;
                }
            }
        }

        if (igual) {
            n = 7;
        }
        igual = true;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (read[i][j] != Ocho[i][j]) {
                    igual = false;
                }
            }
        }

        if (igual) {
            n = 8;
        }
        igual = true;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (read[i][j] != Nueve[i][j]) {
                    igual = false;
                }
            }
        }

        if (igual) {
            n = 9;
        }
        igual = true;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                read[i][j] = 0;
            }
        }

        return n;

    }

}
