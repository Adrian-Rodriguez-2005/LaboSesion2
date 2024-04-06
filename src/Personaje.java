/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiante
 */
public class Personaje extends Elemento {

    /**
     * @return the vida
     */
    
     public Personaje(){} 
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    public Personaje(int vida , int nivel) {
        super(nivel);
        this.vida = vida;
        
    }
    
    private int vida;
    
  
   
}
