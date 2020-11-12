
/**
 * Programación1
 * TareaProgramada2
 * @author (AndreyMenaEspinoza Carné: C04740)
 * @version (1.1) 
 * Esta clase representa cada nodo del arbol.
 */
public class NodoArbol
{
    Palabra palabra;
    Arbol derecho;
    Arbol izquierdo;
    /**
     * Constructor for objects of class Nodo
     */
    public NodoArbol(Palabra laPalabra)
    {
        palabra = laPalabra;
        derecho = new Arbol();
        izquierdo = new Arbol();
    }
    
    public void setPalabra(Palabra laPalabra) 
    {
        palabra = laPalabra;
    }
    
    public Palabra getPalabra() 
    {
        return palabra;
    }
    
    public void setDerecho(Arbol elDerecho) 
    {
        derecho = elDerecho;
    }
    
    public void setIzquierdo(Arbol elIzquierdo) 
    {
        izquierdo = elIzquierdo;
    }
    
    public Arbol getDerecho() 
    {
        return derecho;
    }
    
    public Arbol getIzquierdo() 
    {
        return izquierdo;
    }
}
