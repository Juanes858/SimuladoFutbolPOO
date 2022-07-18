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
public class Equipo {
    
    private String nombre;
    private String pais;
    private String ciudad;
    static  Estadio estadio;
    static ArrayList<Jugador> jugadores;
    private static double media;

    //Constructor Sin Parámetros.
    public Equipo() {
    }
    //Constructor Con Parámetros.
    public Equipo(String nombre, String pais, String ciudad, Estadio estadio, ArrayList<Jugador> jugadores) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.estadio = estadio;
        this.jugadores = jugadores;
    }
    
    /**
     * @return the media
     */
    public static double getMedia() {
        return media;
    }

    /**
     * @param aMedia the media to set
     */
    public static void setMedia(double aMedia) {
        media = aMedia;
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

    /**
     * @return the estadio
     */
    

    /**
     * @return the jugadores
     */
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    /**
     * @param jugadores the jugadores to set
     */
    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    public void insertarEquipo(){
        String nombre;
        String pais;
        String ciudad;
        Estadio estadio = new Estadio();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nINSERTAR EQUIPO");
        System.out.println("Digite el nombre del equipo: ");
        nombre = sc.nextLine();
        System.out.println("Digite el pais del equipo: ");
        pais = sc.nextLine();
        System.out.println("Digite la ciudad del equipo: ");
        ciudad = sc.nextLine();
        
        
        Equipo.estadio = estadio;
        
        this.setNombre(nombre);
        this.setCiudad(ciudad);
        this.setPais(pais);
                
    }
    
    public void mostrarEquipos(){
        System.out.println("\nEQUIPO");
        System.out.println("El nombre del equipo es: "
                + getNombre()
                + "\nEl pais del equipo es: "
                + getPais()
                + "\nLa ciudad del equipo es: "
                + getCiudad()
                + "\nLa media del equipo es: "
                + calcularMedia());
    }
    
    public static double calcularMedia(){
        double media = 0;
        for (int i = 0; i < jugadores.size(); i++) {
            
            media = (media + jugadores.get(i).getMedia());
        }
        media = media / jugadores.size();
        setMedia(media);
        System.out.println(media);
        media = 0;
        return media;
        
    }
    
    

    /**
     * @return the estadio
     */
    public Estadio getEstadio() {
        return estadio;
    }

    /**
     * @param estadio the estadio to set
     */
    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
}
