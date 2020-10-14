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
    private Tablero tablero;
    private String mensaje; 
    private int filas;
    private int columnas;
    private final String[] OPCIONES1 = {"OK"};
    private final String[] OPCIONES2 = {"Tirar dado"};
    private int intentos;
    private int posicion1;
    private int posicion2;
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
        mensaje += "\n El dado saco: "+dado;
        mensaje += "\nPosición temporal al avanzar por el valor del dado (fila, columna): ("posicion1,posicio2")";
        do {
            dado = tirarDado();
            opcionJuego = interfaz.mostrarJuegoConOpciones(cadena,OPCIONES2);
        }while(opcionJuego != 0 && verificador == false);

    }
    
    public String actualizarMensaje() 
    {
        dado = tirarDado();
        mensaje += "\n El dado saco: "+dado;
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