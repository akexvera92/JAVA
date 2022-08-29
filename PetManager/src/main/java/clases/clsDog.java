/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Asus
 */
public class clsDog extends clsPet {
    private String breed;
    private boolean pedigree ;

    public clsDog(String breed, boolean pedigree, String code, String name, int born_year, String color, String healt_statua) {
        super(code, name, born_year, color, healt_statua);
        this.breed = breed;
        this.pedigree = pedigree;
    }

     public void WalkAround(){
        System.out.println("El perro "+super.getName()+ " esta caminando");
    }
    @Override
    public void Sound(){
        System.out.println("El perro "+super.getName()+" hace guauuu");
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

    /**
     * @return the pedigree
     */
    public boolean isPedigree() {
        return pedigree;
    }

    /**
     * @param pedigree the pedigree to set
     */
    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }

    
}
