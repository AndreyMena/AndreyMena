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
    private final String OPCIONES1 = {"OK"};
    private final String OPCIONES2 = {"Tirar dado"};
    
    public Arbitro(String elTitulo)
    {
        TITULO = elTitulo;        
        pregunta = "";
    }
    
    public void jugar(int opcion) 
    {
        filas = opcion;
        columnas = opcion;        
        tablero = new Tablero(opcion);
        mensaje = tablero.toString();
        cadena = new JTextArea(mensaje);
    }
    

}