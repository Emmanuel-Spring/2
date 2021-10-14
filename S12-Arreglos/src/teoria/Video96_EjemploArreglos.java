package teoria;

import java.util.Arrays;

/** Sección 12: Arreglos
 * @video 96 Ejemplo de un arreglo
 * @author Emmanuel Nieto Muñoz
 * @version: 14/10/2021/1.0
 * @see <a href = "" />  </a>
 */

public class Video96_EjemploArreglos {
    public static void main(String[] args) {

        String [] productos = new String[8];
        productos [0] = "Lenovo kKJGH68574";
        productos [1] = "Phillips HD 58``";
        productos [2] = "LG Alta HD for Revolution";
        productos [3] = "ASUS Notebook";
        productos [4] = "LG pantalla curva 574445";
        productos [5] = "IPhone 13";
        productos [6] = "Samsuing S12";
        productos [7] = "Huawei GP12 7,8º";

        Arrays.sort(productos);  // Ayuda a ordenar alfabeticamente los datos

        String prod1 = productos [0];
        String prod2 = productos [1];
        String prod3 = productos [2];
        String prod4 = productos [3];
        String prod5 = productos [4];
        String prod6 = productos [5];
        String prod7 = productos [6];
        String prod8 = productos [7];

        System.out.println("\n\nproductos [0] :  " + prod1);
        System.out.println("productos [1] :  " + prod2);
        System.out.println("productos [2] :  " + prod3);
        System.out.println("productos [3] :  " + prod4);
        System.out.println("productos [4] :  " + prod5);
        System.out.println("productos [5] :  " + prod6);
        System.out.println("productos [6] :  " + prod7);
        System.out.println("productos [7] :  " + prod8);


        /*System.out.println("\n\nproductos [0] :  " + productos[0]);
        System.out.println("productos [1] :  " + productos[1]);
        System.out.println("productos [2] :  " + productos[2]);
        System.out.println("productos [3] :  " + productos[3]);
        System.out.println("productos [4] :  " + productos[4]);
        System.out.println("productos [5] :  " + productos[5]);
        System.out.println("productos [6] :  " + productos[6]);
        System.out.println("productos [7] :  " + productos[7]);*/

        int [] numeros = new int[4];

        numeros [0] = 1;
        numeros [1] = Integer.valueOf("2");
        numeros [2] = (int) -33L;
        numeros [3] = 645;
        // numeros [4] = 5; Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4

        /** Error:
         *  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
         *  Esto sucede cuando sobrepasa la cantidad de Arreglos declarados
         */

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length -1];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }
}
