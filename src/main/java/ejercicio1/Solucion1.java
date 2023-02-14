package ejercicio1;

import java.util.*;

public class Solucion1 {

    public static void main(String[] args) {

//         Map<Pais,Set<Trabajador>> personal = new HashMap<>();
        Map<Trabajador, Pais> personal = new HashMap<>();

        personal.put(new Trabajador("Joaquin", 45), new Pais("España"));
        personal.put(new Trabajador("Joaquin", 45), new Pais("España"));
        personal.put(new Trabajador("Luis", 22), new Pais("España"));
        personal.put(new Trabajador("Carlos", 40), new Pais("Alemania"));
        personal.put(new Trabajador("Carmen", 45), new Pais("Suiza"));
        personal.put(new Trabajador("Pedro", 41), new Pais("Francia"));
        personal.put(new Trabajador("Teresa", 55), new Pais("Portugal"));
        personal.put(new Trabajador("Jaime", 30), new Pais("España"));


        for(Trabajador t : personal.keySet())
            System.out.println(t);

        // a)
        for(Pais pais : new HashSet<>(personal.values()))
            System.out.println(pais);

        // b)
        Set<Trabajador> trabajadores = new TreeSet<>(personal.keySet());
        System.out.println(trabajadores);

        List<Trabajador> t = new ArrayList<>(personal.keySet());
        t.sort(Trabajador.SORT_BY_NAME);


        //c)
        //Map<Trabajador, Pais> -> Map<Pais,Set<Trabajador>>
        //      personal                    aux

        Map<Pais,Set<Trabajador>> aux = new TreeMap<>();
        Pais pais;
        for(Trabajador trabajador : personal.keySet()){
            pais = personal.get(trabajador);

            if(aux.containsKey(pais)){
                aux.get(pais).add(trabajador);
            }else{

                Set<Trabajador> trabajadores1 = new HashSet<>();
                trabajadores1.add(trabajador);
                aux.put(pais, trabajadores1);

            }
        }

        System.out.println();
        System.out.println();
        System.out.println(aux);


        //d) Recorrer todos los trabajadores y mostrar solo aquellos con edad superior a 50 años utilizando un iterador.

         Set<Trabajador> trabajadorSet= personal.keySet();
         List<Trabajador> trabajadorList = new ArrayList<>();
         Iterator<Trabajador> iterator = trabajadorSet.iterator();

         Trabajador trabajador;

         while(iterator.hasNext()){
             trabajador = iterator.next();
             if(trabajador.getEdad()>50)
                 trabajadorList.add(trabajador);
         }

        System.out.println("Trabajadores de más de 50 años: " +
                trabajadorList);


         ///////////////////////
        // Map<Pais,Set<Trabajador>>
        List<Trabajador> trabajadorList2 = new ArrayList<>();
        for(Set<Trabajador> set : aux.values()){
            iterator = set.iterator();
            while(iterator.hasNext()){
                trabajador = iterator.next();
                if(trabajador.getEdad()>50)
                    trabajadorList.add(trabajador);
            }
        }

        System.out.println("Trabajadores de más de 50 años: " +
                trabajadorList2);



    }

}
