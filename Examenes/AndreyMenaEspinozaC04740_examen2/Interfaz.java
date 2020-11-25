import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Interfaz extends JOptionPane 
{
    public Interfaz() {
    }
  
    public void decirMensaje(String elMensaje) 
    {
        this.showMessageDialog(null, elMensaje);
    }

    public String pedirHilera(String elMensaje)
    {
        String respuesta= this.showInputDialog(null, elMensaje);
        return respuesta;
    }

    public int pedirEntero(String elMensaje)
    {
        int numero;
        String respuesta="";
        while ((respuesta == null) || (respuesta.equals(""))) {
            respuesta = this.showInputDialog(null, elMensaje);
        }
        numero = Integer.parseInt(respuesta);
        return numero;
    }
}