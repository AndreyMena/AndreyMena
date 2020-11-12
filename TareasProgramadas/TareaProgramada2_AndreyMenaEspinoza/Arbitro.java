
/**
 * Programación1
 * TareaProgramada2
 * @author (AndreyMenaEspinoza Carné: C04740)
 * @version (1.1) 
 * Esta clase maneja las funcionalidades del programa. 
 */
public class Arbitro
{
    private final String TITULO;
    private Interfaz interfaz;
    private Lista lista;
    private BaseDeDatos baseDeDatos;
    public Arbitro(String elTitulo)
    {
        TITULO = elTitulo;
        interfaz = new Interfaz(TITULO);
        lista = new Lista();
        baseDeDatos = new BaseDeDatos();
        this.llenarListaEnlazada();
    }
    
    public void llenarListaEnlazada(){
        for (int i = 0; i<51;i++) {
            PalabraReservada palabraReservada = baseDeDatos.getPalabraReservada(i);
            lista.agregarPalabraReservada(palabraReservada);
        }
    }
    
    public void empezar() 
    {        
    }
}