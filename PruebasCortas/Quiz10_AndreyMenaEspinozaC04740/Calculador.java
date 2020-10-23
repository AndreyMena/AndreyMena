
/**
 * Clase Calculador.
 * 
 * @author (AndreyMenaEspinoza C04740) 
 * @version (1.1)
 */
public class Calculador
{
    /**
     * Constructor for objects of class Calculador
     */
    public int Calculador(int[] laLista,int i)
    {
        int[] lista = laLista;
        int valor = 0;  
        int subSolucion;
        if (lista[i] <= 0 && i < lista.length) {
            return 0;
        }else{
            if (lista[i] > 0 && i < lista.length) {
                subSolucion= Calculador(lista,i+1);
                valor = subSolucion+lista[i]^2;                
            }
            return valor;
        }

    }
}
