/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import Interfaces.*;

/**
 *
 * @author Angie Chica
 */
public class clsPet implements IAnimal,IVertebrate {
    private String code;
    private String name;
    private int born_year;
    private String color;
    private String healt_status;
    private clsVeterinary Veterinary;
    
    

    public clsPet(String code, String name, int born_year, String color, String healt_statua) {
        this.code = code;
        this.name = name;
        this.born_year = born_year;
        this.color = color;
        this.healt_status = healt_statua;
    }

  public void Eat(){
        System.out.println("La macota "+ this.name+ " esta comiendo");
    }
    
    public void Move(){
        System.out.println("La macota "+ this.name+ " esta moviendose");
    }
    
    public void Sound(){
        System.out.println("La macota "+ this.name+ " esta realizando un ruido");
    }
    
    
    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the born_year
     */
    public int getBorn_year() {
        return born_year;
    }

    /**
     * @param born_year the born_year to set
     */
    public void setBorn_year(int born_year) {
        this.born_year = born_year;
    }



    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }


    public void setCode(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the healt_status
     */
    public String getHealt_status() {
        return healt_status;
    }

    /**
     * @param healt_status the healt_status to set
     */
    public void setHealt_status(String healt_status) {
        this.healt_status = healt_status;
    }

    /**
     * @return the Veterinary
     */
    public clsVeterinary getVeterinary() {
        return Veterinary;
    }

    /**
     * @param Veterinary the Veterinary to set
     */
    public void setVeterinary(clsVeterinary Veterinary) {
        this.Veterinary = Veterinary;
    }

    @Override
    public String getAnimalType() {
        return "Domestico";
                }

    @Override
    public int getNumberOfBones() {
     return 0;
    }
}
