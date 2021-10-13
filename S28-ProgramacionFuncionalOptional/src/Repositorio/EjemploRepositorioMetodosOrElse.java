package Repositorio;

import Models.Computador;

public class EjemploRepositorioMetodosOrElse {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        Computador defecto = new Computador("HP Omen", "LA0002");
        Computador pc = repositorio.filtrar("rog").orElse(valorDefecto());
        System.out.println(pc);

        pc = repositorio.filtrar("macbook pro").orElseGet(EjemploRepositorioMetodosOrElse::valorDefecto);

        System.out.println(pc);

    }

    public static Computador valorDefecto() {
        System.out.println("Obteniendo Valor por defecto!!!!");
        return new Computador("HP OMEN", "LA''1");
    }
}
