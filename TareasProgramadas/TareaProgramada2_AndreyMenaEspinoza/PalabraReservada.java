
/**
 * Esta clase contiene la palabra reservada del lenguaje Java.
 * @author (AndreyMenaEspinoza C04740) 
 * @version (1.1)
 */
public class PalabraReservada
{
    private String palabra;
    public PalabraReservada(String laPalabra)
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
