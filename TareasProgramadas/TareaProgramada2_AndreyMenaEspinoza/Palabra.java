
/**
 * Programación1
 * TareaProgramada2
 * @author (AndreyMenaEspinoza Carné: C04740)
 * @version (1.1) 
 * Esta clase contiene una palabra, puede ser reservada del lenguaje Java, o no.
 */
public class Palabra
{
    private String palabra;
    public Palabra(String laPalabra)
    {
        palabra = laPalabra;
    }
    
    public void setPalabra(String laPalabra) {
        palabra = laPalabra;
    }
    
    public String getPalabra() {
        return palabra;
    }
}
