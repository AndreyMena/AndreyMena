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
        matriz = new int[filas][filas];
        this.LlenarMatriz(filas);
        this.toString();
    }
    
    public String toString()
    {
        String resultado = "";
        String cadena = "";
        int numero;
                  
        for (int i = 0; i < filas; ++i) {
                for (int j = 0; j < filas; ++j) {
                if (matriz[i][j] == matriz[i][0]) {
                    resultado += "\t"+matriz[i][j]+"";
                }
                if (matriz[i][j] == matriz[i][filas]) {
                    resultado += "\n"+matriz[i][j]+"";
                }
            }
        }  
        
        
        
        return resultado;
    }
    
    public void LlenarMatriz(int filas)
    {
        Random randomizador;
        randomizador = new Random();
        int contador = 0;
        for (int i = 0; i < filas; ++i) {
                for (int j = 0; j < filas; ++j) {
                int asignador;
                asignador = randomizador.nextInt(filas * filas - 1); 
                matriz[i][j] = asignador;
                for (int f = 0; f < filas; f++) {
                        for (int g = 0; g < filas; g++) {
                            if (matriz[f][g] == asignador) {
                                contador++;
                                if (j != 0 && contador > 1) {
                                    j--;
                                }else{
                                    if (j == 0 && contador > 1){
                                        i--;
                                    }
                                } 
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
