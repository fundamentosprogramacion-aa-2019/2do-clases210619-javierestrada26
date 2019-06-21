
package ejemplostres;

/**
 *
 * @author javie
 */
public class Operacion {
    
    public static int obtenerSuma(int[]valores){
        int operacion=0;
        for (int i = 0; i < valores.length; i++) {
            operacion= operacion + valores[i];
        }
        return operacion;
    }
}
