
class NodoRecursivo {
    private int entero;
    private ListaRecursiva siguiente;
    
    public NodoRecursivo(int elEntero) {
        entero = elEntero;
        siguiente = new ListaRecursiva();
    }

    public int getEntero() {
        return entero;
    }

    public ListaRecursiva getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(ListaRecursiva elSiguiente) {
        siguiente = elSiguiente;
    }
    
    public void setEntero(int elEntero) {
        entero = elEntero;
    }
}