
/**
 * Clase que simula un tablero.
 * 
 * @author (Andrey Mena Espinoza C04740) 
 * @version (1.1)
 */
public class Tablero
{
    private Instruccion[][] tablero;
    private String[][] mensaje;
    private int filas;
    private int columnas;

    /**
     * Constructor for objects of class Tablero
     */
    public Tablero(int opcion)
    {
        filas = opcion;
        columnas = opcion;
        tablero = new Instruccion[filas][columnas];
        mensaje = new String[filas][columnas];
        this.llenarMatriz();
    }
    
    public void llenarMatriz(){
        for (int i= 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                Instruccion instruccion = new Instruccion();
                tablero[i][j] = instruccion;
                mensaje[i][j] = instruccion.darIdentificador();                
            }
        }
    }
    
    public String toString()
    {
        String resultado = "";
        int i = 0;
        int j = 0;
        for (i = 0; i < filas; ++i) {
            for (j = 0; j < columnas; ++j) {
                resultado = resultado+mensaje[i][j]+"\t";
            }
            resultado = resultado + "\n";
        }
        resultado = resultado + "\n";
        resultado += "1-No se mueva\n";
        resultado += "2-Avance 4 lugares\n";
        resultado += "3-Brinque a la próxima fila\n";
        resultado += "4-Retroceda 2 lugares\n";
        resultado += "5-¡Explotó! Fin del juego\n";
        return resultado;
    }

}
