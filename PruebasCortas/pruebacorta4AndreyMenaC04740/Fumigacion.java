
/**
 * Clase Fumigacion, sirve para eliminar cucarachas.
 * @Autor Andrey Mena Espinoza 
 * @Carne C04740
 * @Fecha 28/8/2020
 */


public class Fumigacion
{
    //Atributos
    private String nombre;
    private double precio;
    
    //Constructores
    public Fumigacion() //Observacion: no era necesario la implementación de este constructor. 
    {
        nombre = "";
        precio = 0;
    
    }
    
    public Fumigacion(String unNombre, double elPrecio) 
    {
        
        nombre = unNombre;
        precio = elPrecio;
    
    
    
    
    
    }    

    //Gets y Sets
    
    public String getNombre()
    
    {
        return nombre;
    
    
    
    
    }
    
    public double getPrecio()
    {
        return precio;
    

    }
    
    public void setNombre(String unNombre)
    {
        nombre = unNombre;
        
    } 
    
    public void setPrecio(double elPrecio)
    {
        precio = elPrecio;
    
    }
    
    //Metodos
    
    public void calcularCosto(double precioTotal)
    
    {
        precio = precio + precioTotal;
    
    
    }
    
    /*
     * -El método calcularCosto está incompleto,el parámetro que se le pasa es incorrecto y el método debía ser tipo "double" ya que
     * tenía que retornar un valor de tipo double. (-20pts)
     * -No se realizó el método toString (-15pts)
     * Nota: 65
    */
    
    
    
}   
