package teoria;
import java.util.Arrays;

/** Sección 12: Arreglos
 * @video 98 Ejemplo de un arreglo Iterando un arreglo mediante un FOR Inverso
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 14/10/2021/1.0
 * @see <a href = "" />  </a>
 */

public class Video98_EjemploArreglosForInverso {
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

        System.out.println("\n\n\n");   // Triple salto de línea
        System.out.println(" *************   Usando FOR   *************");
        for (int i = 0; i < total; i++) {
            System.out.println("para índice " + i + " : " + productos[i]);
        }


        System.out.println("\n\n\n");   // Triple salto de línea
        System.out.println(" *************   Usando FOR Inverso  *************");
        for (int i = 0; i < total; i++) {
            System.out.println("Para i =  " + (total - 1 - i) + " valor:   " + productos[total - 1 - i]);
        }


        System.out.println("\n\n\n");   // Triple salto de línea
        System.out.println(" *************   Usando FOR Inverso 2.0 *************");
        for (int i = 0; i < total; i--) {
            System.out.println("Para i =  " + (total - 1 - i) + " valor:   " + productos[total - 1 - i]);
        }



    }
}
