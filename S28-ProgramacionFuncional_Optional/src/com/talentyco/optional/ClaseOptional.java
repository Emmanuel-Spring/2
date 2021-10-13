package com.talentyco.optional;

import java.util.Optional;

/** Clase Optional se agrega en Java 8
 *
 *
 */

public class ClaseOptional {
    public static void main(String[] args) {

        String nombre = "Emmanuel";
        Optional<String> opt = Optional.of(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        if (opt.isPresent()) {
            System.out.println("Hola " + opt.get());
        }

        System.out.println(opt.isEmpty());





    }
}
