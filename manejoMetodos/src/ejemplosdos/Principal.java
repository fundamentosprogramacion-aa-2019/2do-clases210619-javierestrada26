/*

 */
package ejemplosdos;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /* String nombreCiudad= "Arenillas";
        boolean confirmar=Operacion.comprobarCadena(nombreCiudad);
        System.out.printf("%s\n",confirmar);*/
        int limite = 5;
        int contador = 1;
        String ciudad = "";
        while (contador <= limite) {
            System.out.println("Ingrese una ciudad");
            ciudad = entrada.nextLine();
            boolean confirmar = Operacion.comprobarCadena(ciudad);
            if (confirmar == true) {
                System.out.printf("%s\n", ciudad);
                contador = contador + 1;
            } else {
                System.out.println("Valor ingresado no valido");
            }

        }
    }
}
