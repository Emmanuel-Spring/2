package Repositorio;

import Models.Computador;

import java.util.Optional;

public interface Repositorio <T>{

    Optional<Computador> filtrar (String nombre);

}
