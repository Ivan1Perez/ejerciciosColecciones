package ejercicio2;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        MemoryPeliculaDAO mpdao = new MemoryPeliculaDAO();

        mpdao.add(new PeliculaTO("Terminator"));
        mpdao.add(new PeliculaTO("Terminator II"));
        mpdao.add(new PeliculaTO("Terminator III"));
        mpdao.add(new PeliculaTO("Terminator IV"));


    }

}
