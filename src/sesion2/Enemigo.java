/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion2;

/**
 *
 * @author Estudiante
 */
public class Enemigo {

    /**
     * @return las vidas del enemigo
     */
    public int getVidas() {
        return vidas;
    }

    /**
     * @param vidas las nuevas vidas del enemigo
     */
    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Enemigo(int vidas, int tipo, int nivel) {
        this.vidas = vidas;
        this.tipo = tipo;
        this.nivel = nivel;
    }
    public Enemigo(){
    
    }
    private int vidas;
    private int tipo;
    private int nivel;
    
}
