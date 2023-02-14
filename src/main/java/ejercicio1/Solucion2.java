package ejercicio1;

import java.sql.SQLOutput;
import java.util.*;

public class Solucion2 {
    //Map<Pais, Set<Trabajador>>

    public static void main(String[] args) {

        Map<Pais, Set<Trabajador>> personal = new TreeMap<>();

        Set<Trabajador> spain, alemania, suiza, francia, portugal;
        spain = new HashSet<>();
        spain.add(new Trabajador("Joaquin", 45));
        spain.add(new Trabajador("Luis", 22));
        spain.add(new Trabajador("Joaquin", 45));
        personal.put(new Pais("España"),spain);

        alemania = new HashSet<>();
        alemania.add(new Trabajador("Joaquin", 43));
        alemania.add(new Trabajador("Carlos", 40));
        personal.put(new Pais("Alemania"),alemania);


        suiza = new HashSet<>();
        suiza.add(new Trabajador("Carmen", 35));
        suiza.add(new Trabajador("Sofía", 31));
        suiza.add(new Trabajador("Roberto", 32));
        personal.put(new Pais("Suiza"),suiza);


        francia = new HashSet<>();
        francia.add(new Trabajador("Jorge", 35));
        francia.add(new Trabajador("Carlos", 38));
        francia.add(new Trabajador("Maria", 39));


        portugal = new HashSet<>();
        portugal.add(new Trabajador("Teresa", 55));
        portugal.add(new Trabajador("Jaime", 23));
        portugal.add(new Trabajador("Pepe", 50));
        personal.put(new Pais("Portugal"),portugal);

        //a)
        System.out.println(personal.keySet());

        //b)
        List<Trabajador> trabajadorList = new LinkedList<>();

        for(Set<Trabajador> trabajadorSet : personal.values())
            trabajadorList.addAll(trabajadorSet);

        trabajadorList.sort(Trabajador::compareTo);
        trabajadorList.sort(Trabajador.SORT_BY_NAME);
        Collections.sort(trabajadorList);

        System.out.println(trabajadorList);

        Set<Trabajador> trabajadorSet = new TreeSet<>();
        for(Set<Trabajador> ts : personal.values())
            trabajadorSet.addAll(ts);

        System.out.println(trabajadorSet);

        //c

        HashMap<Pais,Set<Trabajador>> otroMapPersonal = new HashMap<>();
        for(Pais pais : new TreeSet<>(otroMapPersonal.keySet())){
            System.out.println(pais);
            System.out.println(new TreeSet<>(otroMapPersonal.get(pais)));
        }


    }

}
