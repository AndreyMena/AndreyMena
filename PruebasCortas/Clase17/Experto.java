import javax.swing.JTextArea;
import java.util.Random;
/**
 * Write a description of class Experto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Experto
{
    private Interfaz interfaz;
    private int[][] matriz;
    private int[] numerosElegidos;
    private int filas;
    private int columnas;
    private int contador;
    private int[] arregloSinRepetidos;
    private JTextArea cadena;
    private boolean verificaZeros;
    /**
     * Constructor for objects of class Experto
     */
    public Experto(String TITULO)
    {
        interfaz = new Interfaz(TITULO);
        contador = 0;
        verificaZeros = false;
    }

    public void jugar(int lasfilas) 
    {
        filas = lasfilas+1;
        columnas = filas;
        matriz = new int[filas][columnas];
        this.llenarMatriz();
        String mensaje = this.toString();
        cadena = new JTextArea(mensaje);
        interfaz.decirMensaje(cadena);
    }

    public String toString()
    {
        String resultado = "";
        int i = 0;
        int j = 0;
        for (i = 0; i < filas; ++i) {
            for (j = 0; j < columnas; ++j) {
                resultado = resultado+matriz[i][j] + "\t";
            }
            resultado = resultado + "\n";
        }
        return resultado;
    }

    public void llenarMatriz()
    {
        Random randomizador;
        randomizador = new Random();
        int asignador;
        int cantidad = (filas*columnas);        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                asignador = randomizador.nextInt(cantidad);
                while (revisarRepeticiones(asignador, i, j) == false) {
                    asignador = randomizador.nextInt(cantidad);                    
                }
                matriz[i][j] = asignador;
            }
        }        
    }
    
    public boolean revisarRepeticiones(int elAsignador,int i, int j) 
    {
        int asignador = elAsignador;
        for (int f = 0; f < filas; f++) {
            for (int g = 0; g < columnas; g++) {
                if (asignador == 0 && matriz[i][j] == 0 && verificaZeros == false) {
                    verificaZeros = true;
                    return true;
                }
                if (asignador == matriz[f][g]) {
                    return false;
                }
                
            }
        }
        return true;
    }

    public void buscarNumero()
    {
        for (int i = 0; i < filas; i++) {
            i--;
        }
    }

    public void devolverVecinos()
    {
    }

    public void LlenarCaracol() 
    {
    }

    public void mostrarAyuda() 
    {
    }
}
