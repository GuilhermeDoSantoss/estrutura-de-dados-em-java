package teste.fila;

import estruturadedados.filas.Fila;

public class AulaFila21 {
    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<Integer>();

        fila.enfileira(1);
        fila.enfileira(2);

        System.out.println(fila.espiar());

        System.out.println(fila.toString());
    }
}
