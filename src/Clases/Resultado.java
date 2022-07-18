/**
 * @Title: Proyecto Final POO _ Simulador de Fútbol.
 * @Description: Ejercicio de solución al Simulador de Fútbol de POO.
 * @Version: 0.0.1
 * @date: No específica.
 * @Author: Daniel Fernando Gómez Ramírez y Juan esteban Acosta Aguirre. UTC_POO.
 */
package Clases;

/**
 *
 * @author daniel y juanes.
 */
public class Resultado {
    private String nombreEquipoLocal;
    private String nombreEquipoVisitante;
    private double golesEquipoLocal;
    private double golesEquipoVisitante;

    //Constructor Sin Parámetros.
    public Resultado() {
    }
    //Constructor Sin Parámetros.
    public Resultado(String nombreEquipoLocal, String nombreEquipoVisitante, double golesEquipoLocal, double golesEquipoVisitante) {
        this.nombreEquipoLocal = nombreEquipoLocal;
        this.nombreEquipoVisitante = nombreEquipoVisitante;
        this.golesEquipoLocal = golesEquipoLocal;
        this.golesEquipoVisitante = golesEquipoVisitante;
    }
    
    /**
     * @return the nombreEquipoLocal
     */
    public String getNombreEquipoLocal() {
        return nombreEquipoLocal;
    }

    /**
     * @param nombreEquipoLocal the nombreEquipoLocal to set
     */
    public void setNombreEquipoLocal(String nombreEquipoLocal) {
        this.nombreEquipoLocal = nombreEquipoLocal;
    }

    /**
     * @return the nombreEquipoVisitante
     */
    public String getNombreEquipoVisitante() {
        return nombreEquipoVisitante;
    }

    /**
     * @param nombreEquipoVisitante the nombreEquipoVisitante to set
     */
    public void setNombreEquipoVisitante(String nombreEquipoVisitante) {
        this.nombreEquipoVisitante = nombreEquipoVisitante;
    }

    /**
     * @return the golesEquipoLocal
     */
    public double getGolesEquipoLocal() {
        return golesEquipoLocal;
    }

    /**
     * @param golesEquipoLocal the golesEquipoLocal to set
     */
    public void setGolesEquipoLocal(double golesEquipoLocal) {
        this.golesEquipoLocal = golesEquipoLocal;
    }

    /**
     * @return the golesEquipoVisitante
     */
    public double getGolesEquipoVisitante() {
        return golesEquipoVisitante;
    }

    /**
     * @param golesEquipoVisitante the golesEquipoVisitante to set
     */
    public void setGolesEquipoVisitante(double golesEquipoVisitante) {
        this.golesEquipoVisitante = golesEquipoVisitante;
    }
    
    public static Double resultados(){
        return null;
        
    }
}
