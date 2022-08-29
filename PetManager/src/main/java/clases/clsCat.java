/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Asus
 */
public class clsCat extends clsPet {
    private String breed;

    public clsCat(String breed, String code, String name, int born_year, String color, String healt_status) {
        super(code, name, born_year, color, healt_status);
        this.breed = breed;
    }
    
    
    
    public void SelfCleaning(){
        System.out.println("El gato"+super.getName()+ "se esta limpiando");
    }

    @Override
    public void Sound(){
        System.out.println("El gato "+super.getName()+"hace miaauu");
    }
     @Override
    public int getNumberOfBones(){
        return 230;
    }
     @Override
     public String getAnimalType(){
         return "Gato";
     }
    
    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }
}
