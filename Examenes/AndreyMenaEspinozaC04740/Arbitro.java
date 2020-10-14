import javax.swing.JTextArea;
import java.util.Random;
/**
 * Programación1
 * Evaluacion1
 * @author AndreyMenaEspinoza Carné: C04740
 * @version 1.1
 * Esta clase maneja las funcionalidades del programa. 
 */
public class Arbitro
{
    private Interfaz interfaz;
    private final String TITULO;
    private JTextArea cadena;
    private String pregunta;
    private String[][] mensajeT;
    private Tablero tablero;
    private String mensaje;
    private String[] mensajeTablero;
    private int filas;
    private int columnas;
    private final String[] OPCIONES1 = {"OK"};
    private final String[] OPCIONES2 = {"Tirar dado"};
    private int intentos;
    private double posicion;
    private double posicionDef;
    private int dado;
    private boolean verificador;
    public Arbitro(String elTitulo)
    {
        TITULO = elTitulo;        
        pregunta = "";
        interfaz = new Interfaz(TITULO);
    }
    
    public void jugar(int opcion) 
    {
        filas = opcion;
        columnas = opcion;        
        tablero = new Tablero(opcion);
        mensaje = tablero.toString(); 
        mensajeT = new String[filas][columnas];
        mensajeT = tablero.devolverMensaje();
        mensaje = mensaje + "\n";
        mensaje += "1-No se mueva\n";
        mensaje += "2-Avance 4 lugares\n";
        mensaje += "3-Brinque a la próxima fila\n";
        mensaje += "4-Retroceda 2 lugares\n";
        mensaje += "5-¡Explotó! Fin del juego\n";
        intentos = interfaz.pedirNumeroIntento("Elija la cantidad de intentos");
        mensaje += "\nCantidad de intentos: "+intentos;
        cadena = new JTextArea(mensaje);
        int opcion2;
        do {
            opcion2 = interfaz.mostrarJuegoConOpciones(cadena,OPCIONES1);
        }while(opcion2 != 0);
        int opcion3;
        do {
            opcion3 = interfaz.mostrarJuegoConOpciones(cadena,OPCIONES2);
        }while(opcion3 != 0);
        int opcionJuego;
        dado = 0;
        do {
            dado = tirarDado();
            this.posicionar(dado);
            mensaje += "\n El dado saco: "+dado;
            mensaje += "\nPosición temporal al avanzar por el valor del dado (fila, columna): "+posicion;
            mensaje += "\nPosición definitiva al ejecutar la instrucción de la casilla: "+posicionDef;
            cadena = new JTextArea(mensaje);
            opcionJuego = interfaz.mostrarJuegoConOpciones(cadena,OPCIONES2);
            mensaje = tablero.toString(); 
        }while(verificador == false);

    }
    
    public double posicionar(int dado)
    {
        double valor =0.0;
        posicion = posicion+dado;
        int buscador = 0;
        int posicionF = 0;
        for (int i= 0; i < filas; i++) {
            for (int j = 0; j < filas; j++) {
                buscador++;  
                if (buscador == posicion) { 
                }
            }
        }
        return posicion;
    }
    
    
    public int tirarDado() 
    {
        Random randomizador = new Random(); 
        int asignador;
        asignador = randomizador.nextInt(6);
        asignador = asignador+1;
        return asignador;
    }
    

}