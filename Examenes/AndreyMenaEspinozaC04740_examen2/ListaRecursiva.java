
/**
 * 
 */
class ListaRecursiva  {
    private NodoRecursivo primero;
    
    public ListaRecursiva() {
        primero = null;
    }
    
    public NodoRecursivo getPrimero() {
        return primero;
    }

    public boolean estarVacia() {
        boolean resultado = false;
        if (primero == null) {
            resultado = true;
        }
        return resultado;
    }

    public void insertarFinal(int elEntero) {
        if (primero == null) {
            NodoRecursivo nodoNuevo = new NodoRecursivo(elEntero);
            primero = nodoNuevo;
        }else{
            primero.getSiguiente().insertarFinal(elEntero);
        }
    }

    public String toString() {
        String resultado = "";
        if (!this.estarVacia()) {
            resultado = primero.getEntero() +"\n";
            resultado += primero.getSiguiente().toString();
        }
        return resultado;
    }

    // PREGUNTA 1 DEL EXAMEN
    public int buscarCuantos(int elBuscado) {
        int resultado = 0;
        if (primero!=null) {
            if (primero ==) {
            }
        }
        
        return resultado;
    }
    
    // PREGUNTA 2 DEL EXAMEN
    public boolean tenerSoloPositivos() {
        return true; // Quitar esta línea cuando programe el método
    }
}