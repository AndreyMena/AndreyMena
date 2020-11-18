
/**
 * Programación1
 * TareaProgramada2
 * @author (AndreyMenaEspinoza Carné: C04740)
 * @version (1.1) 
 * Esta clase representa un nodo perteneciente a un arbol.
 */
public class NodoArbol
{
    Palabra palabra;
    Arbol derecho;
    Arbol izquierdo;
    /**
     * Inicializa el nodo con sus campos.
     * @param laPalabra
     */
    public NodoArbol(Palabra laPalabra)
    {
        palabra = laPalabra;
        derecho = new Arbol();
        izquierdo = new Arbol();
    }
    
    /*
     * Coloca o cambia la palabra.
     * @param laPalabra
     */
    public void setPalabra(Palabra laPalabra) 
    {
        palabra = laPalabra;
    }
    
    /*
     * Devuelve la palabra.
     * @return palabra
     */
    public Palabra getPalabra() 
    {
        return palabra;
    }
    
    /*
     * Coloca o cambia el arbol derecho.
     * @param elDerecho
     */
    public void setDerecho(Arbol elDerecho) 
    {
        derecho = elDerecho;
    }
    
    /*
     * Coloca o cambia el arbol izquierdo.
     * @param elIzquierdo
     */
    public void setIzquierdo(Arbol elIzquierdo) 
    {
        izquierdo = elIzquierdo;
    }
    
    /*
     * Devuelve el arbol derecho.
     * @return derecho
     */
    public Arbol getDerecho() 
    {
        return derecho;
    }
    
    /*
     * Devuelve el arbol izquierdo.
     * @return izquierdo
     */
    public Arbol getIzquierdo() 
    {
        return izquierdo;
    }
}
