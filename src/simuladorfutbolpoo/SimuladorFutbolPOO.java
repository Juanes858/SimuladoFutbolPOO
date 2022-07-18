/**
 * @Title: Proyecto Final POO _ Simulador de Fútbol.
 * @Description: Ejercicio de solución al Simulador de Fútbol de POO.
 * @Version: 0.0.1
 * @date: No específica.
 * @Author: Daniel Fernando Gómez Ramírez y Juan esteban Acosta Aguirre. UTC_POO.
 */
package simuladorfutbolpoo;

import Clases.Equipo;
import Clases.Estadio;
import Clases.Jugador;
import Clases.Liga;
import Clases.Posicion;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @version 2.0
 * @author daniel, juanes, juan david ballesteros y maria jose.
 */
public class SimuladorFutbolPOO {
    
    public static void main(String[] args) {
        
        ArrayList<Posicion> posiciones = new ArrayList<>();
        ArrayList<Equipo> equipos = new ArrayList<>();
        ArrayList<Liga> ligas = new ArrayList<>();
        ArrayList<Estadio> estadios = new ArrayList<>();
        ArrayList<Jugador> jugadores = new ArrayList<>();
        
        
        posiciones = leerPocision("..\\SimuladorFutbolPOO\\src\\Clases\\posiciones.txt");
        
        Scanner sc = new Scanner(System.in);
        
        int opcion = 0;
        int opcion1 = 0;
        while (opcion != 8) {
            System.out.println("\nSIMULADOR FUTBOL");
            System.out.println("¿Que desea hacer?"
                + "\n1. Digitar Equipo"
                + "\n2. Digitar jugador"
                + "\n3. Digitar Estadio"
                + "\n4. Digitar liga"
                + "\n5. Mostrar equipos"
                + "\n6. Mostrar estadios"
                + "\n7. Mostrar ligas"
                + "\n8. Salir");
            opcion = sc.nextInt();

            switch(opcion){
                case 1: //DIGITAR EQUIPO 
                    Equipo equipo = new Equipo();// Agregar un equipo a la lista
                    ArrayList<Jugador> jugadoresVacio = new ArrayList<>();
                    equipo.setJugadores(jugadoresVacio);
                    equipo.insertarEquipo();
                    equipos.add(equipo);
                    break;
                case 2: // DIGITAR JUGADOR
                    String nombre;
                    System.out.println("\nIngrese el nombre del equipo: ");
                    nombre = sc.next();
                    for (int iteradorEquipo = 0; iteradorEquipo < equipos.size(); iteradorEquipo++) {
                        if(equipos.get(iteradorEquipo).getNombre().equalsIgnoreCase(nombre)){
                            Jugador jugador = new Jugador();
                            jugador.insertarDatos();
                            equipos.get(iteradorEquipo).getJugadores().add(jugador);
                            for (int iteradorPosicion = 0; iteradorPosicion < posiciones.size(); iteradorPosicion++) {
                                //System.out.println("Posicion tabla: "+posiciones.get(iteradorPosicion).getNombrePosicion()+ "posicion jugador: "+jugador.getNombrePosicion());
                                if (posiciones.get(iteradorPosicion).getNombrePosicion().equalsIgnoreCase(jugador.getNombrePosicion())) {
                                    if(posiciones.get(iteradorPosicion).getPosicionCampo().equalsIgnoreCase("delantero")){
                                        jugador.CalcularMediaAtaque();
                                    }
                                    if(posiciones.get(iteradorPosicion).getPosicionCampo().equalsIgnoreCase("defensa")){
                                        jugador.CalcularMediaDefensa();
                                    }
                                    if(posiciones.get(iteradorPosicion).getPosicionCampo().equalsIgnoreCase("central")){
                                        jugador.CalcularMediaMedio();
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 3: //DIGITAR ESTADIO                    
                    System.out.println("\nIngrese el nombre del equipo: ");
                    nombre = sc.next();
                    for (int iteradorEquipo = 0; iteradorEquipo < equipos.size(); iteradorEquipo++) {
                        if(equipos.get(iteradorEquipo).getNombre().equalsIgnoreCase(nombre)){
                            equipos.get(iteradorEquipo).getEstadio().insertarEstadio();
                        }
                    }
                    break;
                case 4: //DIGITAR LIGA
                        Liga liga = new Liga();
                        liga.insertarLiga();
                        ligas.add(liga);
                    break;
                case 5: //MOSTRAR EQUIPO
                    System.out.println("\nEQUIPO");                        
                    System.out.println("Seleccione la opcion de lo que desea realizar: "
                            + "\n1. Ver listado de equipos"
                            + "\n2. Ver listado de jugadores de un equipo especificado"
                            + "\n3. Volver");
                    opcion1 = sc.nextInt();
                    switch(opcion1){
                        case 1: //MOSTRAR EQUIPOS
                            for(Equipo equipoO:equipos){ // mostrar equipos 
                                equipoO.mostrarEquipos();
                             }
                            break;
                        case 2: //MOSTRAR JUGADOR
                            System.out.println("Ingrese el nombre del equipo: ");
                            nombre = sc.next();
                            for (int iteradorEquipo = 0; iteradorEquipo < equipos.size(); iteradorEquipo++) {
                                if(equipos.get(iteradorEquipo).getNombre().equalsIgnoreCase(nombre)){
                                    for(Jugador jugadorO: equipos.get(iteradorEquipo).getJugadores()){
                                        jugadorO.mostrarDatos();
                                    }
                                }
                            }
                            break;
                        }
                break;
            case 6: //MOSTRAR ESTADIOS
                    System.out.println("\nIngrese el nombre del equipo: ");
                    nombre = sc.next();
                    for (int iteradorEquipo = 0; iteradorEquipo < equipos.size(); iteradorEquipo++) {
                        if(equipos.get(iteradorEquipo).getNombre().equalsIgnoreCase(nombre)){
                           equipos.get(iteradorEquipo).getEstadio().mostrarEstadio(); 
                        }
                    }
                break;
            case 7: //MOSTRAR LIGAS
                if(ligas.isEmpty()){
                    System.out.println("Por favor inserte una liga");
                }else{
                    for(Liga ligaO:ligas){
                        ligaO.mostrarLiga();
                    }
                }
                break;
            case 8: //SALIR
                System.out.println("\n==============================");
                System.out.println("Esta saliendo del programa...");
                System.out.println("==============================");
                break;
            }
        }
    }
    
    public static ArrayList<Posicion> leerPocision(String ruta){
        
        ArrayList<Posicion> posiciones = new ArrayList<>();
        
        try{
            File archivo = new File (ruta);
            FileReader  fr = new FileReader (archivo);
            BufferedReader  br = new BufferedReader(fr);
            
            String linea;
            String valores[];
            
            linea = br.readLine();
            
            while( linea != null )
            {
                valores = linea.split(";");
                
                Posicion posicion = new Posicion(valores[0], valores[1]);
                
                posiciones.add(posicion);
                
                //Obtiene la siguiente línea y la guarda en la variable linea
                linea = br.readLine();
                
            }

        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
        
        return posiciones;
    }
    
}
