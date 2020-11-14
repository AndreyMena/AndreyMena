import java.io.File;
import java.util.Scanner;
import java.io.IOException;
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
    private final String[] MENU_OPCIONES_DE_ANALISIS = {"1","2","3","4","5","6","7"};
    private final String MENSAJE_OPCIONES;
    private Interfaz interfaz;
    private Lista lista;
    private BaseDeDatos baseDeDatos;
    private Arbol arbolPalabrasReservadas;
    private Arbol arbolPalabrasNormales;
    private File archivo;
    public Arbitro(String elTitulo)
    {
        TITULO = elTitulo;
        interfaz = new Interfaz(TITULO);
        lista = new Lista();
        baseDeDatos = new BaseDeDatos();
        archivo = null;
        this.llenarListaEnlazada();
        MENSAJE_OPCIONES = "Descripcion de cada opcion:\n"+
                           "1-Mostrar en orden alfabético ascendente todas las palabras reservadas que contiene el archivo\n"+
                           "2-Mostrar en orden alfabético ascendente todas las palabras no reservadas que contiene el archivo\n"+
                           "3-Contar cuántas veces aparece en el árbol alguna palabra reservada indicada por el usuario\n"+
                           "4-Contar cuántas veces aparece en el árbol alguna palabra no reservada indicada por el usuario\n"+
                           "5-Indicar cuántas llaves abiertas o cerradas ({, }) le faltan al programa.\n"+
                           "6-Indicar cuántos paréntesis abiertos o cerrados le faltan al programa\n"+
                           "7-Salir"+
                           "\n\nElija una opcion";
    }
    
    public void llenarListaEnlazada(){
        for (int i = 0; i<51;i++) {
            Palabra palabraReservada = baseDeDatos.getPalabraReservada(i);
            lista.agregarPalabraReservada(palabraReservada);
        }
    }
    
    public void empezar() 
    {
        String nombreDelArchivo = interfaz.pedirNombreDeArchivo("Escriba  el nombre del archivo que desea analizar");
        archivo = new File(nombreDelArchivo);
        if (archivo.exists()) {
            interfaz.decirMensaje("El archivo SÍ existe, puede ser analizado");
        }else{
            do {
                interfaz.decirMensaje("El archivo NO existe");
                nombreDelArchivo = interfaz.pedirNombreDeArchivo("Escriba  el nombre del archivo que desea analizar");
                archivo = new File(nombreDelArchivo);
            }while(!archivo.exists()||nombreDelArchivo==null||nombreDelArchivo.equals(""));
        }
        int opcion;
        do {
            opcion = interfaz.pedirOpcion(MENU_OPCIONES_DE_ANALISIS, MENSAJE_OPCIONES);
            switch (opcion) {
                case 0:
                break;
                case 1:
                break;
                case 2:
                break;
                case 3:
                break;
                case 4:
                break;
                case 5:
                break;
            }
        }while(opcion == 0 || opcion == 1 || opcion == 2 || opcion == 3 ||opcion == 4 ||opcion == 5);
        
    }
}