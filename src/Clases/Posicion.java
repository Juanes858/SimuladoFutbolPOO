/**
 * @Title: Proyecto Final POO _ Simulador de Fútbol.
 * @Description: Ejercicio de solución al Simulador de Fútbol de POO.
 * @Version: 0.0.1
 * @date: No específica.
 * @Author: Daniel Fernando Gómez Ramírez y Juan esteban Acosta Aguirre. UTC_POO.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author daniel y juanes.
 */

/*
hacer blog de notas con un contenido parecido a este:
portero;defensa
defensa central;defensa
lateral;defensa
*/
public class Posicion {
    
    private String nombrePosicion;
    private String posicionCampo;
    
    
    //Constructor Sin Parámetros.
    public Posicion() {
    }
    //Constructor Con Parámetros.
    public Posicion(String nombrePosicion, String posicionCampo) {
        this.nombrePosicion = nombrePosicion;
        this.posicionCampo = posicionCampo;
    }
    //Metodos get & set
    /**
     * @return the nombrePosicion
     */
    public String getNombrePosicion() {
        return nombrePosicion;
    }

    /**
     * @param nombrePosicion the nombrePosicion to set
     */
    public void setNombrePosicion(String nombrePosicion) {
        this.nombrePosicion = nombrePosicion;
    }

    /**
     * @return the posicionCampo
     */
    public String getPosicionCampo() {
        return posicionCampo;
    }

    /**
     * @param posicionCampo the posicionCampo to set
     */
    public void setPosicionCampo(String posicionCampo) {
        this.posicionCampo = posicionCampo;
    }
        
    
}
