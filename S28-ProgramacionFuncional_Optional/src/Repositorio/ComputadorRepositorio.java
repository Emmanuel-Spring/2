package Repositorio;

import Models.Computador;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class ComputadorRepositorio implements Repositorio<Computador>{

    private List<Computador> datasource;

    public ComputadorRepositorio() {
        datasource = new ArrayList<>();
        datasource.add(new Computador("Asus ROG", "Strix G512"));
        datasource.add(new Computador("Macbook Pro", "MVVK2CI"));
        datasource.add(new Computador("Lenovo", "Lenovo HGD873"));
    }

    @Override
    public Optional<Computador> filtrar(String nombre) {

        return datasource.stream()
                .filter(c -> c.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .findFirst();


       /* for (Computador c: datasource) {
            if (c.getNombre().equalsIgnoreCase(nombre)){
                return Optional.empty();
            }
        } */
    }
}
