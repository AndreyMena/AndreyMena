import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Dimension;
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
    private final String[] MENU_OPCIONES_DE_ANALISIS = {"1","2","3","4","5","6","7-Salir"};
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
        arbolPalabrasReservadas = new Arbol();
        arbolPalabrasNormales = new Arbol();
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
        String nombreDelArchivo;
        do{
            nombreDelArchivo = interfaz.pedirMensaje("Escriba  el nombre del archivo que desea analizar");
        }while(nombreDelArchivo==null||nombreDelArchivo.equals(""));
        archivo = new File(nombreDelArchivo);
        if (archivo.exists()) {
            interfaz.decirMensaje("El archivo SÍ existe, puede ser analizado");
        }else{
            do {
                interfaz.decirMensaje("El archivo NO existe");
                do{
                    nombreDelArchivo = interfaz.pedirMensaje("Escriba  el nombre del archivo que desea analizar");
                }while(nombreDelArchivo==null||nombreDelArchivo.equals(""));
                archivo = new File(nombreDelArchivo);
            }while(!archivo.exists());
        }
        boolean resultado = this.llenarArboles();
        if (resultado==false) {
            do {
                interfaz.decirMensaje("Digite el nombre de otro archivo, que si pueda ser analizado.");
                nombreDelArchivo = interfaz.pedirMensaje("Escriba  el nombre del archivo que desea analizar");
                archivo = new File(nombreDelArchivo);
            }while(!archivo.exists()||nombreDelArchivo==null||nombreDelArchivo.equals(""));
            arbolPalabrasReservadas = new Arbol();
            arbolPalabrasNormales = new Arbol();
            resultado = this.llenarArboles();
        }
        int opcion;
        String hilera = "";
        do {
            hilera = "";
            opcion = interfaz.pedirOpcion(MENU_OPCIONES_DE_ANALISIS, MENSAJE_OPCIONES);
            switch (opcion) {
                case 0:
                hilera += "Estas son las palabras reservadas \ndel archivo ordenadas alfabeticamente:\n\n";
                hilera += arbolPalabrasReservadas.toString(arbolPalabrasReservadas);                
                JTextArea areaTexto = new JTextArea(hilera);
                JScrollPane panelScroll = new JScrollPane(areaTexto);
                panelScroll.setPreferredSize(new Dimension(400,500));
                interfaz.mostrarVentanaJScrollPane(panelScroll);
                break;
                
                case 1:
                hilera += "Estas son las palabras no reservadas \ndel archivo ordenadas alfabeticamente:\n\n";
                hilera += arbolPalabrasNormales.toString(arbolPalabrasNormales);
                areaTexto = new JTextArea(hilera);
                panelScroll = new JScrollPane(areaTexto);
                panelScroll.setPreferredSize(new Dimension(400,500));
                interfaz.mostrarVentanaJScrollPane(panelScroll);
                break;
                
                case 2:
                String palabraReservada = interfaz.pedirMensaje("Escriba la palabra reservada que desea que \nel programa cuente.");
                while (palabraReservada==null||palabraReservada=="") {
                    palabraReservada = interfaz.pedirMensaje("Escriba la palabra reservada que desea que \nel programa cuente.");
                }
                Palabra laPalabraR = new Palabra(palabraReservada);
                int cantidadDePalabraReservada = arbolPalabrasReservadas.contarPalabra(laPalabraR);
                interfaz.decirMensaje("El programa a contado la palabra "+palabraReservada+" "+cantidadDePalabraReservada+" veces.\n\nNota: Si no se encontro la palabra, puede que no este en este Arbol ó\nno existe en el archivo.");
                break;
                
                case 3:
                String palabraNormal = interfaz.pedirMensaje("Escriba la palabra NO reservada que desea que \nel programa cuente.");
                while (palabraNormal==null||palabraNormal=="") {
                    palabraNormal = interfaz.pedirMensaje("Escriba la palabra NO reservada que desea que \nel programa cuente.");
                }
                Palabra laPalabraN = new Palabra(palabraNormal);
                int cantidadDePalabraNormal = arbolPalabrasNormales.contarPalabra(laPalabraN);
                interfaz.decirMensaje("El programa a contado la palabra "+palabraNormal+" "+cantidadDePalabraNormal+" veces.\n\nNota: Si no se encontro la palabra, puede que no este en este Arbol ó\nno existe en el archivo.");
                break;
                
                case 4:
                Palabra llaveAbierta = new Palabra("{");
                Palabra llaveCerrada = new Palabra("}");
                int cantidadDeLlavesAbiertas = arbolPalabrasReservadas.contarPalabra(llaveAbierta);
                int cantidadDeLlavesCerradas = arbolPalabrasReservadas.contarPalabra(llaveCerrada);
                int llavesFaltantes = 0;
                if (cantidadDeLlavesAbiertas==cantidadDeLlavesCerradas) {
                    interfaz.decirMensaje("Al programa no le faltan llaves.");
                }else{
                    if (cantidadDeLlavesAbiertas>cantidadDeLlavesCerradas) {
                        llavesFaltantes = cantidadDeLlavesAbiertas-cantidadDeLlavesCerradas;
                        interfaz.decirMensaje("Al programa le faltan "+llavesFaltantes+" llaves cerradas");
                    }else{
                        if (cantidadDeLlavesAbiertas<cantidadDeLlavesCerradas) {
                            llavesFaltantes = cantidadDeLlavesCerradas-cantidadDeLlavesAbiertas;
                            interfaz.decirMensaje("Al programa le faltan "+llavesFaltantes+" llaves abiertas");
                        }
                    }
                }
                break;
                case 5:
                Palabra parentesisAbierto = new Palabra("(");
                Palabra parentesisCerrado = new Palabra(")");
                int cantidadDeParentesisAbiertos = arbolPalabrasReservadas.contarPalabra(parentesisAbierto);
                int cantidadDeParentesisCerrados = arbolPalabrasReservadas.contarPalabra(parentesisCerrado);
                int parentesisFaltantes = 0;
                if (cantidadDeParentesisAbiertos==cantidadDeParentesisCerrados) {
                    interfaz.decirMensaje("Al programa no le faltan parentesis.");
                }else{
                    if (cantidadDeParentesisAbiertos>cantidadDeParentesisCerrados) {
                        parentesisFaltantes = cantidadDeParentesisAbiertos-cantidadDeParentesisCerrados;
                        interfaz.decirMensaje("Al programa le faltan "+parentesisFaltantes+" parentesis cerrados");
                    }else{
                        if (cantidadDeParentesisAbiertos<cantidadDeParentesisCerrados) {
                            llavesFaltantes = cantidadDeParentesisCerrados-cantidadDeParentesisAbiertos;
                            interfaz.decirMensaje("Al programa le faltan "+parentesisFaltantes+" parentesis abiertos");
                        }
                    }
                }
                break;
            }
        }while(opcion == 0 || opcion == 1 || opcion == 2 || opcion == 3 ||opcion == 4 ||opcion == 5);
        
    }
    
    public boolean llenarArboles() {
        Scanner lector;
        boolean resultado = false;
        try {
            lector = new Scanner(archivo);
            String textoCompleto = "";
            String texto = "";
            while (lector.hasNext()) {
                texto = lector.next();
                Palabra palabra = new Palabra(texto);
                if (texto.charAt(0)=='/'&&texto.charAt(1)=='/'){
                    texto = lector.nextLine();
                }else{
                    if (texto.equals("/**")) {
                        do {
                            texto = lector.next();
                        }while(!texto.equals("*/"));
                    }else{
                        if (texto.equals("/*")) {
                            do {
                                texto = lector.next();
                            }while(!texto.equals("*/"));
                        }else{
                            if (!lista.buscar(texto).getPalabra().equals("")) {
                                arbolPalabrasReservadas.agregar(palabra);
                            }else{
                                arbolPalabrasNormales.agregar(palabra);
                            }
                        }
                    }
                }
            }
            lector.close();
            interfaz.decirMensaje("Se ha completado el analisis del archivo.");
            resultado = true;
        }catch(IOException error) {
            interfaz.decirMensaje("Ha ocurrido un error en la lectura del archivo");
            resultado = false;
        }
        return resultado;
    }
}