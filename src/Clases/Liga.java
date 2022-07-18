/**
 * @Title: Proyecto Final POO _ Simulador de Fútbol.
 * @Description: Ejercicio de solución al Simulador de Fútbol de POO.
 * @Version: 0.0.1
 * @date: No específica.
 * @Author: Daniel Fernando Gómez Ramírez y Juan esteban Acosta Aguirre. UTC_POO.
 */
package Clases;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author daniel y juanes.
 */
public class Liga {
    private String pais;
    private String nombre;
    private String continente;
    private ArrayList<TablaPosicion> tablaPosiciones;
    private String equipoGanador;

    //Constructor Sin Parámetros
    public Liga() {
    }
    //Constructor Con Parámetros
    public Liga(String pais, String nombre, String continente, ArrayList<TablaPosicion> tablaPosiciones, String equipoGanador) {
        this.pais = pais;
        this.nombre = nombre;
        this.continente = continente;
        this.tablaPosiciones = tablaPosiciones;
        this.equipoGanador = equipoGanador;
    }
    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the continente
     */
    public String getContinente() {
        return continente;
    }

    /**
     * @param continente the continente to set
     */
    public void setContinente(String continente) {
        this.continente = continente;
    }

    /**
     * @return the tablaPosiciones
     */
    public ArrayList<TablaPosicion> getTablaPosiciones() {
        return tablaPosiciones;
    }

    /**
     * @param tablaPosiciones the tablaPosiciones to set
     */
    public void setTablaPosiciones(ArrayList<TablaPosicion> tablaPosiciones) {
        this.tablaPosiciones = tablaPosiciones;
    }

    /**
     * @return the equipoGanador
     */
    public String getEquipoGanador() {
        return equipoGanador;
    }

    /**
     * @param equipoGanador the equipoGanador to set
     */
    public void setEquipoGanador(String equipoGanador) {
        this.equipoGanador = equipoGanador;
    }
    
    public void insertarLiga(){
        String pais;
        String nombre;
        String continente;
        String equipoGanador;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cual es el pais de la liga?: ");
        pais = sc.nextLine();
        System.out.println("¿Cual es el nombre de la liga?: ");
        nombre = sc.nextLine();
        System.out.println("¿Cual es el continente de la liga?: ");
        continente = sc.nextLine();
        
        this.continente = continente;
        this.nombre = nombre;
        this.pais = pais;
    }
    
    public void mostrarLiga(){
        System.out.println("\nMOSTRANDO LIGA"
                + "\nNombre: "+getNombre()
                + "\nPais: "+getPais()
                + "\nContinente: "+getContinente());
    }
}
