package ejercicio2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MemoryPeliculaDAO {


        List<PeliculaTO> peliculas;

        public MemoryPeliculaDAO() {
                this.peliculas = new LinkedList<>();
        }

        public void add(PeliculaTO peliculaTo){
                if(!peliculas.contains(peliculaTo))
                        peliculas.add(peliculaTo);
        }

        public List<PeliculaTO> getDisponibles(){
                return new ArrayList<>(peliculas);
        }

        public void remove(PeliculaTO peliculaTO){
                peliculas.remove(peliculaTO);
        }

}
