
package ejemploscuatro;

/**
 *
 * @author javie
 */
public class Principal {
    public static void main(String[] args) {
        String []personas = {"Ashley Cooper", 
            "Christopher Gutierrez", "Rodney Thomas"};
        double []costo_telefono_enero = {20.2,70.2,50.9};
        double []costo_telefono_febrero = {10.2,30.2,120.9};
        String cadena="";
        for(int i =0;i<costo_telefono_enero.length;i++){
            double resultado = Consumo.obtenerValorConsumo(
                    costo_telefono_enero[i], costo_telefono_febrero[i]);
            cadena = String.format("%s%s%.2f\n",
                    cadena, personas[i]
                    ,resultado );
        }
        //double resultado = Consumo.ObtenerValorConsumo(costo_telefono_enero, costo_telefono_febrero);
        System.out.printf("%s", cadena);
    }
}
