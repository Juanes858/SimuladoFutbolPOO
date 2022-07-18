/**
 * @Title: Proyecto Final POO _ Simulador de Fútbol.
 * @Description: Ejercicio de solución al Simulador de Fútbol de POO.
 * @Version: 0.0.1
 * @date: No específica.
 * @Author: Daniel Fernando Gómez Ramírez y Juan esteban Acosta Aguirre. UTC_POO.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author daniel y juanes.
 */
public class Jugador {

    
    private String nacionalidad;
    private String nombre;
    private String nombrePosicion;
    private double defensa;
    private double ataque;
    private double velocidad;
    private double controlBalon;
    private double pase;
    private double regate;
    private double tiro;
    static double media;

    //Constructor Sin Parámetros.
    public Jugador() {
    }
    //Constructor Con Parámetros.
    public Jugador(String nacionalidad, String nombre, double defensa, double ataque, double velocidad, double controlBalon, double pase, double regate, double tiro, String nombrePosicion) {
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
        this.defensa = defensa;
        this.ataque = ataque;
        this.velocidad = velocidad;
        this.controlBalon = controlBalon;
        this.pase = pase;
        this.regate = regate;
        this.tiro = tiro;
        this.nombrePosicion = nombrePosicion;
    }
    //metodos get & set
    /**
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
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
     * @return the defensa
     */
    public double getDefensa() {
        return defensa;
    }

    /**
     * @param defensa the defensa to set
     */
    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    /**
     * @return the ataque
     */
    public double getAtaque() {
        return ataque;
    }

    /**
     * @param ataque the ataque to set
     */
    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    /**
     * @return the velocidad
     */
    public double getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * @return the controlBalon
     */
    public double getControlBalon() {
        return controlBalon;
    }

    /**
     * @param controlBalon the controlBalon to set
     */
    public void setControlBalon(double controlBalon) {
        this.controlBalon = controlBalon;
    }

    /**
     * @return the pase
     */
    public double getPase() {
        return pase;
    }

    /**
     * @param pase the pase to set
     */
    public void setPase(double pase) {
        this.pase = pase;
    }

    /**
     * @return the regate
     */
    public double getRegate() {
        return regate;
    }

    /**
     * @param regate the regate to set
     */
    public void setRegate(double regate) {
        this.regate = regate;
    }

    /**
     * @return the tiro
     */
    public double getTiro() {
        return tiro;
    }

    /**
     * @param tiro the tiro to set
     */
    public void setTiro(double tiro) {
        this.tiro = tiro;
    }

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
    
    public void insertarDatos(){
        String nombre;
        String nacionalidad;
        String nombrePocision;
        double defensa;
        double ataque;
        double velocidad;
        double controlBalon;
        double pase;
        double regate;
        double tiro;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nINGRESAR DATOS JUGADOR");
        System.out.println("Digite el nombre del jugador: ");
        nombre = sc.next();
        System.out.println("Digite la nacionalidad del jugador : ");
        nacionalidad = sc.next();
        System.out.println("Posiciones disponibles:"
                + "\n-.portero"
                + "\n-.defensaCentral"
                + "\n-.lateral"
                + "\n-.mediocentroDefensivo"
                + "\n-.mediocentroOfensivo"
                + "\n-.volante"
                + "\n-.delantero"
                + "\n-.extremos"
                + "\nDigite la posicion del jugador: ");
        nombrePocision = sc.next();
        System.out.println("Digite el vlor numerico de la defensa: ");
        defensa = sc.nextDouble();
        System.out.println("Digite el vlor numerico del ataque: ");
        ataque = sc.nextDouble();
        System.out.println("Digite el vlor numerico de la velocidad: ");
        velocidad= sc.nextDouble();
        System.out.println("Digite el vlor numerico del control del balon: ");
        controlBalon = sc.nextDouble();
        System.out.println("Digite el vlor numerico del pase: ");
        pase = sc.nextDouble();
        System.out.println("Digite el vlor numerico del regate: ");
        regate = sc.nextDouble();
        System.out.println("Digite el vlor numerico del tiro: ");
        tiro = sc.nextDouble();
        
        this.setAtaque(ataque);
        this.setControlBalon(controlBalon);
        this.setDefensa(defensa);
        this.setNacionalidad(nacionalidad);
        this.setNombre(nombre);
        setNombrePosicion(nombrePocision);
        this.setPase(pase);
        this.setRegate(regate);
        this.setTiro(tiro);
        this.setVelocidad(velocidad);
    }
    
    public void mostrarDatos(){
        System.out.println("JUGADOR: "+getNombre()
                    +"\nNombre: "+getNombre()
                    + "\nNacionalidad: "+getNacionalidad()
                    + "\nPosicion: "+getNombrePosicion()
                    + "\nMedia: "+ getMedia());
    }
    
    public double CalcularMediaDefensa(){
        double media;
        
        double ataque = this.getAtaque();
        double controlBalon = this.getControlBalon();
        double defensa = this.getDefensa();
        double pase = this.getPase();
        double regate = this.getRegate();
        double tiro = this.getTiro();
        double velocidad = this.getVelocidad();
        
        media = defensa*0.2+(velocidad*0.2)+(pase*0.2)+(ataque*0.1)+(controlBalon*0.1)+(regate*0.1)+(tiro*0.1);
        this.media = media;
        return media;
    }
    
    public double CalcularMediaMedio(){
        double media;
        
        double ataque = this.getAtaque();
        double controlBalon = this.getControlBalon();
        double defensa = this.getDefensa();
        double pase = this.getPase();
        double regate = this.getRegate();
        double tiro = this.getTiro();
        double velocidad = this.getVelocidad();
        
        media = (defensa*0.1)+(velocidad*0.1)+(pase*0.1)+(ataque*0.1)+(controlBalon*0.2)+(regate*0.2)+(tiro*0.1);
        this.media = media;
        return media;
    }
    
    public double CalcularMediaAtaque(){
        double media;
        
        double ataque = this.getAtaque();
        double controlBalon = this.getControlBalon();
        double defensa = this.getDefensa();
        double pase = this.getPase();
        double regate = this.getRegate();
        double tiro = this.getTiro();
        double velocidad = this.getVelocidad();
        
        media = (defensa*0.1)+(velocidad*0.2)+(pase*0.1)+(ataque*0.2)+(controlBalon*0.1)+(regate*0.1)+(tiro*0.2);
        this.media = media;
        return media;
    }
    
    public double CalcularMediaGeneral(){
        
        media = CalcularMediaAtaque()+CalcularMediaDefensa()+CalcularMediaMedio();
        System.out.println("La media general del jugador es: " + media);
        
        this.setMedia(media);
        return media;
    }

    /**
     * @return the media
     */
    public double getMedia() {
        return media;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(double media) {
        this.media = media;
    }
}
