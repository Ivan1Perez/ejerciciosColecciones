package ejercicioOpos;

public class Bola<T> {

    private int numero;

    public Bola(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Tema{" +
                "numero=" + numero +
                '}';
    }
}
