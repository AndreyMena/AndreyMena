
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
     * Inicializa el arbol con su raiz.
     */
    public Arbol()
    {
        raiz = null;
    }
    
    /*
     * Este metodo verifica si un nodo esta vacio.
     * @return resultado
     */
    public boolean estarVacio() 
    {
        boolean resultado = false;
        if (raiz==null) {
            resultado = true;
        }
        return resultado;
    }
    
    /*
     * Este metodo agrega un objeto de tipo Palabra al arbol.
     * @param palabraNueva
     */
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
    
    /*
     * Este metodo cuenta las veces que se encuentra una palabra en el programa.
     * @param palabra
     * @return resultado las veces que se encontraba la palabra
     */
    public int contarPalabra(Palabra palabra)
    {
        int resultado = 0;
        NodoArbol aux = raiz;
        if (this.estarVacio()) {
            resultado = 0;
        }else{
            if (palabra.getPalabra().compareTo(raiz.getPalabra().getPalabra())<0) {
                resultado = raiz.getIzquierdo().contarPalabra(palabra);
            }else{
                if (palabra.getPalabra().compareTo(raiz.getPalabra().getPalabra())>0) {
                    resultado = raiz.getDerecho().contarPalabra(palabra);
                }else{
                    if (palabra.getPalabra().compareTo(raiz.getPalabra().getPalabra())==0){
                        resultado = raiz.getDerecho().contarPalabra(palabra)+1;
                    }
                }
            }
        }
        return resultado;
    }
    
    /*
     * Este metodo devuelve el contenido de todo el arbol nodo por nodo alfabeticamente, osea en orden izquierda, raiz, derecha.
     * @param arbol
     * @return resultado Todas las palabras del arbol alfabeticamente y una en cada linea.
     */
    public String toString(Arbol arbol) {
        String resultado= "";
        String subSolucion = "";
        Arbol aux = arbol;
        if (arbol.estarVacio()==true) {
            return "";
        }else{
            if (aux.getNodo().getIzquierdo().estarVacio()==false) {
                subSolucion = this.toString(aux.getNodo().getIzquierdo());
                resultado += subSolucion;
            }
            resultado += aux.getNodo().getPalabra().getPalabra()+ "\n";
            if (aux.getNodo().getDerecho().estarVacio()==false) {
                subSolucion = this.toString(aux.getNodo().getDerecho());
                resultado += subSolucion;
            }
        }
        return resultado;
    }
    
    /*
     * Devuelve el nodo
     * @return raiz.
     */
    public NodoArbol getNodo() {
        return raiz;
    }
}
