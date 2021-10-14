package teoria;
import java.util.Arrays;

/** Sección 12: Arreglos
 * @video 97 Ejemplo de un arreglo Iterando un arreglo mediante un FOR
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 14/10/2021/1.0
 * @see <a href = "" />  </a>
 */

public class Video97_EjemploArreglosFor {
    public static void main(String[] args) {

        String [] productos = new String[8];

        int total = productos.length;

        System.out.println("\n");
        productos [0] = "Lenovo kKJGH68574";
        productos [1] = "Phillips HD 58``";
        productos [2] = "LG Alta HD for Revolution";
        productos [3] = "ASUS Notebook";
        productos [4] = "LG pantalla curva 574445";
        productos [5] = "IPhone 13";
        productos [6] = "Samsuing S12";
        productos [7] = "Huawei GP12 7,8º";

        Arrays.sort(productos);  // Ayuda a ordenar alfabeticamente los datos

        System.out.println("\n\n\n");
        System.out.println(" *************   Usando FOR   *************");
        for (int i = 0; i < total; i++) {
            System.out.println("para índice " + i + " : " + productos[i]);
        }


        System.out.println("\n\n\n");   // Triple salto de línea
        System.out.println(" *************   Usando FOREACH   *************");
        for (String prod: productos) {
            System.out.println("prod = " + prod);
        }

        System.out.println("\n\n\n");  // Triple salto de línea
        System.out.println(" *************   Usando WHILE   *************");
        int i = 0;
        while (i < total) {
            System.out.println("Para Índice :   " + productos[i]);
            i++;
        }


        System.out.println("\n\n\n");   // Triple salto de línea
        System.out.println(" *************   Usando DO WHILE   *************");
        int j = 0;
        do {
            System.out.println("Para Índice :   " + j + "  :  " + productos[j]);
            j++;
        } while (j < total);



        System.out.println("\n\n\n");   // Triple salto de línea
        System.out.println(" *************   Tabla de Multiplicar   *************");

        int [] numeros = new int[100];
        int totalNumeros = numeros.length;

        for (int k = 1; k < totalNumeros; k++) {
            numeros[k] = k * 3;
        }

        for (int k = 1; k < totalNumeros; k++) {
            System.out.println("numeros = " + numeros[k]);
        }



        /** Error ArrayIndexOutOfBoundsException:
         *  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
         *  Esto sucede cuando sobrepasa la cantidad de Arreglos declarados
         */



    }
}
