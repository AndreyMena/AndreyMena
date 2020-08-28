
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
    public Fumigacion()
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
    
    
}   
