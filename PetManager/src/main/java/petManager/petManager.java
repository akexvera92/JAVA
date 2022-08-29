/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petManager;

import clases.*;
import java.util.Date;

/**
 *
 * @author Angie Chica
 */
public class petManager {
    public static void main(String[] args) {
        clsDog dog1 = new clsDog("Criollo",false, "001", "Firulais", 2013, "Negro", "Sano");
        clsCat cat1 = new clsCat("Angora","002", "minino", 2010, "Blanco y negro", "Enfermo" );
        
        Date fecha_actual = new Date();
        int anioActual = fecha_actual.getYear();
        
        int agePet1 = anioActual - dog1.getBorn_year();
        int agePet2 = anioActual - cat1.getBorn_year();
        
        if (agePet1 > agePet2) {
            System.out.println("La mascota " +dog1.getName()+ " Es mayor que la mascota "+ cat1.getName());
        }else{
            if (agePet2> agePet1) {
                System.out.println("La mascota "+cat1.getName()+ "Es mayor que la mascota "+ dog1.getName());
            }else{
                System.out.println("La mascota "+ dog1.getName()+ "Tiene la misma edad que la mascota "+ cat1.getName());
            }
        }  
        dog1.Eat();
        
       cat1.Eat();
       cat1.Move();
       cat1.Sound();
       dog1.WalkAround();
       cat1.SelfCleaning();
       
    } 
}
