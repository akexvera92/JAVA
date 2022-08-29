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
public class Polymorphism {
    public static void main(String[] args) {
        //Instancias de las clases hijas
        clsDog dog = new clsDog("Criollo",false, "001", "Firulais", 2013, "Negro", "Sano");
        clsCat cat = new clsCat("Angora","002", "minino", 2010, "Blanco y negro", "Enfermo" );
        //Instacia de verinarias y de doctor
        clsDoctor doctor = new clsDoctor("Maria fernandez","1070");
        clsVeterinary veterinary = new clsVeterinary("Veterinaria UDC", "3102532052","Calle 20c#1a03", doctor);
        
        String careDog= veterinary.PetCare(dog);
        System.out.println("El estado de salud de "+dog.getName()+" es "+careDog);
        
          String careCat= veterinary.PetCare(cat);
        System.out.println("El estado de salud de "+cat.getName()+" es "+careCat);
    }
}
