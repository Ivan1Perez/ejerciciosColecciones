package ejercicio2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PeliculaTO {

    private static int nextValue = 0;
    private int id;
    private String titulo;

    private List<String> actores;

    private List<String> directores;

    public PeliculaTO(String titulo) {

        this.titulo = titulo;
        actores = new ArrayList<>();
        directores = new ArrayList<>();
        id = ++nextValue;

    }

    public List<String> getActores() {

        return actores;

    }

    public void addActor(String actor) {

        actores.add(actor);

    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof PeliculaTO))
            return false;
        PeliculaTO p = (PeliculaTO) obj;
        return p.id==id;
    }

    @Override
    public String toString() {
        return "PeliculaTO{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}