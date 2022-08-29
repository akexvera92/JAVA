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
public class AbstractClass {
    public static void main(String[] args) {
        clsDoctor doctor = new clsDoctor("Maria fernandez","1070");
        clsVeterinary veterinary = new clsVeterinary("Veterinaria UDC", "3102532052","Calle 20c#1a03", doctor);
     
       
        
      veterinary.setData(veterinary.getName()+" - "+veterinary.getAddress());

        
      String data = veterinary.getHospitalInformation();
      String type= veterinary.getPatientType();
      String surgery = veterinary.Surgery();
      
        System.out.println("Data: "+data);
        System.out.println("type: "+type);
        System.out.println("surgery: "+surgery);
    }
    
}
