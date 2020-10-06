import javax.swing.JOptionPane;
/**
 * Clase para la interacción con el usuario.
 * Programación 1
 * Profesores: V.Lara / M.Murillo
 */

public class Interfaz extends JOptionPane
{
    private final String TITULO;    
    /**
     * Le asocia al objeto un título y una imagen que serán utilizados en las ventanas de interacción.
     * Supone que el archivo con la imagen se encuentra en la misma carpeta del código fuente.
     */
    public Interfaz(String elTitulo)
    {
        TITULO = elTitulo;
    }
    
    public void decirMensaje(String elMensaje)
    {
        this.showMessageDialog(null, elMensaje, TITULO, PLAIN_MESSAGE);
    }    
    
    public int pedirOpcion(String[] lasOpciones, String elMensaje)
    {
        int resultado;
        resultado = this.showOptionDialog(null, elMensaje, TITULO, DEFAULT_OPTION, PLAIN_MESSAGE, null, lasOpciones, null);
        return resultado;
    }
    
    public String pedirHilera(String elMensaje)
    {
        String resultado;
        resultado = this.showInputDialog(null, elMensaje, TITULO, PLAIN_MESSAGE);
        return resultado;
    }
}