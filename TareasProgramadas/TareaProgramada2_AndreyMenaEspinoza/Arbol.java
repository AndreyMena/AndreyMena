
/**
 * Programación1
 * TareaProgramada2
 * @author (AndreyMenaEspinoza Carné: C04740)
 * @version (1.1) 
 * Esta clase representa un arbol con sus nodos que contienen palabras
 */
public class Arbol
{
    NodoArbol raiz;
    /**
     * Constructor for objects of class Arbol
     */
    public Arbol()
    {
        raiz = null;
    }
    
    public boolean estarVacio() 
    {
        boolean resultado = false;
        if (raiz==null) {
            resultado = true;
        }
        return resultado;
    }
    
    public void agregar(Palabra palabraNueva)
    {
        if (this.estarVacio()) {
            NodoArbol nodoNuevo = new NodoArbol(palabraNueva);
            raiz = nodoNuevo;
        }else{
            if (palabraNueva.getPalabra().compareTo(raiz.getPalabra().getPalabra())<0) {
                raiz.getIzquierdo().agregar(palabraNueva);
            }else{
                raiz.getDerecho().agregar(palabraNueva);
            }
        }
    }
    
    public int contarPalabra(Palabra palabra)
    {
        int resultado = 0;
        
        return resultado;
    }
    
    public String toString(Arbol arbol) {
        String resultado= "";
        String subSolucion = "";
        NodoArbol aux = new NodoArbol(arbol.getNodo().getPalabra());
        if (arbol.estarVacio()==true) {
            return "";
        }else{
            if (aux.getIzquierdo().estarVacio()==false) {
                subSolucion = this.toString(aux.getIzquierdo());
                resultado += subSolucion;
            }
            resultado += aux.getPalabra().getPalabra();
            if (aux.getDerecho().estarVacio()==false) {
                subSolucion = this.toString(aux.getDerecho());
                resultado += subSolucion;
            }
        }
        return resultado;
    }
    
    public NodoArbol getNodo() {
        return raiz;
    }
}
