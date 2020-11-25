
/**
 * Examen 2 - CI0112 - Programación 1
 * @author Andrey Mena Espinoza C04740 y Profesora Maureen Murillo
 * @version 1.1
 */
class ListaDoble  {
    private NodoDoble primero;
    private NodoDoble ultimo;

    public ListaDoble() {
        primero = null;
        ultimo = null;
    }

    public NodoDoble getPrimero() {
        return primero;
    }

    public NodoDoble getUltimo() {
        return ultimo;
    }

    public boolean estarVacia() {
        boolean resultado = false;
        if (primero == null) {
            resultado = true;
        }
        return resultado;
    }

    public String toStringDerechoReves() {
        String resultado = "Al derecho:\n";
        NodoDoble nodoActual = primero;
        while (nodoActual != null) {
            resultado += nodoActual.getEntero() +"\n";
            nodoActual = nodoActual.getSiguiente();
        }

        resultado += "Al revés:\n";
        nodoActual = ultimo;
        while (nodoActual != null) {
            resultado += nodoActual.getEntero() +"\n";
            nodoActual = nodoActual.getAnterior();
        }

        return resultado;
    }

    // PREGUNTA 3 DEL EXAMEN
    public void insertarPenultimo(int elEntero) 
    {
        if (ultimo != null) {
            NodoDoble auxPenultimo = ultimo;
            int enteroAnterior = 0;
            if (ultimo.getAnterior()!=null&&ultimo.getAnterior().getAnterior()!=null) {
                
                ultimo.setAnterior(new NodoDoble(elEntero));
                ultimo.getAnterior().setSiguiente(ultimo);
                primero = ultimo.getAnterior();
            }else{
                if (ultimo.getAnterior()==null) {
                    enteroAnterior = ultimo.getEntero();
                    ultimo.setAnterior(new NodoDoble(elEntero));
                    primero = ultimo.getAnterior();
                    ultimo.setEntero(enteroAnterior);
                }else{
                    if (ultimo.getAnterior()!=null&& ultimo.getAnterior().getAnterior()!=null) {
                        auxPenultimo = ultimo.getAnterior();
                        enteroAnterior = ultimo.getAnterior().getEntero();
                        auxPenultimo.setEntero(elEntero);
                        NodoDoble anteriorNodo = new NodoDoble(enteroAnterior);
                        auxPenultimo.setSiguiente(anteriorNodo);
                        auxPenultimo.getSiguiente().setAnterior(auxPenultimo);
                
                        auxPenultimo.getSiguiente().setSiguiente(new NodoDoble(ultimo.getEntero()));
                        auxPenultimo.getSiguiente().getSiguiente().setAnterior(auxPenultimo.getSiguiente());
                
                        do {
                            auxPenultimo = auxPenultimo.getAnterior();
                        }while(auxPenultimo.getAnterior()!=null);
                        primero = auxPenultimo;
                        do {
                            auxPenultimo = auxPenultimo.getSiguiente();
                        }while(auxPenultimo.getSiguiente()!=null);
                        ultimo = auxPenultimo;
                    }
                }
            }
            
        }else{
            ultimo = new NodoDoble(elEntero);
            primero = new NodoDoble(elEntero);
        }
    }
}