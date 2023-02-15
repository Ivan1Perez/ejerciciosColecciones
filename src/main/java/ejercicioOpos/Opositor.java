package ejercicioOpos;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Opositor {

    //Conjunto de bolas
    //Que diga si se sabe el tema o no

    private Set<Bola<Opositor>> temas;

    public Opositor() {
        temas = new HashSet<>();

        for(int i = 1 ; i <= 5 ; i++)
            temas.add(new Bola<>(random()));
    }

    public int random(){
        int numero;

        numero = ((int)(Math.random()*(80)+1));

        return numero;
    }

    @Override
    public String toString() {
        return "Opositor{" +temas + '}';
    }
}
