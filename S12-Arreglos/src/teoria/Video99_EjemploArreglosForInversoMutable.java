package teoria;
import java.util.Arrays;

/** Sección 12: Arreglos
 * @video 98 Ejemplo de un arreglo Iterando un arreglo mediante un FOR Inverso
 *
 * @author Emmanuel Nieto Muñoz
 * @version: 14/10/2021/1.0
 * @see <a href = "" />  </a>
 */

public class Video99_EjemploArreglosForInversoMutable {
    public static void main(String[] args) {

        String [] productos = {"Lenovo kKJGH68574", "Phillips HD 58``", "LG Alta HD for Revolution",
                "ASUS Notebook", "LG pantalla curva 574445", "IPhone 13",
                "Samsuing S12", "Huawei GP12 7,8º"};

        int total = productos.length;

        System.out.println("\n");

        Arrays.sort(productos);  // Ayuda a ordenar alfabeticamente los datos

        System.out.println("\n\n\n");   // Triple salto de línea
        System.out.println(" *************   Usando FOR   *************");
        for (int i = 0; i < total; i++) {
            System.out.println("para índice " + i + " : " + productos[i]);
        }




        System.out.println("\n\n\n");   // Triple salto de línea
        for (int i = 0; i < total; i++) {
            String actual = productos[i];
            String inverso = productos[total - 1 - i];
            productos[i] = inverso;
            productos[total - 1 - i] = actual;
        }


        System.out.println("\n\n\n");   // Triple salto de línea
        System.out.println(" *************   Usando FOR*************");
        for (int i = total - 1; i < total; i++) {
            System.out.println("Para i =  " + i + " valor:   " + productos[i]);
        }

    }
}
