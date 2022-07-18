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
public class TablaPosicion {
    private String nombreEquipo;
    private double partidosJugados;
    private double partidosPerdidos;
    private double partidosEmpatados;

    //Constructor Sin Parámetros
    public TablaPosicion() {
    }
    //Constructor Con Parámetros
    public TablaPosicion(String nombreEquipo, double partidosJugados, double partidosPerdidos, double partidosEmpatados) {
        this.nombreEquipo = nombreEquipo;
        this.partidosJugados = partidosJugados;
        this.partidosPerdidos = partidosPerdidos;
        this.partidosEmpatados = partidosEmpatados;
    }
    /**
     * @return the nombreEquipo
     */
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    /**
     * @param nombreEquipo the nombreEquipo to set
     */
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    /**
     * @return the partidosJugados
     */
    public double getPartidosJugados() {
        return partidosJugados;
    }

    /**
     * @param partidosJugados the partidosJugados to set
     */
    public void setPartidosJugados(double partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    /**
     * @return the partidosPerdidos
     */
    public double getPartidosPerdidos() {
        return partidosPerdidos;
    }

    /**
     * @param partidosPerdidos the partidosPerdidos to set
     */
    public void setPartidosPerdidos(double partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    /**
     * @return the partidosEmpatados
     */
    public double getPartidosEmpatados() {
        return partidosEmpatados;
    }

    /**
     * @param partidosEmpatados the partidosEmpatados to set
     */
    public void setPartidosEmpatados(double partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }
    
}
