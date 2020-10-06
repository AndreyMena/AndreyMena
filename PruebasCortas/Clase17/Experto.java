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
    private int filas;
    private int columnas;
    /**
     * Constructor for objects of class Experto
     */
    public Experto(String TITULO)
    {
        interfaz = new Interfaz(TITULO);
    }

    public void jugar(int lasfilas) 
    {
        filas = lasfilas+1;
        columnas = filas;
        matriz = new int[filas][columnas];
        this.toString();
    }
    
    public String toString()
    {
        String resultado = "";
        String cadena = "";
        int numero;
        this.LlenarMatriz();
                  
        for (int i = 0; i < filas; ++i) {
                for (int j = 0; j < columnas; ++j) {
                if (matriz[i][j] == matriz[i][0]) {
                    resultado = "\t"+matriz[i][j]+"";
                }
                if (matriz[i][j] == matriz[i][columnas]) {
                    resultado = "\n"+matriz[i][j]+"";
                }
            }
        }  
        
        
        
        return resultado;
    }
    
    public void LlenarMatriz()
    {
        Random randomizador;
        randomizador = new Random();
        int asignador;
        
        for (int i = 0; i < filas; ++i) {
                for (int j = 0; j < columnas; ++j) {
                asignador = randomizador.nextInt(filas*columnas-1);                
                for (int f = 0; f < columnas; f++) {
                        for (int g = 0; g < columnas; g++) {
                            if (matriz[i][j] == asignador) {
                                if (j != 0) {
                                    j--;
                                }else{
                                    i--;
                                }    
                            }else{
                                matriz[i][j] = asignador;
                            }
                    }
                }               
            }
        }
    }
    
    public void buscarNumero()
    {
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
