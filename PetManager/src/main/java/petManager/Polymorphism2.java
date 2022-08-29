/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petManager;

import clases.*;


/**
 *
 * @author Asus
 */
public class Polymorphism2 {
    public static void main(String[] args) {
        clsDog dog = new clsDog("Criollo",false, "001", "Firulais", 2013, "Negro", "Sano");
        clsCat cat = new clsCat("Angora","002", "minino", 2010, "Blanco y negro", "Enfermo" );
        
        dog.Sound();
        cat.Sound();
    }
}
