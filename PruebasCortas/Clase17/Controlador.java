
/**
 * Write a description of class Controlador here.
 * 
 * @author (Andrey Mena Espinoza) 
 * @version (1.1)
 */
public class Controlador
{
    private Experto experto;
    private Interfaz interfaz;
    private final String TITULO = "Andrey Mena Espinoza";
    private final String MENSAJE_OPCION1 = "Escoja un opcion";
    private final String[] MENU_OPCIONES1 = {"Jugar", "Ayuda", "Salir"};
    private final String[] MENU_OPCIONES2 = {"1", "2", "3", "4", "5", "6", "7", "8"};
    private final String MENSAJE_OPCION2 = "De cuantas filas quiere que sea la matriz";
     /**
     * Constructor for objects of class Controlador
     */
    public Controlador()
    {   
        experto = new Experto(TITULO);
        interfaz = new Interfaz(TITULO);
    }

    public void iniciar()
    {
        int opcion;
        int opcion2;
        do {
            opcion = interfaz.pedirOpcion(MENU_OPCIONES1, MENSAJE_OPCION1);
            switch (opcion) {
                case 0:
                opcion2 = interfaz.pedirOpcion(MENU_OPCIONES2 , MENSAJE_OPCION2);
                experto.jugar(opcion2);
                break;
                case 1:
                experto.mostrarAyuda();
                break;
            }
        }while(opcion != 2);
    }
    
    public static void main(String[] parametros)
    {
        Controlador controlador;
        controlador = new Controlador();
        controlador.iniciar();
    }
}
