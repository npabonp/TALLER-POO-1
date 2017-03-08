/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Display;

/**
 *
 * @author gipao
 */
public class Main {
       public static void main(String[] args) {
        Cuartos ciudad = new Cuartos ();
        ciudad.escenario();
        NewMatriz mn = new NewMatriz (); 
        Robots leeNumeros = new Robots( ciudad.getCity(), mn );
        System.out.println(leeNumeros.recorrer());
        
        
       }
}
