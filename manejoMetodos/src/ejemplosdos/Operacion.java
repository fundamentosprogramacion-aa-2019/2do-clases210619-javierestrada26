package ejemplosdos;

public class Operacion {

    public static boolean comprobarCadena(String cadena) {
        boolean bandera = false;
        if (cadena.startsWith("A") || cadena.startsWith("C")
                || cadena.startsWith("D")) {
            bandera = true;
        }
        return bandera;
    }

}
