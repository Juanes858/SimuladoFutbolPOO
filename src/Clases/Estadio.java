/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author Juanes
 */
public class Estadio {
    
    private String nombre;
    private String capacidad;
    private String ciudad;

    public Estadio() {
    }

    public Estadio(String nombre, String capacidad, String ciudad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.ciudad = ciudad;
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
     * @return the capacidad
     */
    public String getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void insertarEstadio() {
        String nombre;
        String capacidad;
        String ciudad;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el nombre del estadio:");
        nombre = sc.nextLine();
        System.out.println("Digite la capacidad del estadio:");
        capacidad = sc.nextLine();
        System.out.println("Digite la ciudad donde se enccuentra el estadio:");
        ciudad = sc.nextLine();

        this.nombre = nombre;
        this.capacidad = capacidad;
        this.ciudad = ciudad;

    }
    
    public void mostrarEstadio(){
        System.out.println("\nMOSTRAR ESTADIO");
        System.out.println("Nombre: "+getNombre()
                        +"\nCiudad: "+getCiudad()
                        +"\nCapacidad: "+getCapacidad());
    }
}
