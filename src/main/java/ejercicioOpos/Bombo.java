package ejercicioOpos;

import java.util.*;

public class Bombo {

    //Coleccion de bolas
    //Conjunto

    private Set<Bola<Bombo>> temas;

    public Bombo() {
        temas = new LinkedHashSet<>();

        for(int i = 1 ; i <= 80 ; i++){
            temas.add(new Bola<>(i));
        }
    }

    public Bola<Bombo> getRandomBola(){
        List<Bola<Bombo>> temasList = new ArrayList<>(temas);
        Collections.shuffle(temasList);
        Bola<Bombo> bola = temasList.get(0);
        temas.remove(temasList.get(0));


        return bola;
    }

    @Override
    public String toString() {
        return "Bombo{" + temas +'}';
    }
}
